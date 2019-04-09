public class DoubleDigitNumberString extends NumberString {

    public DoubleDigitNumberString(int digit) {
        super(digit);
        System.out.println(digit);
    }

    @Override
    protected void generateMap() {
        conversion.put(20, "TWENTY");
        conversion.put(30, "THIRTY");
        conversion.put(40, "FORTY");
        conversion.put(50, "FIFTY");
        conversion.put(60, "SIXTY");
        conversion.put(70, "SEVENTY");
        conversion.put(80, "EIGHTY");
        conversion.put(90, "NINETY");
    }
}
