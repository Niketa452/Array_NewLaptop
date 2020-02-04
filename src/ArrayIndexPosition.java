import java.util.Scanner;

public class ArrayIndexPosition {
    public static void main(String[] args) {
        int[] numArr = {4, 7, 8, 9, 10};
        System.out.println("Enter a number to check its array position.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int j = 0;
        boolean ans = false;//YOU NEED A BOOLEAN VALUE FOR THIS PROGRAM
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == num) {
                j = i;
                ans = true;
                System.out.println("Number is present in the array at index " + j);

            }


        }
        if (ans == false) {
            System.out.println("Number not present in the array.");


        }
    }

}