package consistency;

public class EventualConsistentData implements ConsistencyLevel {

    @Override
    public boolean isStronglyConsistent() {
        return false;
    }

    @Override
    public boolean isEventuallyConsistent() {
        return true;
    }
}
