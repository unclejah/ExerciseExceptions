import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    String read(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println("ошибка в ридере");
        }
        return result;
    }
    String reader2(){
        String result= "";
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            result = br.readLine();
        } catch (IOException e) {
            System.out.println("ошибка в ридере2");
        }
        return result;
    }
}
