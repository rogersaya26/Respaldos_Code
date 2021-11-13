package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void altaProducto(int cod_prod, String nombre, int cant, String marca, String tipo, Date fecha_venc) {

        Producto prod = new Producto();

        prod.setCod_prod(cod_prod);
        prod.setNombre(nombre);
        prod.setCant(cant);
        prod.setMarca(marca);
        prod.setTipo(tipo);
        prod.setFecha_venc(fecha_venc);

        controlPersis.altaProducto(prod);

    }
}
