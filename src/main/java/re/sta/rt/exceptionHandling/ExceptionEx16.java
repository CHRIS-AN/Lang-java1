package re.sta.rt.exceptionHandling;

import java.io.File;

public class ExceptionEx16 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + ". 파일이 성공적으로 생성하였습니다.");
        }catch (Exception e) {
            System.out.println(e.getMessage() + ". 다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if(fileName == null || fileName.equals(""))
            throw new Exception("파일이 유효하지 않습니다");
        File f = new File(fileName);
        f.createNewFile(); // 내장된 File class의 method입니다. 실제파일을 생성합니다.
        return f;
    }
}
