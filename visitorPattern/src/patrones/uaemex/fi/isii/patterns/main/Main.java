
package patrones.uaemex.fi.isii.patterns.main;

import patrones.uaemex.fi.isii.patterns.visitor.CelularNetwork;
import patrones.uaemex.fi.isii.patterns.visitor.MiniTruck;
import patrones.uaemex.fi.isii.patterns.visitor.Route;
import patrones.uaemex.fi.isii.patterns.visitor.Visitor;

/**
 *
 * @author agomezl020
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiniTruck miniTruck1 = new MiniTruck("NPA87GO", 100);
        MiniTruck miniTruck2 = new MiniTruck("MCA98CM", 50);
        CelularNetwork celularNetwork = new CelularNetwork("localHost", "4G, 5G", 50);
        
        Visitor route = new Route();
        
        miniTruck1.accept(route);
        miniTruck2.accept(route);
        celularNetwork.accept(route);
    }
    
}
