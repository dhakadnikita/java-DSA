import java.util.Scanner;

public class conditional {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("adult");
        }
            else{
                System.out.println("not adult");

            }

            int x= sc.nextInt();
            if(x%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }


            //more conditional statement

            int button=sc.nextInt();
            if(button==1){
                System.out.println("hello");

            }
            else if(button==2){
                System.out.println("bonjuor");
            }
            else if (button ==3){
                System.out.println("namaste");
            }
            else{
                System.out.println("invalid");
            }


            // so we use switch statement 
            switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("bonjour");
            break;
            case 3:System.out.println("namaste");
            break;
            default:System.out.println("Invalid button");
        }
    
}
}
