package com.tohu.tohucommand.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpReq {
    public static String Get(String sUrl) {
        HttpURLConnection conn = null;
        InputStream in = null;
        BufferedReader reader = null;
        try {
            URL url = new URL(sUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int status = conn.getResponseCode();
            StringBuilder output = new StringBuilder();
            if (status == HttpURLConnection.HTTP_OK) {
                in = conn.getInputStream();
                reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line);
                }
            }
            return output.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

}
