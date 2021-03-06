/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author educu
 */
public class Modelo {

    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;

    public Modelo() {

    }

    public Modelo(String nombre, String id, double temperatura, double valorBase) {
        this.nombre = nombre;
        this.id = id;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

}
