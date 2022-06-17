package responses.models;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneralResponses {

    private ArrayList<Person> results;
    private String count;

    public GeneralResponses(ArrayList<Person> results, String count) {
        this.results = results;
        this.count = count;
    }

    public ArrayList<Person> getResults() {
        return results;
    }

    public void setResults(ArrayList<Person> results) {
        this.results = results;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "GeneralResponses{" +
                "count=" + count +
                ", results=" + results +
                '}';
    }

    /**
     * @return Response count
     */
    public int getSize() {
        return Integer.parseInt(count);
    }

}
