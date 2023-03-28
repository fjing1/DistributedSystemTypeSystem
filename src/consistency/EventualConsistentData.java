public class EventualConsistentData implements ConsistencyLevel {
    @Override
    public String getConsistencyLevel() {
        return "Eventual";
    }
}