
package defensesystem.controller;

import defensesystem.model.Observer;
import defensesystem.model.SuperDefence;
import java.util.ArrayList;


public class Observable {
    
    private ArrayList<Observer> observerList;
        
    public Observable(){
       observerList = new ArrayList<>();
    }
    
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
     
    public void notifyAreaClear(boolean state) {
        for(Observer ob:observerList){
            ob.updateArea(state);
        }
    }
    
    public void notifyMsgRecieved(String msg, int index){

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
