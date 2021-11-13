package Persistencia;

import Logica.datosMascotas;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    datosMascotasJpaController MascotasJpaController = new datosMascotasJpaController();

    public void altaDatosMascotas(datosMascotas maskota) {

        try {
            MascotasJpaController.create(maskota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
