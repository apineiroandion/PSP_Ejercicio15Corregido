package app;

import app.controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createThreads();

    }
}
