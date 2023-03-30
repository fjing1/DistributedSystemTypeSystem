package consistency;

public class StronglyConsistentData implements ConsistencyLevel {

    @Override
    public boolean isStronglyConsistent() {
        return true;
    }

    @Override
    public boolean isEventuallyConsistent() {
        return false;
    }


    @Override
    public boolean isLessConsistentThan(ConsistencyLevel other) {
        return other instanceof UnspecifiedConsistencyData;
    }


}
