package consistency;

public interface ConsistencyLevel {
    boolean isStronglyConsistent();

    boolean isEventuallyConsistent();
}
