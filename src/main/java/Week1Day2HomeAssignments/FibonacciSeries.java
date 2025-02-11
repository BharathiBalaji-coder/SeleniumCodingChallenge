package Week1Day2HomeAssignments;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 8;
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }


    }

}
