/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudoku.ihm_grid.ihm_popus;

import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

/**
 * @class IHM_PopupsList is a graphical object which is unique.
 * The design pattern singleton is used on this object.
 * @author Marc-Antoine
 */
public class IHM_PopupsList extends VBox implements EventHandler<IHM_PopupCloseRequestEvent>{
    private static IHM_PopupsList instance = null;
    
    protected static final int titleFontSize = 12;
    protected static final int textFontSize = 10;
    protected double popupHeight;
    protected double popupWidth;
    protected int nbMaxPopus;
    protected ArrayList<IHM_Popup> popups = new ArrayList<IHM_Popup>();
    
    /**
     * @class IHM_PopupsList constructor
     * Use IHM_PopupsList.getInstance() instead.
     */
    private IHM_PopupsList(double width, double height, int nbMaxPopus){
        //set the maximum number of pop-ups that the list can hold
        this.nbMaxPopus = nbMaxPopus;
        
        //define the height of each pop-up. -1 is here because we add a line of one pixel above each pop-up as separator
        popupHeight = height / (double)nbMaxPopus - 1;
        
        //define the width of each pop-up which is the same as the width defined by the user for the entire list
        popupWidth = width;
        
        //set max size of the graphical object list
        setMaxSize(width, height);
    }
    
    /**
     * @class IHM_PopupsList constructor
     * This list is a graphic object which is unique that why you can't instantiate an instance by this way.
     * Use IHM_PopupsList.getInstance() instead.
     * 
     * @param height is the max height of this graphical object
     * @param width is the max width of this graphical object
     * @param nbMaxPopus is the max number of popup shown in the list. It will determine the height of each pop-ups
     * @return an instance of IHM_PopupsList. If this is the first call of getInstance, the instance will be create and returned.
     */
    public static IHM_PopupsList getInstance(double height, double width, int nbMaxPopus){
        //If the instance doesn't exist, we create it
        if(instance == null)
            instance = new IHM_PopupsList(height, width, nbMaxPopus);
        
        //return the instance created
        return instance;
    }
    
    /**
     * Used to create a new popups with parameters given and return it to the user.
     * The popup is automatically added to the list.
     *
     * @param title is the pop-up's title
     * @param text is the pop-up's body text
     * @param delay is the pop-up's showing delay
     * @return the instance of the popup created
     */
    public IHM_Popup addPopup(String title, String text, int delay){
        //Create a new pop-up
        IHM_Popup popup = new IHM_Popup(title, titleFontSize, text, textFontSize, delay);
        
        //fix max size of the pop-up created
        popup.setMaxSize(popupWidth, popupHeight);
        
        //set this list as a listener of a close request event on the pop-up
        popup.addEventHandler(IHM_PopupCloseRequestEvent.POPUP_CLOSEREQUEST, this);
        
        //add the popup to the pop-ups list
        popups.add(popup);
        
        //If there is no enough room, the oldest popup
        if(getChildren().size() >= nbMaxPopus)
            ((IHM_Popup)getChildren().get(getChildren().size() - 2)).requestToClose();
        
        //create a line as a separator between 2 pop-up in the list
        Line line = new Line(0, 0, popupWidth, 0);
        
        //add the pop-up and the line-separator to the layout on the top of the list 
        getChildren().add(0, popup);
        getChildren().add(1, line);
        
        return popup;
    }
    
    /**
     * Cannot be called directly from this class.
     * Should call requestToClose() method of IHM_Popup object instead.
     * @param popup is the popup which will be deleted from the list
     */
    private void deletePopup(IHM_Popup popup){
        //get the index of the popup in the layout
        int index = getChildren().indexOf(popup);
        
        //remove the popup and it's above line-separator from the layout
        getChildren().remove(index, index + 2);
        
        //remove popup from the list
        popups.remove(popup);
    }

    /**
     * Method which handle a IHM_PopupCloseRequestEvent event.
     * When received, it calls the method to remove the popup attached.
     * @param t is the event wich holds the popup to remove
     */
    @Override
    public void handle(IHM_PopupCloseRequestEvent t) {
        if(t.isConsumed())
            return;
        
        if(t.getEventType() == IHM_PopupCloseRequestEvent.POPUP_CLOSEREQUEST){
            t.consume();
            deletePopup(t.popup);
        }
    }
}
