import java.util.Scanner;

public class scanner {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nextInt()
        //nextFloat()
        System.out.println(name);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum of two numbers");
        int  sum = a+b;
        System.out.println(sum);
    }
    
}
