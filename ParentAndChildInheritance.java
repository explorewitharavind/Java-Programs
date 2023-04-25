public class ParentAndChildInheritance {
    int a = 20;
    // this a parent classs
}
class Childd extends ParentAndChildInheritance
{
    // this is a child class 
    public static void main(String[] args) {
        Childd b = new Childd();
        //here we created an object for child class
        System.out.println(b.a);
        //with the help of child class we can get values from parent class
        
    }
}
