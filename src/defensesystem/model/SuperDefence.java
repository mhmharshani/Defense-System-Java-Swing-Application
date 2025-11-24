
package defensesystem.model;

public class SuperDefence extends javax.swing.JFrame {
    
    public int code;
    public int energyLevel;
    public int soldierCount;
    public int ammoCount;

    public SuperDefence(){
    }

    public SuperDefence(int code){
        this.code = code;
    }

    public SuperDefence(int code, int energyLevel, int soldierCount, int ammoCount){
        this.code = code;
        this.energyLevel = energyLevel;
        this.soldierCount = soldierCount;
        this.ammoCount = ammoCount;
    }   
    
}
