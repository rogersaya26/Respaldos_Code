package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void altaDatosMascotas(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atención_especial, String nombre_duenio, int celular_duenio, String observaciones) {

        datosMascotas maskota = new datosMascotas();

        maskota.setNum_cliente(num_cliente);
        maskota.setNombre_perro(nombre_perro);
        maskota.setRaza(raza);
        maskota.setColor(color);
        maskota.setAlergico(alergico);
        maskota.setAtención_especial(atención_especial);
        maskota.setNombre_duenio(nombre_duenio);
        maskota.setCelular_duenio(celular_duenio);
        maskota.setObservaciones(observaciones);

        controlPersis.altaDatosMascotas(maskota);

    }

}
