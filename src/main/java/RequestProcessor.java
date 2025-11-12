package main.java;

public class RequestProcessor {
    private Handler chain;
    
    public RequestProcessor() {
        this.chain = ChainFactory.createPriorityChain();
    }
    
    public void process(Request request) {
        chain.handleRequest(request);
    }
}
