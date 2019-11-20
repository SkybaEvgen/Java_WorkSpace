/*Параметр weekday имеет значение true если это рабочий день недели, и параметр
vacation имеет значение  true если у нас каникулы. Мы спим, если это не рабочий
день или у нас каникулы. Вернуть значение true, когда мы спим. Например:
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/
public class SleepIn {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = true;
        System.out.println(sleepIn(true, false));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(weekday != true || vacation == true) return true;
        else return false;
    }
}
