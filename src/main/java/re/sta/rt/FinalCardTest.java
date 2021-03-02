package re.sta.rt;

class Card {
    final int CHECKNUM;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        KIND = kind;
        CHECKNUM = num;
    }

    Card() {
        this("HEART" , 1);
    }

    public String toString(){
        return KIND + " " + CHECKNUM;
    }
}
public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.CHECKNUM);
        System.out.println(c);
    }
}
