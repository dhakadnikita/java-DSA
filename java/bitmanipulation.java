import java.util.Scanner;

public class bitmanipulation {
    public static void main (String []args){
        //  GET bit   //and
        
        /* 
        int n = 5;
        int pos =3;
        int bitMask = 1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }*/




        //  SET bit  // or
        
       /*int m =5;
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | m;
        System.out.println(newNumber);*/



        // CLEAR BIT   // and   , not  // make zero 
        /* 
        int k =5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & k;
        System.out.println(newNumber);*/


        //update bit;
        

        Scanner sc = new Scanner (System.in);
        int oper = sc.nextInt();
        int j =5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1){
            //set bit
            int newNumber = bitMask | j; 
            System.out.println(newNumber);

        }
        else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & j;
            System.out.println(newNumber);
        }
        


    }
    
}
