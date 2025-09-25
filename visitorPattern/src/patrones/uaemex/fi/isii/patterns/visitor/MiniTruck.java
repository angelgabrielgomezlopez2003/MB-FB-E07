
package patrones.uaemex.fi.isii.patterns.visitor;
import patrones.uaemex.fi.isii.patterns.visitor.TelecomTransport;

/**
 *
 * @author agomezl020
 */
public class MiniTruck implements TelecomTransport{
    
    private String lincensePlate;
    private double capacityKg;

    public MiniTruck(String lincensePlate, double capacityKg) {
        this.lincensePlate = lincensePlate;
        this.capacityKg = capacityKg;
    }

    public String getLincensePlate() {
        return lincensePlate;
    }

    public double getCapacityKg() {
        return capacityKg;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
