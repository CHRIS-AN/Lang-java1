package re.sta.rt.exceptionHandling;



class WorkException extends Exception {
    WorkException(String msg) { super(msg); }
}

class CloseException extends Exception {
    CloseException(String msg) { super(msg); }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exception(" + exception + ") 가 호출됨");

        if(exception)
            throw  new WorkException("WorkException 발생 !!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("close() 호출됨");
        throw new CloseException("CloseException 발생 !!!!");
    }
}
public class TryWithResourceEx {
    public static void main(String[] args) throws Exception {
        try (CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false); // 예외가 발생하지 않는다.
        }catch (WorkException e) {
            e.printStackTrace();
        }catch (CloseException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true); // 예외가 발생하지 않는다.
        }catch (WorkException e) {
            e.printStackTrace();
        }catch (CloseException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
