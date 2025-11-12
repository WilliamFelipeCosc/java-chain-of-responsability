package test.java;

import main.java.Request;
import main.java.RequestProcessor;

public class ChainTest {
    
    public static void main(String[] args) {
        System.out.println("=== Teste da Cadeia de Responsabilidade ===\n");
        
        // O programador de borda conhece apenas RequestProcessor e Request
        RequestProcessor processor = new RequestProcessor();
        
        // Teste 1: Requisicao de baixa prioridade
        System.out.println("Teste 1: Baixa Prioridade");
        Request request1 = new Request("Suporte", "Duvida sobre produto", 2);
        processor.process(request1);
        
        // Teste 2: Requisicao de media prioridade
        System.out.println("\nTeste 2: Media Prioridade");
        Request request2 = new Request("Manutencao", "Ajuste no sistema", 5);
        processor.process(request2);
        
        // Teste 3: Requisicao de alta prioridade
        System.out.println("\nTeste 3: Alta Prioridade");
        Request request3 = new Request("Emergencia", "Sistema fora do ar", 9);
        processor.process(request3);
        
        // Teste 4: Prioridade limite baixa
        System.out.println("\nTeste 4: Limite Baixa Prioridade (3)");
        Request request4 = new Request("Informacao", "Consulta simples", 3);
        processor.process(request4);
        
        // Teste 5: Prioridade limite media
        System.out.println("\nTeste 5: Limite Media Prioridade (6)");
        Request request5 = new Request("Bug", "Erro no relatorio", 6);
        processor.process(request5);
        
        // Teste 6: Prioridade minima
        System.out.println("\nTeste 6: Prioridade Minima (1)");
        Request request6 = new Request("Feedback", "Sugestao de melhoria", 1);
        processor.process(request6);
        
        // Teste 7: Prioridade maxima
        System.out.println("\nTeste 7: Prioridade Maxima (10)");
        Request request7 = new Request("Critico", "Falha de seguranca", 10);
        processor.process(request7);
        
        System.out.println("\n=== Todos os testes foram executados ===");
    }
}
