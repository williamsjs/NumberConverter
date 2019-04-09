public class NumberConverter {

    public static String convert(int userNumber) {
        String numberString = "";

        if (userNumber < 0) {
            numberString += "NEGATIVE ";
            userNumber = Math.abs(userNumber);
        } else if (userNumber == 0) {
            return "Zero";
        }

        if (userNumber > 999) {
            return numberString + buildNumber(userNumber / 1000) + " THOUSAND " + buildNumber(userNumber % 1000);
        } else {
            return numberString + buildNumber(userNumber);
        }
    }

    private static String buildNumber(int userNumber) {
        switch(String.valueOf(userNumber).length()) {
            case 1:
                return new SingleNumberString(userNumber).number();
            case 2:
                return doubleDigit(userNumber);
            case 3:
                return tripleDigit(userNumber);
            default:
                return "";
        }

    }

    private static String doubleDigit(int userNumber) {
        if (userNumber > 19) {
            if (userNumber % 10 == 0) {
                return new DoubleDigitNumberString(userNumber).number();
            }

            return new DoubleDigitNumberString((userNumber / 10) * 10).number() + "-" + new SingleNumberString(userNumber % 10).number();
        } else if (userNumber > 9) {
            return new TeenNumberString(userNumber).number();
        }

        return new SingleNumberString(userNumber).number();
    }

    private static String tripleDigit(int userNumber) {
        if (userNumber % 100 == 0) {
            return new SingleNumberString(userNumber / 100).number() + "-HUNDRED";
        }

        return new SingleNumberString(userNumber / 100).number() + "-HUNDRED " + doubleDigit(userNumber % 100);
    }

}
