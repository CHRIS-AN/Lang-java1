package re.sta.rt.calendar;


/*

    java.time : 날짜와 시간을 다루는데 필요한 핵심 클래스들을 제공
    java.time.chrono : 표준(ISO)이 아닌 달력 시스템을 위한 클래스들을 제공
    java.time.format : 날짜와 시간을 파싱하고, 형식화하기 위한 클래스들을 제공
    java.time.temporal : 날짜와 시간의 필드(field) 와 단위 (unit)를 위한 클래스들을 제공
    java.time.zone : 시간대(time-zome)와 관련된 클래스들을 제공


      패키지의 개수는 많지만, 실제로 사용되는 핵심적인 클래스들은 그리 많지 않으니깐,
      String 클래스처럼 불변(immutable) 이라는 것이다.

      멀티쓰레드 환경에서는 동시에 여러 쓰레드가 같은 객체에 접급할 수 있기 때문에, 변경 가능한 객체는 데이터가 잘못될 가능성이 있으며,
      이를 쓰레드에 안전(thread-safe)하지 않다고한다.


   LocalDate + LocalTime  -> LocalDateTime
      날짜        시간          날짜 & 시간

   LocalDateTime + 시간대 -> ZonedDateTime

   Calendar 는 ZonedDateTime 처럼, 날짜와 시간 그리고 시간대까지 모두 가지고 있다.

   날짜 - 날짜 = Period
   시간 - 시간 = Duration

   객체 생성하기 now(), of()

   Temporal, TemporalAccessor, TemporalAdjuster 를 구현 클래스
        - LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant 등

   TemporalAmount 를 구현한 클래스
        - Period, Duration

   TemporalUnit 과 TemporalField
        날짜와 시간의 단위를 정의해 놓은 것이 TemporalUnit 인터페이스이고, 이 인터페이스를 구현한 것이 열거형 ChronoUnit 이다.
        그리고 TemporalField 는 년, 월, 일 등 날짜와 시간의 필드를 정의해 놓은 것으로 열거형 ChronoFiled 가 이 인터페이스를 구현한다.

 */

public class JavaTimePackage {
    public static void main(String[] args) {

    }
}





