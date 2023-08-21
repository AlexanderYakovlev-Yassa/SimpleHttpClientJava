package pl.twerd.httpclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestHandler {

    public String getResponse(String urlStr) {

        try {
            // Create a URL object from the URL string
            URL url = new URL(urlStr);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET (default is GET, so this step is optional)
            connection.setRequestMethod("GET");

            // Get the response code from the server
            int responseCode = connection.getResponseCode();
//            System.out.println("Response Code: " + responseCode);

            // Read the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                response.append(currentLine);
            }
            reader.close();

            // Print the response
//            System.out.println("Response Content:");
            // Disconnect the connection
            connection.disconnect();

            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "No response.";
    }
}
