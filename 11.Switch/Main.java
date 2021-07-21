public class Main {
    public static void main(String[] args) {
        // switch used used for checking lots of if els if statements

        int day = 3;
        String weekDay;
        switch(day) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thurday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "n/a";
        }
        System.out.println(weekDay);

        // if we add break keyword each case, we case is true, it stops switch statement. It saves execution time
    }
}