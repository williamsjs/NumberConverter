import java.util.HashMap;
import java.util.Map;

public abstract class NumberString {
    private int digit;

    protected Map<Integer, String> conversion;

    public NumberString(int digit) {
        this.digit = digit;
        this.conversion = new HashMap<>();
        generateMap();
    }

    protected abstract void generateMap();

    public String number() {
        if (digit == 0) {
            return "";
        }

        return conversion.get(digit);
    }
}
