/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Mario
 */
public class Vehiculos {
  
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private int año; // Si tienes problemas con la ñ, usa "anio"
    private String color;

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
    
