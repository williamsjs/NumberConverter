public class SingleNumberString extends NumberString {

    public SingleNumberString(int digit) {
        super(digit);
    }

    @Override
    public void generateMap() {
        conversion.put(1, "ONE");
        conversion.put(2, "TWO");
        conversion.put(3, "THREE");
        conversion.put(4, "FOUR");
        conversion.put(5, "FIVE");
        conversion.put(6, "SIX");
        conversion.put(7, "SEVEN");
        conversion.put(8, "EIGHT");
        conversion.put(9, "NINE");
    }
}
