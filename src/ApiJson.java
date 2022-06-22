
import apiConsume.ApiRequest;
import com.google.gson.Gson;
import responses.models.GeneralResponses;
import responses.models.Person;
import responses.models.Planet;

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

        // TODO HACER LAS CONEXIONES EN LA CLASE PERSON PARA MÁS SIMPLICIDAD EN CUANTO A RESOLUCIÓN DE NOMBRES

        // Request data
        String name = JOptionPane.showInputDialog("Introduce a Star Wars Character");

        // Name URL request
        ApiRequest nameRequest = new ApiRequest(name);
        nameRequest.connection();

        // Create gson and parse Json to Java object
        Gson gsonName = new Gson();
        GeneralResponses person = gsonName.fromJson(nameRequest.getJsonString(), GeneralResponses.class);

        // Planet URL request
        //ApiRequest planetRequest = new ApiRequest(person.getResults().get(0).getName());



        // Set homeworld to JsonString
        for (int i = 0; i < person.getSize(); i++) {
            person.getResults().get(i).traduceHomeWorld();
        }

        // StringBuilder for store names
        StringBuilder names = new StringBuilder();
        StringBuilder planets = new StringBuilder();


        // Name of people from search results
        for (int i = 0; i < person.getSize(); i++) {
            names.append(person.getResults().get(i).getName()).append("\n");
        }
        // Name of planets from search results
        for (int i = 0; i < person.getSize(); i++) {
            planets.append(person.getResults().get(i).getHomeworld()).append("\n");
        }

        // Display (mostrar) data on window
        JOptionPane.showMessageDialog(null, "Names: \n"
                + names + "\nPlanet: " + planets);
        System.out.println("Total results: " + person.getSize());

        // All results and their attributes
        System.out.println(person.getResults());

    }

}
