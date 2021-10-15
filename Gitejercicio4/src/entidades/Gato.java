package entidades;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gato {

    private Scanner leer;
    private String nombre;
    private Integer edad;
    private String comidaFav;

    public Gato() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Gato(Scanner leer, String nombre, Integer edad, String comidaFav) {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.nombre = nombre;
        this.edad = edad;
        this.comidaFav = comidaFav;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getComidaFav() {
        return comidaFav;
    }

    public void setComidaFav(String comidaFav) {
        this.comidaFav = comidaFav;
    }

    /**
     * Creo el gato
     */
    public void crearGato() {
        try {
            this.nombre = JOptionPane.showInputDialog("Ingrese nombre del gato");
            this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
            this.comidaFav = JOptionPane.showInputDialog("Ingrese comida favorita");
        } catch (HeadlessException | NumberFormatException e) {
            throw e;
        }
    }

    /**
     * Muestro los datos del gato creado
     */
    public void verGatoCreado() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre + "\n Edad: " + this.edad + "\n Comida Favorita: " + this.comidaFav);
    }

}
