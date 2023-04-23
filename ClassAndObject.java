public class ClassAndObject {
  int x = 5;

  public static void main(String[] args) {
    ClassAndObject myObj1 = new ClassAndObject();  // Object 1
    ClassAndObject myObj2 = new ClassAndObject();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}