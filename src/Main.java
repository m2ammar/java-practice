import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Task 1
        int n;
        int sum=0;
        System.out.println("Enter your number for which you need to to calculate ");
        n=sc.nextInt();

        int i=0;

        while (i<n){
            sum = (n*(n+1))/2;

            i++;
        }
        System.out.println(sum);



        //Task 2
        System.out.println("Enter a number to find their factorial");
        int num1=sc.nextInt();


        int  factorial = 1;

        int I=num1-1;
        while( I<num1){
           factorial= I * num1;
           I++;
        }
        System.out.println("The factorial of "+num1+" is "+factorial);



        //Task 3

        System.out.println("Enter a number to find its square");
        int a =sc.nextInt();

        System.out.println("Enter power");
        int b =sc.nextInt();

        int result=1;
        int num2=1;
        while(num2<=b){

            result=result*a;
            num2++;
        }
        System.out.println(result);






        //Task 4
        System.out.println("Enter number to reverse");
        int Num1=sc.nextInt();

        int reverse=0;


        while (Num1 !=0 ) {
            int digit = Num1%10;
            reverse =reverse*10 + digit;
            Num1 =Num1/10;

        }
        System.out.println(reverse);



        //Task 5
        System.out.println("Enter number to reverse");
        int Num2=sc.nextInt();

        int result1=0;


        while (Num2 !=0 ) {
            int digit = Num2%10;
            result1 =result1 + digit;
            Num2=Num2/10;

        }
        System.out.println(result1);



        //Task 6
        System.out.println("Enter numbr");
        int numi=sc.nextInt();

        int orgNumber = numi;
        int Sum = 0;

        while (numi != 0) {
            int digit = numi % 10;
            Sum = Sum + (digit * digit * digit);
            numi = numi / 10;
        }
        if (Sum ==orgNumber){
            System.out.println("The given number is Armstrong number");
        }else {
            System.out.println("The given number is not Armstrong number");

        }


        //task 7

        System.out.println("Enter a number");
        int N=sc.nextInt();
        int fibonacci = 0;


        int I1 = 1;
        int first = 0;
        int second = 1;
        int next = 0;
        while (I1 <= N) {
            if (I1 == 1) {
                System.out.print(first);
            } else if (I1 == 2) {
                System.out.print(second);
            } else {
                next = first + second;
                System.out.print(next);
                first = second;
                second = next;
            }
            I1++;
        }


    }
}