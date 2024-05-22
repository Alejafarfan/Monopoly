/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


public class ServicioPublico extends EspacioTablero {
    private int costo;
    private int alquiler;
    private Jugador propietario;

    public ServicioPublico(String nombre, int costo, int alquiler) {
        super(nombre);
        this.costo = costo;
        this.alquiler = alquiler;
        this.propietario = null;
    }

    public int getCosto() {
        return costo;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    // Método para calcular el alquiler del servicio público
    public int calcularAlquiler(int valorDados) {
        // Si el propietario tiene ambos servicios públicos, el alquiler es el valor de los dados multiplicado por 10
        if (propietario != null && propietario.tieneAmbosServiciosPublicos()) {
            return valorDados * 10;
        } else {
            // Si el propietario solo tiene este servicio público, el alquiler es el valor de los dados multiplicado por 4
            return valorDados * 4;
        }
    }
}


