import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num=new int[6];


        for(int i=0; i< num.length; i++){
            System.out.println("Enter six integers");
            num[i]=sc.nextInt();

        }
        int evenCount=0, oddCount=0;

        for(int i=0; i< num.length; i++){
        if(num[i] %2==0) {
            System.out.println(num[i]+ " is even");
            evenCount++;
        }
        else {

            System.out.println(num[i]+" is odd");
            oddCount++;
            }
        }
        System.out.println("Total even no "+evenCount);
        System.out.println("Total odd no. "+oddCount);

    }
}
