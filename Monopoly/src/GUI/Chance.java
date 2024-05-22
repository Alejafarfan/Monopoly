/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author farfa
 */
public class Chance extends EspacioTablero {
    private String[] eventos = {
        "Avanza hasta la casilla de 'Salida'.",
        "Avanza hasta 'Avenida Park Place'. Si pasas por 'Salida', recibe $200.",
        "Recibes una tarjeta de 'Salida gratis de la cárcel'.",
        "Pierdes $50 en impuestos.",
        "Avanza hasta 'Estación de Tren'. Si pasas por 'Salida', recibe $200.",
        "Avanza hasta 'Avenida Boardwalk'.",
        // Agrega más eventos según desees
    };

    public Chance(String nombre) {
        super(nombre);
    }

    public String obtenerEventoAleatorio() {
        int indiceEventoAleatorio = (int) (Math.random() * eventos.length);
        return eventos[indiceEventoAleatorio];
    }
}
