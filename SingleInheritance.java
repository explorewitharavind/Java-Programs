public class SingleInheritance {
    String a = "Hello My name is Aravind";
    int b = 23;
    String c = " And This is a Parent Class";
}
class Child extends SingleInheritance
{
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.a);
        System.out.println("My Age is "+obj.b);
        System.out.println(obj.c);
        
    }
}
