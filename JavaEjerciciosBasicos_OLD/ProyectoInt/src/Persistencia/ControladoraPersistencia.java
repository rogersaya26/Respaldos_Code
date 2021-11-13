package Persistencia;

import Logica.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    ProductoJpaController jpaProducto = new ProductoJpaController();

    public void altaProducto(Producto prod) {

        try {
            jpaProducto.create(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
