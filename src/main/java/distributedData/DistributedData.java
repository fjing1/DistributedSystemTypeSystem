package distributedData;

import consistency.ConsistencyLevel;

public class DistributedData<V> {
    private final Object key;
    private final V value;
    private ConsistencyLevel consistencyLevel;

    public DistributedData(Object key, V value, ConsistencyLevel consistencyLevel) {
        this.key = key;
        this.value = value;
        this.consistencyLevel = consistencyLevel;
    }

    public Object getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public ConsistencyLevel getConsistencyLevel() {
        return consistencyLevel;
    }

    public void setConsistencyLevel(ConsistencyLevel consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }
}
