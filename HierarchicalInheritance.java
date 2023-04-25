public class HierarchicalInheritance
{
    String a = " This is a Parent Class";
}
class A extends HierarchicalInheritance
{
    String b = " This is a Child Class 1";
}
class B extends HierarchicalInheritance
{
    String c = " This is a Child Class 2";
}
class C extends HierarchicalInheritance
{
    String d = " This is a Child Class 3";
}
class ABC 
{
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();
        System.out.println(ob1.a);
        System.out.println(ob2.a);
        System.out.println(ob3.a);
    }   
}