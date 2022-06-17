package responses.models;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Person {

    private String birth_year;
    private String eye_color;
    private String[] films;
    private String gender;
    private String hair_color;
    private String height;
    private String homeworld;
    private String mass;
    private String name;
    private String skin_color;
    private String created;
    private String edited;
    private String[] species;
    private String[] starships;
    private String url;

    private String[] vehicles;

    public Person() {
    }

    public Person(String birth_year, String eye_color, String[] films, String gender, String hair_color, String height, String homeworld, String mass, String name, String skin_color, String created, String edited, String[] species, String[] starships, String url, String[] vehicles) {
        this.birth_year = birth_year;
        this.eye_color = eye_color;
        this.films = films;
        this.gender = gender;
        this.hair_color = hair_color;
        this.height = height;
        this.homeworld = homeworld;
        this.mass = mass;
        this.name = name;
        this.skin_color = skin_color;
        this.created = created;
        this.edited = edited;
        this.species = species;
        this.starships = starships;
        this.url = url;
        this.vehicles = vehicles;
    }

    //@Override
    public String toString() {
        return "name= " + name +
                ", birth_year= " + birth_year +
                ", eye_color= " + eye_color +
                ", gender= " + gender +
                ", hair_color= " + hair_color +
                ", height= " + height +
                ", mass= " + mass +
                ", skin_color= " + skin_color +
                ", homeworld= " + homeworld +
                ", films= " + Arrays.toString(films) +
                ", species= " + Arrays.toString(species) +
                ", starships= " + Arrays.toString(starships) +
                ", url= " + url +
                ", created= " + created +
                ", edited= " + edited +
                ", vehicles= " + Arrays.toString(vehicles);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public String[] getSpecies() {
        return species;
    }

    public void setSpecies(String[] species) {
        this.species = species;
    }

    public String[] getStarships() {
        return starships;
    }

    public void setStarships(String[] starships) {
        this.starships = starships;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(String[] vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * TODO - Make code reusable
     */
    public String traduceHomeWorld(String urlHomeWorld) {

        try {
            // New request
            URL url = new URL(urlHomeWorld + "?format=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();

            // Translate
            if (responseCode != 200) {
                throw new RuntimeException("An error has occurred" + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    informationString.append(sc.nextLine());
                }
                sc.close();

                return String.valueOf(informationString);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

}
