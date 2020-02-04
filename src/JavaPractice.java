public class JavaPractice {//to print numbers 1-10 without using loops

    public static void printnumbers1to10(int num) {//creating a method with int parameter
        if (num <= 10) {//boolean condintion if number is less than 10
            System.out.println(num);//print number
            num++;//increase number by 1
            printnumbers1to10(num);//calling RECURSIVE FUNCTION-IMPORTANT
        }
    }


    public static void main(String[] args) {
        printnumbers1to10(1);//calling recursive method created above and passing number 1 which will keep increasing by 1 till it reaches 10





    }


}
