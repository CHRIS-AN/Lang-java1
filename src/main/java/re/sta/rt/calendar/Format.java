package re.sta.rt.calendar;




/*

    ChoiceFormat
        특정 범위에 속하는 값을 문자열로 변환해준다.
        연속적 또는 불연속적인 범위의 값들을 처리하는 데 있어서 if 문이나 switch 문은 적절하지 못한 경우가 많다.
        이럴 때 ChoiceFormat 을 잘 사용하면 복잡하게 처리될 수 밖에 없었떤 코드를 간단하고 직관적으로 만들 수 있다.

 */


import java.text.ChoiceFormat;

public class Format {
    public static void main(String[] args) {
        double [] limits = {60,70,80,90}; /// 낮은 값부터 큰 값의 순서로 적어야한다.

        // 60~69, 70~70, 80~89, 90~

        // limits, grades 간의 순서와 개수를 맞추어야한다.
        String [] grades = {"D", "C", "B", "A"};

        int [] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + " : " + form.format(scores[i]));
        }
    }
}




















