/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clients;

import Models.Servicios;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
/**
 *
 * @author Mario
 */
public class ServicesController {
    private static final String API_URL = "http://localhost:5183/api/Servicios";

    public static List<Servicios> obtenerServicios() {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(API_URL);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            // Agregar header para aceptar JSON
            conn.setRequestProperty("Accept", "application/json");
            // Especificar codificación UTF-8
            conn.setRequestProperty("Accept-Charset", "UTF-8");

            int responseCode = conn.getResponseCode();
            System.out.println("Código de respuesta: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Usar explícitamente UTF-8 para la lectura
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
                StringBuilder json = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    json.append(line);
                }
                reader.close();

                String jsonResponse = json.toString();
                System.out.println("JSON recibido: " + jsonResponse);

                Gson gson = new Gson();
                Type listType = new TypeToken<List<Servicios>>(){}.getType();
                return gson.fromJson(jsonResponse, listType);
            } else {
                System.out.println("Error en la respuesta del servidor. Código: " + responseCode);
                return null;
            }
        } catch (JsonSyntaxException | IOException e) {
            System.err.println("Error al obtener servicios: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}

