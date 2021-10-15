/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author RAÚL GABRIEL
 */
public class caballo {
    String nombre;
    String raza;
    Integer altura;
    Integer peso;
    Integer edad;

    public caballo(String nombre, String raza, Integer altura, Integer peso, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "caballo{" + "nombre=" + nombre + ", raza=" + raza + ", altura=" + altura + ", peso=" + peso + ", edad=" + edad + '}';
    }
    
            
}
