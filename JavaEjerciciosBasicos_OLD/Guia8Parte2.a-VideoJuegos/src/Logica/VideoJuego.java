
package Logica;


public class VideoJuego {

     //codigo, titulo,consola, cantidadJugadores, categoría

     private int codigo;
     private String titulo;
     private String consola;
     private int cantJugadores;
     private String categorias;

    public VideoJuego() {
    }

    public VideoJuego(int codigo, String titulo, String consola, int cantJugadores, String categorias) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categorias = categorias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }
             

    
}
