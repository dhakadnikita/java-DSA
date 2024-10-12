public class recursionsssss {
  /*  public static void printNumb(int n ){
        if(n==0){
            return;
        }
        System.out.print(n+" "); 
        printNumb(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        printNumb(n);  // prints
    }*/


   // print sumof natural no 

     /*   public static void printSum(int i, int n ,int sum ){
            if(i==n){
                sum += i;
                System.out.println(sum);
                return;
            }
            sum += i;
            printSum( i+1, n, sum);
        }
        public static void main(String args[]){
            printSum(1, 5, 0);
        }
    }*/

   /* public static int calculateFactorial(int n ){
        if(n==1 || n==0){
            return 1;
        }
        int factorial=calculateFactorial(n-1);
        int factorial_n = n * factorial;
        return factorial_n;
    }
    public static void main(String args[]){
        int n = 5;
        int ans = calculateFactorial(n);
        System.out.println(ans);
    }*/

    // stack height

 /*   public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xPower1 = calcPower(x, n-1);
        int xPower = x * xPower1;
        return xPower;
    }
    public static void main(String args []){
        int a =0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a,b,n-2);
    }
*/
    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n%2==0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }else{
            return calcPower(x, n/2)*calcPower(x,n/2)*x;
        }
    }
       
    public static void main(String args []){
        int x = 2,  n= 5;
        System.out.println(calcPower(x, n));
    }
}
    

        
    

        


        
    
