

public class Strings {
    public static void main (String []args){
        //concatenation
        String firstName = "tony";
        String lastName ="staark";
        String fullName = firstName + lastName ;
        System.out.println(fullName);
        System.out.println(fullName.length());


        String name1 = "tony";
        String name2 = "Tony";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("string  is not equal");
        }



        //substring 
        String sentence ="Tonystark";
        String name = sentence.substring(0,7);
        System.out.println(name);


        //strings are immutable---no change


    }
    
}
