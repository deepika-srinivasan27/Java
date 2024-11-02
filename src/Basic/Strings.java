package Basic;

public class Strings {
    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("Deepika");
        System.out.println(sb);
        //print
        System.out.println(sb.charAt(3));
        //setChar
        sb.setCharAt(0,'L');
        System.out.println(sb);
        //Insert
        sb.insert(0,'S');
        System.out.println(sb);
        //Delete
        sb.delete(1,4);
        System.out.println(sb);
        //append (add at the end)
        StringBuilder st = new StringBuilder("H");
           sb.append('e');
           sb.append('l');
           sb.append('l');
           sb.append('o');
        System.out.println(st);



    }
}
