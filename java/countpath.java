public class countpath {
    public static int countPaths(int i , int j , int n , int m){
        //base case 
        if(i == n || j == m ){
            return 0 ; 
        }
        if(i == n-1 && j ==m-1){
            return 1;
        }
        // move down 
        int downPath = countPaths(i+1, j , n, m );

        //move right 
        int rightPath = countPaths(i, j+1,n, m);

        return downPath+rightPath;

    }
    public static void main(String args []){
        int n = 3, m=3;
       int totalPaths= countPaths(0, 0, n, m);
       System.out.println(totalPaths);
    }

    }
    

