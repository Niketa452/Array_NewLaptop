public class ReverseWordsOfAString {
    public static void main(String[] args) {
        String name ="Niketa Parekh";
        String [] words=name.split(" ");//splitting into array [Niketa , Parekh ]
        String revString =" ";//initialising a revString to later store reversed string
        for (int i = 0; i <words.length ; i++) {//traversing through the array of words
            String word=words[i];//storing each element of the array in a new string
            String revWords="";//a new string initialised to store the value of reversed words

            for (int j = word.length()-1; j >= 0 ; j--) {//traversing back in the array for reversed words
                revWords=revWords+word.charAt(j);//reversing and storing the letters of the string atekiN
            }
            revString=revString + revWords+ " ";//assigning the value of reversed words to reversed string

        }
        System.out.println(revString);//printing reversed string
    }




}
