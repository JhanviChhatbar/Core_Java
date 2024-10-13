package Java_8.FunctionalInterface;

public class TestFuncInterface {

    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int c = 30;

        FuncInterface funcInterface = (int x, int y, int z) -> x*y*z;

        System.out.println(funcInterface.calculate(a,b,c));
    }
}
