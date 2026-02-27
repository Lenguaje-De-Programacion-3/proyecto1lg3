package co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models;

public class DatosCliente {
    private String nombre;
    private int cedula;
    private double correo;

    public DatosCliente(String nombre, int cedula, double correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getCorreo() {
        return correo;
    }

    public void setCorreo(double correo) {
        this.correo = correo;
    }

}
