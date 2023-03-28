public interface DataStore {
    void put(String key, DistributedData value);
    DistributedData get(String key);
    void delete(String key);
}
