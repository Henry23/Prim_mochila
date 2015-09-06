/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim_mochila;

/**
 *
 * @author Gabriel
 */
public class Item {
    
    private String nombre;
    private int Peso;
    private int Beneficio;

    public Item(String nombre, int Peso, int Beneficio) {
        this.nombre = nombre;
        this.Peso = Peso;
        this.Beneficio = Beneficio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getBeneficio() {
        return Beneficio;
    }

    public void setBeneficio(int Beneficio) {
        this.Beneficio = Beneficio;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", Peso=" + Peso + ", Beneficio=" + Beneficio + '}';
    }
    

}
