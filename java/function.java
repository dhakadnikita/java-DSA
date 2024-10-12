import java.util.Scanner;

public class function {
   /*  public static void printMyName(String name){
        System.out.println(name);
        return;
    }*/

       public static int calculateSum(int a,int b){
        
        return a+b; 
       }

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
       // String name = sc.nextLine();

       int a = sc.nextInt();
       int b = sc.nextInt();

        //  1 .printMyName(name);
       // int sum =calculateSum(a, b);
        
        System.out.println(calculateSum(a, b));

    }



    
}
