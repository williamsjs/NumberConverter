public class TeenNumberString extends NumberString {

    public TeenNumberString(int digit) {
        super(digit);
    }

    @Override
    protected void generateMap() {
        conversion.put(10, "TEN");
        conversion.put(11, "ELEVEN");
        conversion.put(12, "TWELVE");
        conversion.put(13, "THIRTEEN");
        conversion.put(14, "FOURTEEN");
        conversion.put(15, "FIFTEEN");
        conversion.put(16, "SIXTEEN");
        conversion.put(17, "SEVENTEEN");
        conversion.put(18, "EIGHTEEN");
        conversion.put(19, "NINETEEN");
    }
}
