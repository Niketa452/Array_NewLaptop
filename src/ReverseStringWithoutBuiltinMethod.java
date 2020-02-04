public class ReverseStringWithoutBuiltinMethod {

    public static void main(String[] args) {
        //REVERSING ORDER OF WORDS IN A STRING WITHOUT STRINGBUFFER CLASS
        String str="Niketa Parekh IS A GREAT TESTER";//initialize string
        String [] sarr=str.split(" ");//SPLIT FROM SPACE
        for (int i = sarr.length-1; i >=0 ; i--) {//for reversing the string start counting from the last index
            System.out.print(sarr[i]+ " ");//printing the reversed string

        }

    }




}
