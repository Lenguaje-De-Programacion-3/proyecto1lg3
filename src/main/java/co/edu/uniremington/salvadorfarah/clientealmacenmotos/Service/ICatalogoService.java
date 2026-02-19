package co.edu.uniremington.salvadorfarah.clientealmacenmotos.Service;

import java.util.List;

import co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models.DatosCliente;
import co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models.Motos;

public interface ICatalogoService {
    void agregarMoto(Motos moto);

    boolean comprarMoto(int serial);

    List<Motos> obtenerDisponibles();

    List<Motos> filtrarPorPrecio(double min, double max);

    List<Motos> filtrarPorAño(int año);

    List<Motos> filtrarPorColor(String color);

    List<Motos> obtenerTodas();

    List<DatosCliente> obtenerCompradores();

    void guardarCliente(DatosCliente cliente);

}