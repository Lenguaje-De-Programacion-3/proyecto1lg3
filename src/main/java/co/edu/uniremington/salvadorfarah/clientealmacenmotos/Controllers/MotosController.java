package co.edu.uniremington.salvadorfarah.clientealmacenmotos.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import co.edu.uniremington.salvadorfarah.clientealmacenmotos.Service.CatalogoServiceImpl;
import co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models.DatosCliente;
import co.edu.uniremington.salvadorfarah.clientealmacenmotos.Models.Motos;

@Controller
@RequestMapping("/")
public class MotosController {

    @Autowired
    private CatalogoServiceImpl catalogo;

    @GetMapping
    public String mostrarMotos(Model model) {
        model.addAttribute("listaMotos", catalogo.obtenerDisponibles());
        return "motos"; // Asegúrate de que "motos.html" esté en src/main/resources/templates/
    }

    @GetMapping("/detalles")
    public String detallesMoto(Model model) {
        return "detalles"; // Se renderiza la vista sin necesidad de un serial
    }

    @GetMapping("/cotizar")
    public String cotizarMoto(@RequestParam(required = false) String moto, Model model) {
        // Si se proporciona un ID de moto, lo pasamos al modelo
        if (moto != null && !moto.isEmpty()) {
            model.addAttribute("motoId", moto);
        }
        return "cotizar"; // Este template debe estar en src/main/resources/templates/
    }

    @GetMapping("/filtrar/precio")
    public String filtrarPorPrecio(@RequestParam double min, @RequestParam double max, Model model) {
        model.addAttribute("listaMotos", catalogo.filtrarPorPrecio(min, max));
        return "motos";
    }

    @GetMapping("/filtrar/anio")
    public String filtrarPorAnio(@RequestParam int año, Model model) {
        model.addAttribute("listaMotos", catalogo.filtrarPorAño(año));
        return "motos";
    }

    @GetMapping("/filtrar/color")
    public String filtrarPorColor(@RequestParam String color, Model model) {
        model.addAttribute("listaMotos", catalogo.filtrarPorColor(color));
        return "motos";
    }

    @PostMapping("/comprar/{serial}")
    public String comprarMoto(@PathVariable int serial, Model model) {
        boolean resultado = catalogo.comprarMoto(serial);
        model.addAttribute("mensaje",
                resultado ? "Moto comprada con éxito." : "Error: Moto no encontrada o ya fue comprada.");
        return "redirect:/motos";
    }

    @GetMapping("/mostrarDatosComprador")
    public String mostrarDatosComprador(Model model) {
        // Obtén la lista de compradores del servicio
        List<DatosCliente> compradores = catalogo.obtenerCompradores();

        // Agregar la lista de compradores al modelo
        model.addAttribute("compradores", compradores);

        // Retornar la vista para mostrar los compradores
        return "mostrarDatosComprador"; // Asegúrate de que "mostrarDatosComprador.html" esté en templates/
    }
}