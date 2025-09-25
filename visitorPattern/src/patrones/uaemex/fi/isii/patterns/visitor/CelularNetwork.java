
package patrones.uaemex.fi.isii.patterns.visitor;
import patrones.uaemex.fi.isii.patterns.visitor.TelecomNetwork;
/**
 *
 * @author agomezl020
 */
public class CelularNetwork implements TelecomNetwork{
    
    private String networkName;
    private String technology;
    private int coverageKm;

    public CelularNetwork(String networkName, String technology, int coverageKm) {
        this.networkName = networkName;
        this.technology = technology;
        this.coverageKm = coverageKm;
    }

    public String getNetworkName() {
        return networkName;
    }

    public String getTechnology() {
        return technology;
    }

    public int getCoverageKm() {
        return coverageKm;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
