import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * This Class consume only text from Api
 */
public class ApiText {

    public static void main(String[] args) throws IOException {

        // Request a petition
        try {

            // https://swapi.dev/api/people/?search=r2
            URL url = new URL("https://swapi.dev/api/people/?search=r2&format=json");

            // Open connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Method GET and connect
            conn.setRequestMethod("GET");
            conn.connect();

            // Request success (code: 200)
            int responseCode = conn.getResponseCode();

            if (responseCode != 200){
                throw new RuntimeException("An error has occurred: "+responseCode);
            } else {

                // StringBuilder: Stores String Object
                // Scanner: Read data stream (leer flujo de datos)
                StringBuilder informationString = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());

                // Whlie sc has next line, it append (añade) to object StringBuilder
                while (sc.hasNext()) {
                    informationString.append(sc.nextLine());
                }

                sc.close();

                // Print info
                System.out.println(informationString);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
