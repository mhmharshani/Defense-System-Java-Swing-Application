
package defensesystem.util;


public enum Strength {
    LOW(1,25),MEDIUM(26,75),HIGH(76,90),STRONG(91,100),CLOSED();
    
    private int upperLimit;
    private int lowerLimit;
    
    Strength(){}
    
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
    
    //    -------------------------------Setters--------------------------------
    
    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
    
    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    
}
