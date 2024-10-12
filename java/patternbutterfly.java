public class patternbutterfly {
    public static void main(String[]args){
        //upper half
        int n =4;
        for(int i =1; i<=n; i++){
            //1 par star print
            for(int j=1; j<=i; j++){
               System.out.print("*");
            }
            //inner loop -> space print 
            for(int j =1; /*j<=n-i*/j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //2 part  ->star print 
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      // lower  half

        int m=4;
        for(int i =m; i>=1; i--){
            for(int j=1; j<=i; j++){
              
                System.out.print("*");
            }
            //inner loop -> space print 
            for(int j =1;/*j<=m-i */ j<=2*(m-i); j++){
                System.out.print(" ");
            }

            //inner loop ->star print 
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    