package datastore;
import main.java.distributedData.DistributedData;

import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDataStore implements main.java.datastore.DataStore {
    private final ConcurrentHashMap<String, DistributedData> storage = new ConcurrentHashMap<>();

    @Override
    public void put(String key, DistributedData value) {
        storage.put(key, value);
    }

    @Override
    public DistributedData get(String key) {
        return storage.get(key);
    }

    @Override
    public void delete(String key) {
        storage.remove(key);
    }
}
