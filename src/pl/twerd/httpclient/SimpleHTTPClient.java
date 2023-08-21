package pl.twerd.httpclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHTTPClient {

    public static void main(String[] args) {

        RequestHandler requestHandler = new RequestHandler();

        String request = "http://185.15.45.226:9999/steve/manager/log";
        String response = requestHandler.getResponse(request);

        System.out.println(response);
    }
}
