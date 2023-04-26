public class MethodOverLoading {
    void Addition(int x,int y)
    {
        int z = x+y;
        System.out.println(z);
    }
    void Addition(double x,double y)
    {
        double aa = x+y;
        System.out.println(aa);

    }
}
class Moree extends MethodOverLoading {
public static void main(String[] args) {
    MethodOverLoading abc = new MethodOverLoading();
    Moree xyz = new Moree();
    abc.Addition(2,3);
    abc.Addition(2.3, 3.5);
    xyz.Addition(2,3);
    xyz.Addition(2, 3);
}
}

