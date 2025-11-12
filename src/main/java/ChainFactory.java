package main.java;

import main.java.handlers.LowPriorityHandler;
import main.java.handlers.MediumPriorityHandler;
import main.java.handlers.HighPriorityHandler;

public class ChainFactory {
    
    private ChainFactory() {
        // Construtor privado para evitar instanciacao
    }
    
    public static Handler createPriorityChain() {
        Handler lowHandler = new LowPriorityHandler();
        Handler mediumHandler = new MediumPriorityHandler();
        Handler highHandler = new HighPriorityHandler();
        
        lowHandler.setNext(mediumHandler);
        mediumHandler.setNext(highHandler);
        
        return lowHandler;
    }
}
