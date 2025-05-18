/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clients;
import Models.Repuestos;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
/**
 *
 * @author Mario
 */
public class RepuestosController {

    private static final String API_URL = "http://localhost:5183/api/Repuestos";

    public static List<Repuestos> obtenerRepuestos() {
        HttpURLConnection conn = null;
        try {
            // Crear la conexión
            URL url = new URL(API_URL);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            // Obtener el código de respuesta
            int responseCode = conn.getResponseCode();
            System.out.println("Código de respuesta: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Leer la respuesta
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "UTF-8"));
                StringBuilder json = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    json.append(line);
                }
                reader.close();

                String jsonResponse = json.toString();
                System.out.println("JSON recibido: " + jsonResponse);

                // Convertir JSON a List<Repuestos>
                Gson gson = new Gson();
                Type listType = new TypeToken<List<Repuestos>>(){}.getType();
                return gson.fromJson(jsonResponse, listType);
            } else {
                System.out.println("Error en la respuesta del servidor. Código: " + responseCode);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}
    

