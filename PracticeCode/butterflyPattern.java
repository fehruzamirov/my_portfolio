package DSAExamples.src.PracticeCode;

public class butterflyPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (5-i) ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 4 - i + 1 ; j++) {
                System.out.print("*");
            }
        }
    }
}