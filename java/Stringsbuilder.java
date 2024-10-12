public class Stringsbuilder {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.insert(3,'n');
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2,4);
        System.out.println(sb);

        //

        sb.append("s");
        sb.append("t");
        sb.append("a");
        sb.append("r");
        sb.append("k");
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}
