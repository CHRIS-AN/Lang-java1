package re.sta.rt.calendar;


// 날짜와 시간 & 형식화


/*
    Calendar 와 Date
    DecimalFormat
    SimpleDateFormat
    ChoiceFormat
    MessageFormat
    java.time package
    LocalDate, LocalTime
    Instant
    LocalDateTime, ZonedDateTime
    TemporalAdjusters
    Period, Duration
    parsing, fomat
 */



import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        // 기본적으로 현재 날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance();

        System.out.println("이 해의년도  : " + today.get(Calendar.YEAR));
        System.out.println("월  :  " + today.get(Calendar.MONTH) + 1);
        System.out.println("이 달의 몇 째주" + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("이 해의 몇 째주" + today.get(Calendar.WEEK_OF_YEAR));


        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일 : " + today.get( Calendar.DAY_OF_MONTH));
        System.out.println("요일(1~7), 1: 일요일 : " + today.get(Calendar.DAY_OF_WEEK)); // 일요일부터 시작!!



    }

}
