
package defensesystem.model;

import defensesystem.util.Strength;

public interface Observer {
    
    public void update(Strength s);
    
    public void updateArea(boolean state);
    
    public void updateMessageBox(String msg);
    
    public void sendMessage(String msg);
    
    public void updatePosition(int value);
    
    public void sendStrength();
    
    public int[] updateCount();
    
}
