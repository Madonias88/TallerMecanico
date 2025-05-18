/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Mario
 */
public class Facturas {
private int id;
    private Date fecha;
    private String clienteNombre;
    private double total;
    private List<String> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Constructor corregido
    public Facturas() {
        // Constructor vacío
    }

    // Getter para items
    public List<String> getItems() {
        return items;
    }

    // Setter para items
    public void setItems(List<String> items) {
        this.items = items;
    }
}

    

