# Chain of Responsibility Pattern

Este projeto implementa o padrao de projeto Chain of Responsibility (Cadeia de Responsabilidade) em Java.

Aluno: William Felipe Coscodai
RGM: 30051291

## Estrutura do Projeto

```
chain/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── Handler.java              (Classe abstrata base)
│   │       ├── Request.java              (Objeto de requisicao)
│   │       ├── ChainFactory.java         (Factory para criar a cadeia)
│   │       ├── RequestProcessor.java     (Fachada de alto nivel)
│   │       └── handlers/
│   │           ├── LowPriorityHandler.java
│   │           ├── MediumPriorityHandler.java
│   │           └── HighPriorityHandler.java
│   └── test/
│       └── java/
│           └── ChainTest.java            (Testes da cadeia)
└── README.md
```

## Principios de Encapsulamento

A arquitetura foi projetada para que o programador de borda:

1. **Conheca apenas a classe de alto nivel**: `RequestProcessor`
2. **Nao se preocupe com a sequencia do encadeamento**: Gerenciado internamente pela `ChainFactory`
3. **Nao conheca os objetos concretos da cadeia**: Os handlers concretos estao encapsulados

### Classes Visiveis ao Usuario

- `RequestProcessor`: Ponto de entrada principal
- `Request`: Objeto de requisicao

### Classes Internas (Encapsuladas)

- `ChainFactory`: Cria e configura a cadeia
- `Handler`: Classe abstrata base
- `LowPriorityHandler`, `MediumPriorityHandler`, `HighPriorityHandler`: Implementacoes concretas

## Como Usar

```java
// O usuario precisa conhecer apenas estas duas classes
RequestProcessor processor = new RequestProcessor();
Request request = new Request("Tipo", "Descricao", 5);
processor.process(request);
```
