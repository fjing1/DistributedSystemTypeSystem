package tests;

import consistency.EventualConsistentData;
import consistency.StronglyConsistentData;
import distributedSystem.DistributedSystem;

public class DistributedSystemTestCase {

    public static void main(String[] args) {
        DistributedSystem<String, String> distributedSystem = new DistributedSystem<>();

        System.out.println("Test 1: Put data with Strong Consistency");
        distributedSystem.put("key1", "value1", new StronglyConsistentData());

        System.out.println("Test 2: Put data with Eventual Consistency");
        distributedSystem.put("key2", "value2", new EventualConsistentData());

        System.out.println("Test 3: Get data");
        String value1 = distributedSystem.get("key1");
        System.out.println("Value for key1: " + value1); // Output: Value for key1: value1

        String value2 = distributedSystem.get("key2");
        System.out.println("Value for key2: " + value2); // Output: Value for key2: value2

        System.out.println("Test 4: Delete data");
        distributedSystem.delete("key1");
        String deletedValue = distributedSystem.get("key1");
        System.out.println("Value for deleted key1: " + deletedValue); // Output: Value for deleted key1: null
    }
}
