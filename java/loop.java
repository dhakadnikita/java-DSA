import java.util.Scanner;

public class loop {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        //sum of n natural no
        int sum=0;
        for(int i =1; i<=n; i++)
        {
          sum = sum +i;

        }
        System.out.println("sum of n natural no" );
        System.out.println(sum);
        
    

        //table of a  number
        
        for (int j =1; j<=10;j++)
        {
            System.out.println(j*n);
        }

       

        
    
    } 
}
