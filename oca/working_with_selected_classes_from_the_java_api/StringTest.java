public class StringTest {

  public static void main(String[] args) {
    String string = "animals";
    System.out.println(string.substring(3)); // mals
    System.out.println(string.substring(string.indexOf('m'))); // mals
    System.out.println(string.substring(3, 4)); // m
    System.out.println(string.substring(3, 7)); // mals
    // System.out.println(string.substring(3, 9)); // mals
    //System.out.println(string.substring(7, 3)); //StringIndexOutOfBoundsException
    //System.out.println(string.substring(4, 3)); //StringIndexOutOfBoundsException

    System.out.println("alguma coisa".replace('z', 'Z'));
    System.out.println("alguma coisa".replace('a', 'A'));
    String x = "Hello World";
    String y = "Hello World";
    System.out.println(x == y); // true

    String z = new String("Hello World");
    String u = new String("Hello World");
    System.out.println(z == u); // false

  }
}
