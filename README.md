# 📝 Gerenciador de Tarefas – Console (Spring Boot)

Projeto desenvolvido em **Java com Spring Boot**, com o objetivo de praticar os conceitos de **CRUD**, **arquitetura em camadas** e **Spring Data JPA**, utilizando uma aplicação **baseada em console** (sem controllers REST).

Este projeto foi pensado para fins de **aprendizado**, organização de código e fortalecimento de portfólio. Além disso, fiz esse projeto com menos ajuda de AI do que o anterior por isso esse projeto está mais simples.

---

## 🚀 Funcionalidades

- Criar uma nova tarefa
- Listar todas as tarefas
- Buscar tarefa por ID
- Concluir tarefa (alterar status)
- Deletar tarefa
- Menu interativo no console

---

## 🧠 Conceitos aplicados

- Spring Boot
- Spring Data JPA
- Arquitetura em camadas (Model, Repository, Service)
- Injeção de dependência
- Uso de `Optional`
- Enum para controle de status
- Persistência com JPA
- Aplicação Console com `CommandLineRunner`

---

## 🏗 Estrutura do projeto

```text
src/main/java
└── com.br.task_maneger_console_springBoot
    ├── config
    │   └── ScannerConfig.java
    ├── model
    │   ├── Tarefa.java
    │   └── StatusTarefa.java
    ├── repository
    │   └── TarefaRepository.java
    ├── service
    │   └── TarefaService.java
    ├── runner
    │   └── Menu.java
    └── TaskManegerConsoleSpringBootApplication.java
```
# 📌 Observações

- Este projeto não utiliza Controllers REST, pois o foco é o aprendizado de lógica, fluxo e arquitetura.

- A aplicação pode ser facilmente evoluída para uma API REST no futuro.

- Banco de dados configurado via JPA (pode ser H2 ou outro conforme configuração).

# 👨‍💻 Autor

### Desenvolvido por Kendall
### Estudante de Análise e Desenvolvimento de Sistemas
### Foco em backend com Java e Spring Boot
