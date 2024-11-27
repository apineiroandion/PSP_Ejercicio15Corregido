package app.controller;

import app.model.Buzon;

public class Controller {
    private Buzon buzon;

    public Controller() {
        this.buzon = new Buzon();
    }

    public void createThreads(){
        for (int i = 0; i < 5; i++) {
            new Escritor(buzon).start();
            new Lector(buzon).start();
        }
    }
}
