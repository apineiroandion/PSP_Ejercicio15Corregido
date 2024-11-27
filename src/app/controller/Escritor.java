package app.controller;

import app.model.Buzon;
import app.model.Mensaje;

public class Escritor extends Thread {
    Buzon buzon;

    public Escritor(Buzon buzon) {
        this.buzon = buzon;
    }

    @Override
    public void run() {
        while (true) {
            buzon.addMensaje(new Mensaje("Mensaje de escritor "+ getName() + Math.random()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
