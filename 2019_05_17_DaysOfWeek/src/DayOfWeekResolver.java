import java.util.Scanner;

public class DayOfWeekResolver {
    private static Scanner scanner = new Scanner(System.in);

    public void start(){
        String dayOfWeek = readDayOfWeek();
        System.out.println("Its is " + isDayOf(dayOfWeek));
        scanner.close();
    }

    private String readDayOfWeek(){
        System.out.println("Enter day of the week");
        return scanner.next();
    }

    private boolean isDayOf(String day){
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
        return isDayOf(dayOfWeek);
    }

    private boolean isDayOf(DayOfWeek day){
        switch (day){
           /*
            case SATURDAY:{
                System.out.println("Its Saturday");
                return true;
            }
            case SUNDAY: {
                System.out.println("Its Sunday");
                return true;
            }
            default: return false;
            */
            case SATURDAY:
            case SUNDAY: return true;
            default: return false;

        }
    }


}
