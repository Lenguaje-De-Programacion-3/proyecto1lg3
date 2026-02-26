package co.edu.uniremington.salvadorfarah.clientealmacenmotos.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models.DatosCliente;
import co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models.MetodoPago;
import co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models.Motos;

@Service
public class CatalogoServiceImpl {
    private List<Motos> motos = new ArrayList<>();
    private MetodoPago metodoPago = new MetodoPago();
    private List<DatosCliente> compradores = new ArrayList<>();

    public List<DatosCliente> obtenerCompradores() {
        return compradores;
    }

    public void agregarMoto(Motos moto) {
        motos.add(moto);
    }

    public boolean comprarMoto(int serial) {
        return metodoPago.comprarMoto(serial, motos);
    }

    // Nuevo método para encontrar moto por serial
    public Motos encontrarMotoPorSerial(int serial) {
        return motos.stream()
                .filter(m -> m.getSerial() == serial)
                .findFirst()
                .orElse(null);
    }

    // Filtrar motos disponibles (no compradas)
    public List<Motos> obtenerDisponibles() {
        return motos.stream()
                .filter(m -> !m.isComprada())
                .collect(Collectors.toList());
    }

    public List<Motos> filtrarPorPrecio(double min, double max) {
        return motos.stream()
                .filter(m -> m.getPrecio() >= min && m.getPrecio() <= max)
                .collect(Collectors.toList());
    }

    public List<Motos> filtrarPorAño(int año) {
        return motos.stream()
                .filter(m -> m.getAño() == año)
                .collect(Collectors.toList());
    }

    public List<Motos> filtrarPorColor(String color) {
        return motos.stream()
                .filter(m -> m.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    public List<Motos> obtenerTodas() {
        return motos;
    }
}