public class pattern6 {
    public static void main(String[]args){
        int m=5;
        for(int i=1; i<=m; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    System.out.println("reverse  ");

        int n=5;
        for(int i=1;i<=n; i++){
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

// adding value 
        int l=5;
        int number = 1;
        for(int i=1; i<=l; i++){
            for(int j =1; j<=i; j++){
                System.out.print(number+" ");
                number++;//number=number+1;
            }
            System.out.println();
        }

//zero one value
        int k= 5;
        
        for(int i=1; i<=k; i++){
            for(int j =1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1);
                }
                else{
                   System.out.print(0); 
                }
            }
            System.out.println();
        }

    }
    
}
