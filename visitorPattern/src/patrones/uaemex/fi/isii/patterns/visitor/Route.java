
package patrones.uaemex.fi.isii.patterns.visitor;
import patrones.uaemex.fi.isii.patterns.visitor.Visitor;

/**
 *
 * @author agomezl020
 */
public class Route implements Visitor{

    @Override
    public void visit(MiniTruck miniTruck) {
        System.out.println("=== INSPECCION DE TRANSPORTE ===");
        System.out.println("Placa de la camioneta: " + miniTruck.getLincensePlate());
        System.out.println("Capacidad: " + miniTruck.getCapacityKg() + " kg");
        System.out.println("Inspeccion de transporte completada\n");
    }

    @Override
    public void visit(CelularNetwork celularNetwork) {
        System.out.println("=== INSPECCION DE CELULAR NETWORK ===");
        System.out.println("Nombre del servicio: " + celularNetwork.getNetworkName());
        System.out.println("Tecnologia del servicio: " + celularNetwork.getTechnology());
        System.out.println("El alcance es de: " + celularNetwork.getCoverageKm() + " mts");
        System.out.println("Inspeccion de Celular Network completada");
    }
    
}
