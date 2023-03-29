package consistency;

public class UnspecifiedConsistencyData implements ConsistencyLevel {

    @Override
    public boolean isStronglyConsistent() {
        return false;
    }

    @Override
    public boolean isEventuallyConsistent() {
        return false;
    }
}
