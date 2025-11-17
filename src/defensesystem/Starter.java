
package defensesystem;

import defensesystem.controller.Observable;
import defensesystem.view.MainController;
import defensesystem.view.defenseunits.Helicopter;
import defensesystem.view.defenseunits.Submarine;
import defensesystem.view.defenseunits.Tank;

public class Starter {
    
    public static void main(String[] args) {
        Observable ob = new Observable();
        MainController mainController = new MainController(ob);
        ob.addObserver(new Helicopter(mainController,1));
        ob.addObserver(new Submarine(mainController,2));
        ob.addObserver(new Tank(mainController,3));
//        ob.setStrength(0);
    }
    
}
