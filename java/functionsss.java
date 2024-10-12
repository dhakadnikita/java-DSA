import java.util.Scanner;

public class functionsss{

    /* 
public static void printFactorial(int n ){
    int factorial=1;

    for(int i=n ; i>=1 ; i--){
        factorial = factorial*i;
    }
    System.out.println(factorial);
    return;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printFactorial(n);
}

    
}*/

/*

public static int calculateAverage(int a, int b , int c){
    int average = (a+b+c)/3;
    return average;
}

public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println("average of two no is :"+ calculateAverage(a, b, c));
}

*/

/* 
public static int sumOddNumber(int n){
    int sum = 0;
    for(int i=0; i<n; i++){
        if(i%2!=0){
        sum+=i;
        }
    }

        System.out.println(sum);
        return sum;
    }
    

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println("Sum of odd numbers is :" + sumOddNumber(n));
}*/
/* 

public static int greaterNumber(int a,int b){
    if(a>b){
        return a;
    }else{
        return b;
    }
    

}*/
/* 

public static int circumferenceOfCircle(double r ,double pi){
      pi = 3.14;

      double circumference = 2* pi*r;
      return(int)circumference;
}

public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    System.out.println("circle of circumference is:" + circumferenceOfCircle(r, r));
}*/





    public static void main(String[] args) {
        do {
            System.out.println("This is an infinite loop using do-while.");
        } while (true);
    }
}
