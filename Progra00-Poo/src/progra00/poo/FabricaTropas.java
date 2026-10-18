
package progra00.poo;

import config.ConfigComponente;
import progra00.poo.Criaturas.*;
import progra00.poo.Defensas.*;

/**
 * Convierte una ConfigComponente (lo que creó el programa de configuración)
 * en el objeto real, eligiendo la subclase correcta según el tipo.
 * Siempre devuelve una instancia NUEVA, así el catálogo no se modifica durante la partida.
 */
public class FabricaTropas {

    public static Tropa crear(ConfigComponente c) {

        String nombre = c.getNombre();
        int vida = c.getVida();
        int dano = c.getDano();

        // quito espacios y mayúsculas: "Alcance Medio" -> "alcancemedio"
        String tipo = c.getTipo().toLowerCase().replace(" ", "");

        Tropa tropa = switch (tipo) {
            
            // ---- defensas ----
            case "alcancemedio"   -> new AlcanceMedio(nombre, vida, dano, c.getAlcance());
            case "ataquemultiple" -> new AtaqueMultiple(nombre, vida, dano);
            case "barrera"        -> new Barrera(nombre, vida);
            case "contacto"       -> new Contacto(nombre, vida, dano);
            case "dron"           -> new Dron(nombre, vida, dano);
            case "impacto"        -> new Impacto(nombre, vida, dano);
            
            // ---- criaturas ----
            case "acechador"      -> new Acechador(nombre, vida, dano);
            case "demoledor"      -> new Demoledor(nombre, vida, dano);
            case "enjambre"       -> new Enjambre(nombre, vida, dano);
            case "escupidor"      -> new Escupidor(nombre, vida, dano, c.getAlcance());
            case "volador"        -> new Volador(nombre, vida, dano);
            default -> throw new IllegalArgumentException("Tipo no reconocido: " + c.getTipo());
        };

        // datos que son comunes a todas las tropas
        tropa.setFrecuencia(c.getFrecuencia());
        tropa.setCosto(c.getCosto());
        return tropa;
    }
}