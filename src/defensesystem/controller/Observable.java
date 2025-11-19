/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem.controller;

import defensesystem.model.Observer;
import defensesystem.model.SuperDefence;
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
    
    public void notifyMsgRecieved(String msg, int index){
//        String reciever="";
//        switch(index){
//            case 1:reciever="Helicopter";break;
//            case 2:reciever="Tank";break;
//            case 3:reciever="Submarine";break;
//            case -1:reciever="All";break;
//        }
        for(Observer ob:observerList){
            SuperDefence sDefence=(SuperDefence)ob;
            if(index!=-1){
                if(sDefence.code==index){
                    ob.updateMessageBox(msg);
                }
            }
            else{
                ob.updateMessageBox(msg);
            }
                        
        }
    }

    public void notifyPosition(int value) {
        for(Observer ob:observerList){
            ob.updatePosition(value);
        }
    }

    public int[] notifyObserversToSendCount(int index){
        int[] countArray = new int[3];
        for(Observer ob:observerList){
            SuperDefence sDefence=(SuperDefence)ob;
            if(index!=0){
                if(sDefence.code==index){
                    countArray = ob.updateCount();
                }
            }
                                   
        }
        return countArray;
    }   
    
}
