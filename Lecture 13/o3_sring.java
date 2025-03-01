public class o3_sring {
    public static void main(String...args) {
    StringBuilder sc=new StringBuilder("Ashok");
    System.out.println(sc.indexOf("A"));
    sc.setCharAt(0,'A');
    System.out.println(sc);
    sc.insert(0,'a');
    System.out.println(sc);
    sc.delete(0, 1);
    System.out.println(sc);

        
    }
    
}
