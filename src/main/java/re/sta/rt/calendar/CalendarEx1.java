package re.sta.rt.calendar;


import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        // 기본적으로 현재 날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance();

        System.out.println("이 해의년도  : " + today.get(Calendar.YEAR));
        System.out.println("월  :  " + today.get(Calendar.MONTH) + 1);
        System.out.println("이 달의 몇 째주" + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("이 해의 몇 째주" + today.get(Calendar.WEEK_OF_YEAR));


        System.out.println(today.get(Calendar.DATE));
        System.out.println(today.get(Calendar.DAY_OF_MONTH));
        System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 일요일부터 시작!! 
        System.out.println(today.get(Calendar.WEEK_OF_YEAR));

    }

}
