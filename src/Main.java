import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        try {
            throwExceptions();
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        System.out.println("Конец программы");
        //Exercise 2
        Reader reader = new Reader();
        System.out.println(reader.read());
        //Exercise 3
        try {
            throwExceptions2();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void throwExceptions() throws IOException{
        throw new IOException();
    }
    public static void throwExceptions2() throws IOException{
        throw new CustomException("Случайная ошибка");
    }


}
