package Enum;

public class CustomizedValueEnum {

    public static void main(String[] args) {
        System.out.println(Fruits.valueOf("APPLE"));// output is APPLE
        System.out.println(Fruits.APPLE); // output is APPLE

        System.out.println(Fruits.APPLE.getColor());  // output is RED
        System.out.println(Fruits.valueOf("APPLE").getColor()); // output is RED
    }
}

enum Fruits{
    APPLE("RED"), BANANA("YELLOW"), GRAPES("GREEN");

    private String color;

    private Fruits(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
