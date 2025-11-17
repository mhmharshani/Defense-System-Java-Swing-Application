
package defensesystem.model;

import defensesystem.util.Strength;

public interface Observer {
    
    public void update(Strength s);
    
    public void updateArea(boolean state);
    
    public void updateMessageBox();
    
    public void sendMessage();
    
    public void sendStrength();
    
}
