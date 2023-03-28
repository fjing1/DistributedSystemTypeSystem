public class Main {
    public static void main(String[] args) {
        DistributedData stronglyConsistentData = new DistributedData("Strongly consistent data", new StronglyConsistentData());
        DistributedData eventualConsistentData = new DistributedData("Eventually consistent data", new EventualConsistentData());
        DistributedData unspecifiedConsistencyData = new DistributedData("Unspecified consistency data", new UnspecifiedConsistencyData());

        processData(stronglyConsistentData);
        processData(eventualConsistentData);
        processData(unspecifiedConsistencyData);
    }

    public static void processData(DistributedData data) {
        System.out.println("Processing data with " + data.getConsistencyLevel() + " consistency: " + data.getContent());
        // Process the data based on its consistency level, e.g., choose the right database or replication strategy
    }
}

