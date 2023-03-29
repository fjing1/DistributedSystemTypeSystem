
package main.java.consistency;
public class UnspecifiedConsistencyData implements ConsistencyLevel {
    @Override
    public String getConsistencyLevel() {
        return "Unspecified";
    }

    @Override
    public boolean isStrongConsistency() {
        return false;
    }
}