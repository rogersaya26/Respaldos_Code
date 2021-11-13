
package Logica;

public class Main {


    public static void main(String[] args) {
   
       VideoJuego juego [] = new VideoJuego [5];
       
       VideoJuego juego1 = new VideoJuego(123, "Banjoo Kazooie", "Nintendo 64", 1, "plataforma");
       VideoJuego juego2 = new VideoJuego(124, "Age of Empired II", "pc", 2, "extrategia");
       VideoJuego juego3 = new VideoJuego(125, "sim city", "pc", 1, "plataforma");
       VideoJuego juego4 = new VideoJuego(126, "fortnite", "multiplataforma", 100, "shooter");
       VideoJuego juego5 = new VideoJuego(127, "GTA", "multiplataforma", 1, "rol");
        
       juego[0] = juego1;
       juego[1] = juego2;
       juego[2] = juego3;
       juego[3] = juego4;
       juego[4] = juego5;
       
       for (int i = 0; i<5; i++) {
            
        System.out.println( juego[i].getTitulo()+ " - " + juego[i].getConsola()+ " - " + juego[i].getCantJugadores());
    }
       
       juego2.setCantJugadores(12);
       juego2.setTitulo("Pokemon");
       juego[1] = juego2;
       
     
          for (int i = 0; i<5; i++) {
            
        System.out.println(juego[i].getTitulo()+ " - " + juego[i].getConsola()+ " - " + juego[i].getCantJugadores());
    }
      
          
          for(int i = 0; i < 5; i++){
              if (juego[i].getConsola().equals("Nintendo 64")) {
                 System.out.println( juego[i].getTitulo()+ " - " + juego[i].getConsola()+ " - " + juego[i].getCantJugadores());
              }
              
          }
    }
    
}
