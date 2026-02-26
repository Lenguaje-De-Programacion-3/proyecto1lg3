package co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models;

import java.util.Random;

public class Motos {
    private String color;
    private int año;
    private int precio;
    private int serial;
    private boolean comprada;

    public Motos(String color, int año, int precio, int serial, boolean comprada) {
        this.color = color;
        this.año = año;
        this.precio = precio;
        this.serial = generarSerial();
        this.comprada = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    private int generarSerial() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // Genera un número de 6 dígitos
    }

    public boolean isComprada() {
        return comprada;
    }

    public void setComprada(boolean comprada) {
        this.comprada = comprada;
    }
}
