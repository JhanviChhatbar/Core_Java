package Enum;

public class EnumWithConstructor {
    public static void main(String[] args) {
        Color1 color1 = Color1.GREEN;
        System.out.println(color1.name());
    }
}

enum Color1{
    RED, YELLOW, GREEN;

    private Color1(){
        System.out.println("Enum Initialization " + this.toString());
    }
}
