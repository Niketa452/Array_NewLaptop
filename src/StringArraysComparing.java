public class StringArraysComparing {
    public static void main(String[] args) {
        String [] ar1={"cat", "dog", "rabbit", "rat"};
        String [] ar2 ={"elephant", "tiger", "cat","lion"};
        int k =0;
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar2.length ; j++) {
                if(ar1[i]==ar2[j]){
                 k =j;//assigning the position of the common word in seccond arry
                    System.out.println("The dupliate value is " + ar1[i] + " at the position " + k);

                }
            }
        }
    }
}
