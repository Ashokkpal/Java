public class o1_string {

    public static void main(String...args) {
        StringBuilder sc=new StringBuilder("Ashok");
        System.out.println(sc);
        System.out.println(sc.charAt(0));
        System.out.println(sc.indexOf("A"));
        sc.setCharAt(0,'p');
        System.out.println(sc);
        sc.insert(0,'A');
        System.out.println(sc);
        sc.delete(1,2 );
        System.out.println(sc);
    }
}