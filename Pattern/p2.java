package Pattern;
/*

 ***********
 *********
 *******
 *****
 ***
 *

 */
public class p2 {
    public static void main(String[] args) {
        int size;
        size = 6;
        for (int i = size; i !=0; i--) {
            for (int j = 0; j < size -i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
