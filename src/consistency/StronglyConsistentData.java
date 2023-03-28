
package consistency;
public class StronglyConsistentData implements ConsistencyLevel {
    @Override
    public String getConsistencyLevel() {
        return "Strong";
    }
}