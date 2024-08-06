import java.io.BufferedReader;
import java.io.IOException;;
import java.io.InputStreamReader;

public class bufferreader {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
    System.out.println(a);
    }
    
}
