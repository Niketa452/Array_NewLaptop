import java.util.Arrays;

import static java.util.Arrays.sort;

public class StringPractice_InterviewGrid {

    public static void main(String[] args) {
        String str = "789456";
        int s1 = Integer.parseInt(str);
        //System.out.println(s1);
        int i = 5612;
        int h = 0;
        String s2 = Integer.toString(i);
        String s3 = "Hello, how are you";  // to reverse the order of the words in the string
        //System.out.println(s2.concat(s3));
        StringBuffer stbf = new StringBuffer();//USING STRINGBUGGER to reverse the order of the words in the string
        String[] myString = s3.split(" ");//to reverse the order of the words in the string
        for (int j = myString.length - 1; j >= 0; j--) {
            stbf.append(myString[j]);//to reverse the order of the words in the string
            stbf.append(" ");//to reverse the order of the words in the string
        }
        System.out.println(stbf);//to reverse the order of the words in the string


        stbf.insert(0, "niketa").delete(0, 6);
        //System.out.println(stbf);
        for (int j = s3.length() - 1; j >= 0; j--) {
            //System.out.print(s3.charAt(j));
        }
        char[] ch = s3.toCharArray();
        for (int j = ch.length - 1; j >= 0; j--) {
            System.out.print(ch[j]);//to reverse the entire string
        }

        int[] iarr = {10, -10, 5, -5};//ascending order
        //System.out.println(Arrays.stream(iarr).min());//printing minimum value using stream

        //System.out.println(iarr[iarr.length-1]);//maximum value
        //System.out.println(iarr[0]);
        String s = "My name is niketa";//counting white spaces in string
        int sp = 0;
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j)== ' ')
        sp++;
        }
        //System.out.println(sp);
    }

}


