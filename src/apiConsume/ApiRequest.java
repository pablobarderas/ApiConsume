package apiConsume;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ApiRequest {

    private String nameSearch;
    private String jsonString;

    public ApiRequest(String nameSearch) {
        this.nameSearch = nameSearch;
    }

    public void connection() {

        try {
            URL url = new URL("https://swapi.dev/api/people/?search=" + getNameSearch() + "&format=json");

            // Open connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Method GET and connect
            conn.setRequestMethod("GET");
            conn.connect();

            // Request success (code: 200)
            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("An error has occurred: " + responseCode);
            } else {

                // StringBuilder: Stores String Object
                // Scanner: Read data stream (leer flujo de datos)
                StringBuilder informationString = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());

                // While sc has next line, it appends (añade) to object StringBuilder
                while (sc.hasNext()) {
                    informationString.append(sc.nextLine());
                }
                sc.close(); //Close Scanner

                // Store the parsed json response
                setJsonString(String.valueOf(informationString));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    // Getters and Setters
    public String getNameSearch() {
        return nameSearch;
    }

    public void setNameSearch(String nameSearch) {
        this.nameSearch = nameSearch;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }
}
