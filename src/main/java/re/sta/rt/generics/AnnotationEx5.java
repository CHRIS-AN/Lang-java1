package re.sta.rt.generics;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "1111", dateTime=@DateTime(yymmdd = "210520", hhmmss = "043012"))
public class AnnotationEx5 {
    public static void main(String[] args) {

        // AnnotationEx5 의 객체를 얻기
        Class<AnnotationEx5> cls = AnnotationEx5.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);

        System.out.println("anno.testBy() = " + anno.testedBy());

        for(String str : anno.testTools())
            System.out.println("testTools = " + str);
    }
}



@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용 가능
@interface TestInfo {
    int count() default 1;
    String testedBy();
    String [] testTools() default {"JUnit", "ddd", "dfadsfad"};
    TestType testType() default TestType.FIRST;
    DateTime dateTime ();
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용 가능하도록 지정
    @interface DateTime {
    String yymmdd();
    String hhmmss();
}

enum TestType { FIRST, FINAL}