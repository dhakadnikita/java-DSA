public class pattern1 {
    public static void main(String[]args){
        /* 
        for(int i = 1; i<=4; i++){
           for(int j = 1; j<=5; j++){
            System.out.print("*");
        }
        System.out.println();
    }    */



    //pattern2


    /* 
    int n =4;
    int m=5;
    //outer loop
    for(int i =1; i<=n; i++){
        //inner loop
        for(int j =1; j<=m; j++){
            //cell ->(i,j)
            if(i==1 || j==1 || i==n || j==m) {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }

        }
       System.out.println();
    
    }*/


    //pattern 3

    int n =4;
    for(int i =1; i<=n; i++){
        for(int j=1; j<=i; j++){
          
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("half pyramid");

    //pattern 4

    int m= 4;
    for(int i = n; i>=1; i--){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
} 

}
