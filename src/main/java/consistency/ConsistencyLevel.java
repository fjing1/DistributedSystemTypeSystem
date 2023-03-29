package consistency;

/**
 * ConsistencyLevel is an interface that represents the main.java.consistency level for a distributed system.
 */
public interface ConsistencyLevel {

    String getConsistencyLevel();

    /**
     * Checks if the main.java.consistency level guarantees strong main.java.consistency.
     *
     * @return true if the main.java.consistency level guarantees strong main.java.consistency, false otherwise.
     */
    boolean isStrongConsistency();

}

