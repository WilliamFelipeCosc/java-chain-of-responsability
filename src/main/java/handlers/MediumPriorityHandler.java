package main.java.handlers;

import main.java.Handler;
import main.java.Request;

public class MediumPriorityHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() > 3 && request.getPriority() <= 6) {
            System.out.println("MediumPriorityHandler processando: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Nenhum handler disponivel para processar: " + request);
        }
    }
}
