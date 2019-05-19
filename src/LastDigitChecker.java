public class LastDigitChecker {

    public static boolean isValid(int number) {
        return ((number >= 10) && (number <= 1000));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int rightMost1 = a % 10;
        int rightMost2 = b % 10;
        int rightMost3 = c % 10;

        return (rightMost1 == rightMost2) || (rightMost2 == rightMost3) || (rightMost3 == rightMost1);
    }

    public static void main(String[] args){


        System.out.println(hasSameLastDigit(41, 22, 71));
    }
}
