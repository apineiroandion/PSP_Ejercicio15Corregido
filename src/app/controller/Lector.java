package app.controller;

import app.model.Buzon;

public class Lector extends Thread {
    Buzon buzon;

    public Lector(Buzon buzon) {
        this.buzon = buzon;
    }

    @Override
    public void run() {
        while (true) {
            buzon.readMensaje();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
