package main.java.consistency;
public class EventualConsistentData implements ConsistencyLevel {
    @Override
    public String getConsistencyLevel() {
        return "Eventual";
    }

    @Override
    public boolean isStrongConsistency() {
        return false;
    }
}