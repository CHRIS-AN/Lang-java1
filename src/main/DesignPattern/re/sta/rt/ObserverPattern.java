package re.sta.rt;


// 참고 블로거 : https://flowarc.tistory.com/entry/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4-%EC%98%B5%EC%A0%80%EB%B2%84-%ED%8C%A8%ED%84%B4Observer-Pattern

 /*
    옵저버 패턴 :
    상태를 가지고 있는 주체 객체와 상태의 변경을 알아야 하는 관찰 객체가 존재하며, 이들의 관계는
    1:1이 될 수도 있고, 1:N이 될 수가 있다. 서로의 정보를 넘기고 받는 과정에서 정보의 단위가 클수록,
    각 객체들의 관계가 복잡할수록 점점 구현하기 어려워지고 복잡성이 매우 증가할 것이다.
    이러한 기능을 할 수 있도록 가이드라인을 제시해 주는 것이다.
  */


import java.util.ArrayList;

// 옵저버 인터페이스 정의
interface Observer {
    public void update(String title, String news);
}

interface Publisher {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifyObserver();
}

class NewsMachine implements Publisher {

    private ArrayList<Observer> observers;
    private String title;
    private String news;

    public NewsMachine() {
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        int index = observers.indexOf(observer);
        System.out.println("delete : " + index);
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(title, news);
        }
    }

    public void setNewsInfo(String title, String news) {
        this.title = title;
        this.news = news;
        notifyObserver();
    }


    public String getNews() {
        return news;
    }

    public String getTitle() {
        return title;
    }
}


class AnnualSubscriber implements Observer{

    private String newString;
    private Publisher publisher;

    public AnnualSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        this.newString = "update :" + title + "--->" + news;
        display();
        System.out.println("----------------------------");
    }

    private void display() {
        System.out.println(" 오늘의 뉴스? " + newString);
    }
}

class EventSubscriber implements Observer {

    private String newString;
    private Publisher publisher;


    public EventSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        newString = "update :" + title + "--->" + news;
        display();
        System.out.println("----------------------------");
    }


    // publisher를 이용하여 탈퇴
    public void withdraw() {
        publisher.delete(this);
    }


    private void display() {
        System.out.println(" 이벤트 유저 ↓");
        System.out.println(newString);
    }
}


public class ObserverPattern {
    public static void main(String[] args) {

        NewsMachine newsMachine = new NewsMachine();
        AnnualSubscriber annualSubscriber = new AnnualSubscriber(newsMachine);
        EventSubscriber eventSubscriber = new EventSubscriber(newsMachine);

        newsMachine.setNewsInfo("오늘 한파", "전국 영상 10도");

        // eventSubscriber를 Observer 목록에서 탈퇴
           newsMachine.delete(eventSubscriber);



        newsMachine.setNewsInfo("벛꽃 축제입니다.", "다 같이 벛꽃 보러가요 !");

    }
}
