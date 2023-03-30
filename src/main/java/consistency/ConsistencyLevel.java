package consistency;

public interface ConsistencyLevel {
    boolean isStronglyConsistent();

    boolean isEventuallyConsistent();

    boolean isLessConsistentThan(ConsistencyLevel other);

}
