package distributedData;
import consistency.ConsistencyLevel;

public class DistributedData<V> {
    private final String content;
    private final ConsistencyLevel consistencyLevel;

    public DistributedData(String content, ConsistencyLevel consistencyLevel) {
        this.content = content;
        this.consistencyLevel = consistencyLevel;
    }

    public <K, V> DistributedData(K key, V value, ConsistencyLevel consistencyLevel, String content, ConsistencyLevel consistencyLevel1) {
        this.content = content;
        this.consistencyLevel = consistencyLevel1;
    }

    public String getContent() {
        return content;
    }

    public boolean isStrongConsistency() {
        return consistencyLevel.isStrongConsistency();
    }

    public String getConsistencyLevel() {
        return null;
    }

    public V getValue() {
        return null;
    }
}
