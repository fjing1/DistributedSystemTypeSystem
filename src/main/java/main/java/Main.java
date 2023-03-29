package main;

import consistency.EventualConsistentData;
import consistency.StronglyConsistentData;
import distributedData.DistributedData;
import distributedSystem.DistributedSystem;

public class Main {

    public static void main(String[] args) {
        DistributedSystem<String, String> distributedSystem = new DistributedSystem<>();

        // Put data with Strong Consistency
        distributedSystem.put("key1", "value1", new StronglyConsistentData());

        // Put data with Eventual Consistency
        distributedSystem.put("key2", "value2", new EventualConsistentData());

        // Get data
        String value1 = distributedSystem.get("key1");
        System.out.println("Value for key1: " + value1); // Output: Value for key1: value1

        String value2 = distributedSystem.get("key2");
        System.out.println("Value for key2: " + value2); // Output: Value for key2: value2

        // Delete data
        distributedSystem.delete("key1");
        String deletedValue = distributedSystem.get("key1");
        System.out.println("Value for deleted key1: " + deletedValue); // Output: Value for deleted key1: null
    }
}
