public class DistributedData {
    private final String content;
    private final ConsistencyLevel consistencyLevel;

    public DistributedData(String content, ConsistencyLevel consistencyLevel) {
        this.content = content;
        this.consistencyLevel = consistencyLevel;
    }

    public String getContent() {
        return content;
    }

    public String getConsistencyLevel() {
        return consistencyLevel.getConsistencyLevel();
    }
}
