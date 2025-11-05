import java.util.Scanner;

public class findMaximum {
    public static void findMax(int a, int b,int c) {

        if (a > b && a > c) {
            System.out.println("The largest no. is " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest no. is " + b);
        } else {
            System.out.println("The largest no. is " + c);
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter three numbers");
            int a  = sc.nextInt();
            int b =sc.nextInt();
            int c = sc.nextInt();


            findMax(a,b,c);

        }
    }

