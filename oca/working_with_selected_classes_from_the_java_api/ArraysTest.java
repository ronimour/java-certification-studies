import java.util.*;
public class ArraysTest {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("hawk");
    list.add("robin");
    Object[] objectArray = list.toArray();
    System.out.println(objectArray.length); // 2
    System.out.println(objectArray); // 2
    String[] stringArray = list.toArray(new String[0]);
    System.out.println(stringArray.length);
    System.out.println(stringArray);
    Integer nulo = null;
    System.out.println(nulo);
  }
}
