public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        if (first == second) {
            return first;
        }
        //find the minimum number
        int minNum = 0;
        if (first > second) {
            minNum = second;
        } else minNum = first;
        //
        int target = 0;
        for (int i = minNum; i > 0; i--) {
            if (second % i == 0 && first % i == 0) {
                target = i;
                break;
            }
        } return target;
    }
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}