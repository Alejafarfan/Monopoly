/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.List;

public class Jugador {
    private String nombre;
    private int dinero;
    private int posicion;
    private boolean enCarcel;
    private int turnosEnCarcel;
    private JPanel ficha;
    private final List<EspacioTablero> propiedades;

    public Jugador(String nombre, int dinero, Color colorFicha) {
         propiedades = new ArrayList<>();
        this.nombre = nombre;
        this.dinero = dinero;
        this.posicion = 0;
        this.enCarcel = false;
        this.turnosEnCarcel = 0;
        this.ficha = new JPanel();
        this.ficha.setBackground(colorFicha);
        this.ficha.setPreferredSize(new Dimension(15, 15)); // Tamaño de 15x15
    
    }
    
       public void agregarPropiedad(EspacioTablero propiedad) {
        propiedades.add(propiedad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setTurnosEnCarcel(int turnosEnCarcel) {
        this.turnosEnCarcel = turnosEnCarcel;
    }

    public void setFicha(JPanel ficha) {
        this.ficha = ficha;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isEnCarcel() {
        return enCarcel;
    }

    public int getTurnosEnCarcel() {
        return turnosEnCarcel;
    }

    public JPanel getFicha() {
        return ficha;
    }

    public void setEnCarcel(boolean enCarcel) {
        this.enCarcel = enCarcel;
        this.turnosEnCarcel = enCarcel ? 0 : this.turnosEnCarcel;
    }

    public void incrementarTurnoEnCarcel() {
        if (enCarcel) {
            turnosEnCarcel++;
        }
    }

   public void mover(int espacios, Tablero tablero) {
        if (!enCarcel) {
            posicion = (posicion + espacios) % 40;
        }
    }

    public void comprarPropiedad(Propiedad propiedad) {
        if (dinero >= propiedad.getCosto()) {
            dinero -= propiedad.getCosto();
            propiedad.setPropietario(this);
        }
    }
    public boolean tieneAmbosServiciosPublicos() {
    int contador = 0;
    for (EspacioTablero propiedad : propiedades) {
        if (propiedad instanceof ServicioPublico) {
            contador++;
        }
    }
    return contador == 2; // Retorna true si el jugador tiene ambos servicios públicos, de lo contrario, retorna false
}

   public void pagarAlquiler(EspacioTablero espacio) {
    if (espacio instanceof Propiedad) {
        Propiedad propiedad = (Propiedad) espacio;
        if (dinero >= propiedad.getAlquiler()) {
            dinero -= propiedad.getAlquiler();
            propiedad.getPropietario().recibirAlquiler(propiedad.getAlquiler());
        } else {
            // Manejar la bancarrota
        }
    } else {
        // Manejar otros tipos de espacios (como servicios públicos)
    }
}
    public void incrementarDinero(int cantidad) {
    dinero += cantidad;
}

    public void recibirAlquiler(int alquiler) {
        dinero += alquiler;
    }

    public void pagarFianza() {
        if (dinero >= 50) {
            dinero -= 50;
            setEnCarcel(false);
        }
    }
    
    
   

    void comprarPropiedad(ServicioPublico servicioPublico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



