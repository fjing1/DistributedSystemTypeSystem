
package main.java.consistency;
public class StronglyConsistentData implements ConsistencyLevel {
    @Override
    public String getConsistencyLevel() {
        return "Strong";
    }

    @Override
    public boolean isStrongConsistency() {
        return false;
    }
}