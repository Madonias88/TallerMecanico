package Clients;

import Models.Taller;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TallerController {
    public static Taller obtenerTaller() {
        try {
            URL url = new URL("http://localhost:5183/api/Taller"); // Reemplaza PUERTO con tu puerto real
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
            reader.close();

            Gson gson = new Gson();
            System.out.println("JSON recibido: " + json.toString());
            
            return gson.fromJson(json.toString(), Taller.class);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}