package re.sta.rt;

interface Parseable {
    // 구문 분석작업을 수행한다.
    public abstract void parse(String fileName);
}

class ParserManager {
    // 리턴 타입이 Parseable 인터페이스이다.
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser();
        }else {
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + " - XML parsing completed");
    }
}
class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + " - HTML parsing completed");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parseable = ParserManager.getParser("XML");
        // 참조변수는 인터페이스 = 클래스.메소드(매개변수 : XML) 로 정의
        parseable.parse("document.xml");
        parseable = ParserManager.getParser(("HTML"));
        parseable.parse("document.HTML");
    }
}
