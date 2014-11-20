package com.sudoku.comm;

import com.sudoku.comm.generated.Message;
import com.sudoku.comm.generated.NodeExplorer;

import com.sudoku.util.CollectionUtil;
import org.apache.avro.AvroRemoteException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.*;
import java.util.Enumeration;

/**
 * Created by ben on 19/11/14.
 */
public class NodeExplorerImpl implements NodeExplorer {
  private Logger logger = LoggerFactory.getLogger(NodeExplorerImpl.class);

  @Override
  public Message discoverNode(Message sentMessage) throws AvroRemoteException {
    String localIp = null;
    try {
      localIp = getLocalInetAddress().getHostAddress();
    } catch (UnknownHostException ex) {
      logger.error(ex.toString());
    }

    CommunicationManager.setConnectedIps(CollectionUtil.union(
        CommunicationManager.getConnectedIps(), sentMessage.getListIps()));
    CommunicationManager.getConnectedIps().remove(localIp);
    return Message.newBuilder()
        .setListIps(CommunicationManager.getConnectedIps())
        .setLogin(CommunicationManager.LOGIN)
        .setUuid(CommunicationManager.UUID)
        .build();
  }

  @Override
  public Void disconnect(String ip) throws AvroRemoteException {
    CommunicationManager.getConnectedIps().remove(ip);
    return null;
  }

  public InetAddress getLocalInetAddress() throws UnknownHostException {
    try {
      InetAddress candidateAddress = null;

      for (Enumeration<NetworkInterface> networkInterfaces =
               NetworkInterface.getNetworkInterfaces();
           networkInterfaces.hasMoreElements();) {

        NetworkInterface networkInterface =
            (NetworkInterface) networkInterfaces.nextElement();
        for (Enumeration<InetAddress> inetAddresses =
                 networkInterface.getInetAddresses();
            inetAddresses.hasMoreElements();) {

          InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
          if (!inetAddress.isLoopbackAddress()) {
            if (inetAddress.isSiteLocalAddress()) {
              return inetAddress;
            } else if (candidateAddress == null) {
              candidateAddress = inetAddress;
            }
          }
        }
      }

      if (candidateAddress != null) {
        return candidateAddress;
      }

      InetAddress jdkSuppliedAddress = InetAddress.getLocalHost();
      if(jdkSuppliedAddress == null) {
        throw new UnknownHostException("InetAddress.getLocalHost() is null.");
      }
      return jdkSuppliedAddress;
    } catch (Exception ex) {
      logger.error(ex.toString());
      UnknownHostException unknownHostException =
          new UnknownHostException("Failed to determine IP: " + ex);
      unknownHostException.initCause(ex);
      throw unknownHostException;
    }
  }
}
