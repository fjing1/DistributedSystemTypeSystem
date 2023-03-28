package DistributedSystem;

public class DistributedSystem {
    private final DataStore dataStore;

    public DistributedSystem(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public void storeData(String key, String content, ConsistencyLevel consistencyLevel) {
        DistributedData data = new DistributedData(content, consistencyLevel);
        dataStore.put(key, data);
    }

    public String fetchData(String key) {
        DistributedData data = dataStore.get(key);
        if (data != null) {
            return data.getContent();
        }
        return null;
    }

    public String getConsistencyLevel(String key) {
        DistributedData data = dataStore.get(key);
        if (data != null) {
            return data.getConsistencyLevel();
        }
        return null;
    }

    public void deleteData(String key) {
        dataStore.delete(key);
    }
}
