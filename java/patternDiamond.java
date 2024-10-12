public class patternDiamond {
    public static void main(String[]args){
        //upper half
        int n = 5;
        for(int i =1; i<=n; i++){
            //spaces
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half

        int m= 5;
        for(int i=m; i>=1; i--){
            //spaces
            for(int j =1; j<=m-i; j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
