import java.util.Scanner;

public class SumOFValues {
//to sum values in int array
    public static void main(String[] args) {

        int total=0;
        Scanner scanner = new Scanner(System.in);

        int numarr []= new int [5];//hardcode the size
        System.out.println("Enter 5 numbers to be added.");
        for (int i = 0; i <5 ; i++) {
            int num = scanner.nextInt();
            numarr[i] = num;
        }
        for( int number:numarr){
            total=total+number;
        }
        System.out.println(total);
    }

}
