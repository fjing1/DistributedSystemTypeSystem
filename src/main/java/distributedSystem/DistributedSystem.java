package distributedSystem;

import consistency.ConsistencyLevel;
import datastore.DataStore;
import datastore.InMemoryDataStore;
import distributedData.DistributedData;
import main.java.consistency.EventualConsistentData;

public class DistributedSystem<K, V> {

    private final DataStore dataStore;

    public DistributedSystem() {
        this.dataStore = (DataStore) new InMemoryDataStore();
    }

    public void put(String key, V value, ConsistencyLevel consistencyLevel) {
        String content = null;
        DistributedData<V> data = new DistributedData<>(key, value, consistencyLevel, content, consistencyLevel);
        dataStore.put(key, );
    }

    public V get(K key) {
        DistributedData<V> data = (DistributedData<V>) dataStore.get(String.valueOf(key));
        if (data == null) {
            return null;
        }
        return data.getValue();
    }

    public void delete(K key) {
        dataStore.delete((String) key);
    }

    public void storeData(String key1, String value1, EventualConsistentData stronglyConsistentData) {
    }

    public String fetchData(String key1) {
    }

    public void deleteData(String key1) {
    }
}
