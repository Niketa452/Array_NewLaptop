import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StuedentPassFail_Bhavya_successful {
    public static void main(String[] args) {

        String resultFinal;
        int p = 0;
        int f = 0;
        String[][] result = new String[3][2];
        result[0][0] = "Rahul";
        result[0][1] = "F";
        result[1][0] = "John";
        result[1][1] = "P";
        result[2][0] = "Harry";
        result[2][1] = "P";
        for (int i = 0; i <3; i++) {
            for (int j = 1; j <2; j++) {
            resultFinal = result[i][j];
            System.out.println(result[i][j]);
                for (int k = 0; k <resultFinal.length() ; k++) {
                    if(resultFinal.contains("F")){
                        f=f+1;
                    }
                    else{
                        p=p+1;
                    }

                }

            }

            }
        System.out.println("Number of students failed = " + f);
        System.out.println("Number of students passed = " + p);
        }

    }














