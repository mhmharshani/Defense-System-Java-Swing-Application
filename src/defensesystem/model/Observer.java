
package defensesystem.model;

public interface Observer {
        
    public void updateArea(boolean state);
    
    public void updateMessageBox(String msg);
    
    public void sendMessage(String msg);
    
    public void updatePosition(int value);
    
    public int[] updateCount();
    
}
