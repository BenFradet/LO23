/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.sudoku.comm.generated;

@SuppressWarnings("all")
/** Data retrieval service */
@org.apache.avro.specific.AvroGenerated
public interface DataRetriever {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"DataRetriever\",\"namespace\":\"com.sudoku.comm.generated\",\"doc\":\"Data retrieval service\",\"types\":[{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"pseudo\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"salt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"birthDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"profilePicturePath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"createDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"updateDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ipAddress\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Comment\",\"fields\":[{\"name\":\"author\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"comment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"grade\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"Grid\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"difficulty\",\"type\":\"int\"},{\"name\":\"published\",\"type\":\"boolean\"},{\"name\":\"comments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Comment\"}]},{\"name\":\"tags\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"name\":\"matrix\",\"type\":[\"null\",{\"type\":\"array\",\"items\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}]}]},{\"name\":\"createUser\",\"type\":\"User\"},{\"name\":\"createDate\",\"type\":\"int\"},{\"name\":\"updateDate\",\"type\":\"int\"}]}],\"messages\":{\"getGrids\":{\"doc\":\"Retrieve all the grids of the specified ip\",\"request\":[{\"name\":\"ip\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"array\",\"items\":\"Grid\"}},\"getProfile\":{\"doc\":\"Retrieve profile information of the specified ip\",\"request\":[{\"name\":\"ip\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"User\"}}}");
  /** Retrieve all the grids of the specified ip */
  java.util.List<com.sudoku.comm.generated.Grid> getGrids(java.lang.String ip) throws org.apache.avro.AvroRemoteException;
  /** Retrieve profile information of the specified ip */
  com.sudoku.comm.generated.User getProfile(java.lang.String ip) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  /** Data retrieval service */
  public interface Callback extends DataRetriever {
    public static final org.apache.avro.Protocol PROTOCOL = com.sudoku.comm.generated.DataRetriever.PROTOCOL;
    /** Retrieve all the grids of the specified ip */
    void getGrids(java.lang.String ip, org.apache.avro.ipc.Callback<java.util.List<com.sudoku.comm.generated.Grid>> callback) throws java.io.IOException;
    /** Retrieve profile information of the specified ip */
    void getProfile(java.lang.String ip, org.apache.avro.ipc.Callback<com.sudoku.comm.generated.User> callback) throws java.io.IOException;
  }
}