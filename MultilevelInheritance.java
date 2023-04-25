public class MultilevelInheritance {
    String a ="This is a Parent Class  of Class A";
}
class Parent extends MultilevelInheritance{
    String b = "This is a Child Class of MultilevelInheritance";
    String c= "This is a Parent Class of Class Child";
}
class Child extends Parent{
    public static void main(String[] args) {
    String d = "This is a Child Class of Class Parent";
    Child ob = new Child();
    System.out.println(ob.a);
    System.out.println(ob.b);
    System.out.println(ob.c);
    System.out.println(d);

}
}