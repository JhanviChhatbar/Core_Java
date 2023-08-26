package Enum;

public class EnumAsSwitch {

    Day day;

    public EnumAsSwitch(Day day){
        this.day = day;
    }

    public void dayIsLike(){
        switch (day){
            case Monday:
                System.out.println("Mondays are good day. ");
                break;
            case Friday:
                System.out.println("Fridays are better. ");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Its Weekend! ");
                break;
            default:
                System.out.println("Its Midweek. ");
        }
    }

    public static void main(String[] args) {
        EnumAsSwitch enumAsSwitch = new EnumAsSwitch(Day.Monday);
        enumAsSwitch.dayIsLike();

        String str = "Thursday";
        EnumAsSwitch enumAsSwitch1 = new EnumAsSwitch(Day.valueOf(str));
        enumAsSwitch1.dayIsLike();
    }
}

enum Day{
    Monday,Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}
