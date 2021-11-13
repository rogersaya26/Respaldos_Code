package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Persona implements Serializable {
    @Id
    String dni;
    @Basic
    String nombre;
    String apellido;
    String direccion;
    String profesion;
    String tipohabitacion;
    String cantpersona;
    @Temporal(TemporalType.DATE)
    Date fechanacimiento;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public String getCantpersona() {
        return cantpersona;
    }

    public void setCantpersona(String cantpersona) {
        this.cantpersona = cantpersona;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Persona(String dni, String nombre, String apellido, String direccion, String profesion, String tipohabitacion, String cantpersona, Date fechanacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.profesion = profesion;
        this.tipohabitacion = tipohabitacion;
        this.cantpersona = cantpersona;
        this.fechanacimiento = fechanacimiento;
    }

    public Persona() {
    }

}