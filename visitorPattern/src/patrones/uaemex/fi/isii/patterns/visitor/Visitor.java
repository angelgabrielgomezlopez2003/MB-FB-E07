
package patrones.uaemex.fi.isii.patterns.visitor;

/**
 *
 * @author agomezl020
 */
public interface Visitor {
    public void visit(MiniTruck miniTruck);
    public void visit(CelularNetwork celularNetwork);
}
