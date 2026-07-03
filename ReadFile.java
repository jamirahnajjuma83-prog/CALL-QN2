 import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        try (BufferedReader reader =
                 new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
