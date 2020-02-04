import java.util.Scanner;

public class SquareOFEvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int rem= n%10;
            if(rem%2==0){
                sum=sum+(rem*rem);
            }
            n=n/10;
        }
        System.out.println(sum);
    }

}
