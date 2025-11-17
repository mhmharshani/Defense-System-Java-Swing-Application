/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem.controller;

import defensesystem.model.Observer;
import defensesystem.util.Strength;
import java.util.ArrayList;

/**
 *
 * @author GLOBAL TRADINGS
 */
public class Observable {
    
    private ArrayList<Observer> observerList;
    private Strength initStrength;
    
    public Observable(){
       observerList = new ArrayList<>();
    }
    
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
    
    public void setStrength(Strength initStrength){
        this.initStrength = initStrength;
        notifyObservers();
    }
    
    public void notifyObservers(){
        for(Observer ob:observerList){
            ob.update(initStrength);
        }
        
    }

    public void notifyAreaClear(boolean state) {
        for(Observer ob:observerList){
            ob.updateArea(state);
        }
    }
    
    public void notifyMsgRecieved(){
        for(Observer ob:observerList){
            ob.updateMessageBox();
        }
    }
 
    
    
}
