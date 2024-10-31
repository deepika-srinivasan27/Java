package Basic;

public class Strings {
    public static void main(String[] args) {
        String s = new String("Deepika");
        s = s.concat(" Srinivasan");
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.compareTo("Deepika Srinivasan"));
        System.out.println(s.substring(3, 5));
        String[] arr = s.split(" ");
        for(String a : arr) {
            System.out.println(a);
        }
    }
}
