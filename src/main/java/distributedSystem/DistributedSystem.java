package distributedSystem;

import consistency.ConsistencyLevel;
import distributedData.DistributedData;
import datastore.DataStore;
import datastore.InMemoryDataStore;

public class DistributedSystem<K, V> {

    private final DataStore<K, DistributedData<V>> dataStore;

    public DistributedSystem() {
        this.dataStore = new InMemoryDataStore<>();
    }

    public void put(K key, V value, ConsistencyLevel consistencyLevel) {
        DistributedData<V> data = new DistributedData<>(key, value, consistencyLevel);
        dataStore.put(key, data);
    }

    public V get(K key) {
        DistributedData<V> data = dataStore.get(key);
        if (data == null) {
            return null;
        }
        return data.getValue();
    }

    public void delete(K key) {
        dataStore.delete(key);
    }
}
