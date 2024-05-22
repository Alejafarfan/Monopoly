/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author farfa
 */
public class CommunityChest extends EspacioTablero {
    private String[] eventos = {
        "Recibes $100 como premio.",
        "Pierdes $50 en impuestos.",
        "Avanza hasta la casilla de 'Salida'.",
        "Recibes una tarjeta de 'Salida gratis de la cárcel'.",
        "Recibes $200 como salario por pasar por 'Salida'.",
        "Pierdes $75 en reparaciones de propiedades."
        // Agrega más eventos según desees
    };

    public CommunityChest(String nombre) {
        super(nombre);
    }

    public String obtenerEventoAleatorio() {
        int indiceEventoAleatorio = (int) (Math.random() * eventos.length);
        return eventos[indiceEventoAleatorio];
    }
}

