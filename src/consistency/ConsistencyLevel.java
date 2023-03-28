package consistency;

/**
 * ConsistencyLevel is an interface that represents the consistency level for a distributed system.
 */
public interface ConsistencyLevel {

    /**
     * Checks if the consistency level guarantees strong consistency.
     *
     * @return true if the consistency level guarantees strong consistency, false otherwise.
     */
    boolean isStrongConsistency();

}

