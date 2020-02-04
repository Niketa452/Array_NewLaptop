public class RemoveWhiteSpaceWithoutReplace {
    public static void main(String[] args) {
        String str = "Niketa Nilesh Vivaan Parekh";

        char [] chars=str.toCharArray();//initialising and converting string to charachter array
        String str1= " ";//initialising empty string to store a new string without spaces
        for (int i = 0; i <chars.length ; i++) {//traversing through the array to remove white spaces

            if (chars[i]!= ' '){//if index is NOT an empty space
                str1=str1+chars[i];//add to str1
            }
        }
        System.out.println("The string without white spaces is : " + str1);//print str1

    }


}
