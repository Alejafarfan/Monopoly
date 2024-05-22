/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.ArrayList;

public class Tablero {
    private final ArrayList<EspacioTablero> espacios;

    public Tablero() {
        espacios = new ArrayList<>(40);
        inicializarEspacios();
    }

    private void inicializarEspacios() {
        espacios.add(new EspacioTablero("Go"));
        espacios.add(new Propiedad("Mediterranean Avenue", 60, 2));
        espacios.add(new CommunityChest("Community Chest"));
        espacios.add(new Propiedad("Baltic Avenue", 60, 4));
        espacios.add(new Impuesto("Income Tax", 200)); 
        espacios.add(new EstacionTren("Reading Railroad"));
        espacios.add(new Propiedad("Oriental Avenue", 100, 6));
        espacios.add(new Chance("Chance"));
        espacios.add(new Propiedad("Vermont Avenue", 100, 8));
        espacios.add(new Propiedad("Connecticut Avenue", 120, 9));
        espacios.add(new Carcel("Jail"));
        espacios.add(new Propiedad("St.Charles Place", 140,12));
        espacios.add(new ServicioPublico("Electric Company ", 150, 13));
        espacios.add(new Propiedad("States Avenue", 140,14));
        espacios.add(new Propiedad("Virginia Avenue", 160,15));
        espacios.add(new EstacionTren("Pennsylvania Railroad"));
        espacios.add(new Propiedad("St.James Place", 180,17));
        espacios.add(new CommunityChest("Community Chest"));
        espacios.add(new Propiedad("Tennessee Avenue", 180,19));
        espacios.add(new Propiedad("New York Avenue", 200,20));
        espacios.add(new EspacioTablero("Free Parking "));
        espacios.add(new Propiedad("Kentucky Avenue", 220,22));
        espacios.add(new Chance("Chance"));
        espacios.add(new Propiedad("Indiana Avenue", 220,24));
        espacios.add(new Propiedad("Ilinois Avenue", 240,25));
        espacios.add(new EstacionTren("B.& O Railroad"));
        espacios.add(new Propiedad("Atlantic Avenue", 260,27));
        espacios.add(new Propiedad("Vertnor Avenue", 260,28));
        espacios.add(new ServicioPublico("Water Works", 150, 29));
        espacios.add(new Propiedad("Marvin Avenue", 280,30));
        espacios.add(new EspacioTablero("Go To Jair"));
        espacios.add(new Propiedad("Pacific Avenue", 300,32));
        espacios.add(new Propiedad("North Carolina Avenue", 300,33));
        espacios.add(new CommunityChest("Community Chest"));
        espacios.add(new Propiedad("Pennsylvania Avenue", 320,35));
        espacios.add(new EstacionTren("Short line"));
        espacios.add(new Chance("Chance"));
        espacios.add(new Propiedad("Park Place", 350 ,38));
        espacios.add(new ServicioPublico("Luxury Tax", 100, 39));
        espacios.add(new Propiedad("Boardwalk", 350 ,38));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        for (int i = 1; i < 40; i++) {
            espacios.add(new EspacioTablero("Casilla " + i));
        }
    }

    public EspacioTablero getEspacio(int posicion) {
        return espacios.get(posicion);
    }
}
