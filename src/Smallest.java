import java.util.Scanner;

public class Smallest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int[] num = new int[5];


        for(int i=0; i< num.length; i++){
            System.out.println("Enter five integers");
            num[i] = sc.nextInt();


        }

        int min=num[0];
        for(int i =1; i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }

        System.out.println("The smallest no is "+min);
    }
}
