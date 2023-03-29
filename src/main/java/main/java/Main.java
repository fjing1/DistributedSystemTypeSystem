package main.java;

import main.java.consistency.EventualConsistentData;
import main.java.consistency.StronglyConsistentData;
import datastore.DataStore;
import datastore.InMemoryDataStore;
import distributedSystem.DistributedSystem;



public class Main {
    public static <DataStore> void main(String[] args) {
        DataStore dataStore = (DataStore) new InMemoryDataStore();
        DistributedSystem distributedSystem = new DistributedSystem(dataStore);


        distributedSystem.storeData("key1", "value1", new StronglyConsistentData());
        distributedSystem.storeData("key2", "value2", new EventualConsistentData());

        System.out.println("Key1 data: " + distributedSystem.fetchData("key1") + ", main.java.consistency: " + distributedSystem.getConsistencyLevel("key1"));
        System.out.println("Key2 data: " + distributedSystem.fetchData("key2") + ", main.java.consistency: " + distributedSystem.getConsistencyLevel("key2"));

        distributedSystem.deleteData("key1");
        System.out.println("Key1 data after deletion: " + distributedSystem.fetchData("key1"));
    }
}
