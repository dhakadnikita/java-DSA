import java.util.*;


public class spiralcode {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c= sc.nextInt();

      int matrices[][] = new int[r][c];
      //input
      for(int i=0; i<r; i++){
        for(int j =0; j<c; j++){
            matrices[i][j] = sc.nextInt();

        }
      }

      int toprow =0, bottomrow = r-1, leftcol =0, rightcol = c-1;
      int totalelements=0;

      while(totalelements<r*c){
        // toprow--> leftcol to right col;
        for(int j = leftcol; j <= rightcol && totalelements<r*c; j++){
            System.out.print(matrices[toprow][j]+ "");
            totalelements++;
        }
        toprow++;
        // rightcol --> toprow to bottomrow 
        for(int i = toprow; i<=bottomrow && totalelements<r*c; i++){
            System.out.print(matrices[i][rightcol] + "");
            totalelements++;
        }
        rightcol--;
        //bottomrow-->rightcol to leftcol 
        for(int j = rightcol; j >=leftcol && totalelements<r*c; j--){
            System.out.print(matrices[bottomrow][j]+ "");
            totalelements++;
        
      }
      bottomrow--;
      // leftcol --> bottomrow to toprow
      for(int i = bottomrow ; i >= toprow && totalelements<r*c; i--){
        System.out.print(matrices[i][leftcol]+ " ");
        totalelements++;
      }
      leftcol++;
    
    System.out.println();
      }
    
 }
}

