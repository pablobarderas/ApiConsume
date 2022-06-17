
import apiConsume.ApiRequest;
import com.google.gson.Gson;
import responses.models.GeneralResponses;
import responses.models.Person;

import javax.swing.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

// External libraries used (gson 2.8.2) from mavenrepository

public class ApiJson {

    public static void main(String[] args) {

        // Request a petition

        // Request data
        String name = JOptionPane.showInputDialog("Introduce a Star Wars Character");

        // New URL request
        ApiRequest nameRequest = new ApiRequest(name);
        nameRequest.connection();

        // Create gson and parse Json to Java object
        Gson gson = new Gson();
        GeneralResponses person = gson.fromJson(nameRequest.getJsonString(), GeneralResponses.class);

        // StringBuilder for store names
        StringBuilder names = new StringBuilder();

        // Name of people from search results
        for (int i = 0; i < person.getSize(); i++) {
            names.append(person.getResults().get(i).getName()).append("\n");
        }

        // Display (mostrar) data on window
        JOptionPane.showMessageDialog(null, "Names: \n"
                + names);
        System.out.println("Total results: " + person.getSize());

        // All results and their attributes

        System.out.println(person.getResults());

    }

}
