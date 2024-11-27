package app.model;

import java.util.LinkedList;
import java.util.Queue;

public class Buzon {
    private Queue<Mensaje> mensajes = new LinkedList<>();
    private final int MAX_MENSAJES = 1;

    public synchronized void addMensaje(Mensaje mensaje) {
        while (mensajes.size() >= MAX_MENSAJES) {
            try {
                System.out.println("Buzon lleno, esperando a que se lea un mensaje");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        mensajes.add(mensaje);
        System.out.println("Mensaje añadido: " + mensaje.getMensaje());
        notifyAll();
    }

    public synchronized void readMensaje() {
        while (mensajes.isEmpty()) {
            try {
                System.out.println("Buzon vacio, esperando a que se añada un mensaje");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Mensaje Leido: " + mensajes.poll().getMensaje());
        notifyAll();
    }
}
