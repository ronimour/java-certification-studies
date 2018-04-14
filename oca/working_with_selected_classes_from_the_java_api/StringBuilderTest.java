public class StringBuilderTest {

  public static void main(String[] args) {

    StringBuilder a = new StringBuilder("abc");
    StringBuilder b = a.append("de");
    StringBuilder c = b.append("f").append("g");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println("c=" + c);
    StringBuilder d = new StringBuilder();
    StringBuilder e = new StringBuilder(10);
    StringBuilder f = new StringBuilder(10);
    f.append("AAAAAAAAAAAAAAAAAAAAAAAAA");
    System.out.println("length d=" + d.length());
    System.out.println("length e=" + e.length());
    System.out.println("length f=" + f.length());
    StringBuilder sb = new StringBuilder("animals");
    sb.insert(7, "-"); // sb = animals-
    sb.insert(0, "-"); // sb = -animals-
    sb.insert(4, "-"); // sb = -ani-mals
    // sb.insert(19, "-"); // //StringIndexOutOfBoundsException

    System.out.println("sb="+sb);

    StringBuilder sb2 = new StringBuilder("abcdefghijk");
    sb2.delete(2, 5);
    System.out.println("sb2="+sb2);

  }
}
