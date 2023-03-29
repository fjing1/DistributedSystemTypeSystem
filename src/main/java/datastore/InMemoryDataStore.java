package datastore;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDataStore<K, V> implements DataStore<K, V> {

    private final Map<K, V> storage;

    public InMemoryDataStore() {
        storage = new HashMap<>();
    }

    @Override
    public void put(K key, V value) {
        storage.put(key, value);
    }

    @Override
    public V get(K key) {
        return storage.get(key);
    }

    @Override
    public void delete(K key) {
        storage.remove(key);
    }
}
