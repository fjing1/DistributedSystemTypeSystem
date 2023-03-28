public class UnspecifiedConsistencyData implements ConsistencyLevel {
    @Override
    public String getConsistencyLevel() {
        return "Unspecified";
    }
}