package co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models;

import java.util.List;

public class MetodoPago {

    public boolean comprarMoto(int serial, List<Motos> motos) {
        for (Motos moto : motos) {
            if (moto.getSerial() == serial && !moto.isComprada()) {
                moto.setComprada(true);
                return true; // Se marcó como comprada
            }
        }
        return false; // No se encontró o ya estaba comprada
    }
}
