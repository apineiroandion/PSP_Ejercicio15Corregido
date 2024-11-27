package app.model;

import java.util.LinkedList;
import java.util.Queue;

public class Buzon {
    private Queue<Mensaje> mensajes = new LinkedList<>();

    public synchronized void addMensaje(Mensaje mensaje) {
        if (mensajes.isEmpty()) {
            mensajes.add(mensaje);
            System.out.println("Mensaje agregado");
        }else {
            System.out.println("Buzon lleno");
        }
    }

    public synchronized void readMensaje() {
        if (!mensajes.isEmpty()) {
            System.out.println(mensajes.poll().getMensaje());
        }else {
            System.out.println("Buzon vacio");
        }
    }
}
