
package defensesystem.util;


public enum Strength {
    LOW(1,30),MEDIUM(31,60),HIGH(61,80),STRONG(81,100),CLOSED(0);
    
    private int upperLimit;
    private int lowerLimit;
    private int initStrength;
    
    Strength(){}
    
    Strength(int initStrength){
        this.initStrength = initStrength;
    }
    
    Strength(int lowerLimit, int upperLimit){
        this.upperLimit=upperLimit;
        this.lowerLimit=lowerLimit;
    }

    //    -------------------------------Getters--------------------------------
    public int getUpperLimit() {
        return upperLimit;
    }
    
    public int getLowerLimit() {
        return lowerLimit;
    }
    
    public int getInitStrength() {
        return initStrength;
    }
    
    //    -------------------------------Setters--------------------------------
    
    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
    
    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }
    
    public void setInitStrength(int initStrength) {
        this.initStrength = initStrength;
    }

    
}
