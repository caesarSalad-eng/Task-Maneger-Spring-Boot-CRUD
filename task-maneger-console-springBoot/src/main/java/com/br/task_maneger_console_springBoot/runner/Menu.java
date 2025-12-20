package com.br.task_maneger_console_springBoot.runner;

import com.br.task_maneger_console_springBoot.service.TarefaService;
import org.springframework.boot.CommandLineRunner;
import com.br.task_maneger_console_springBoot.model.Tarefa;
import com.br.task_maneger_console_springBoot.model.StatusTarefa;


import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Menu implements CommandLineRunner {

    private final Scanner sc;

    private final TarefaService tarefaService;

    public Menu(Scanner sc, TarefaService tarefaService){

        this.sc = sc;
        this.tarefaService = tarefaService;

    }

    public void run(String... args){

            while (true){
            menu();

        }
    }

    private void menu(){

        int opcao;

        System.out.println("\n== MENU PRINCIPAL ==");
        System.out.println("1 - Criar Tarefa");
        System.out.println("2 - Listar Tarefas");
        System.out.println("3 - Buscar Tarefa por ID");
        System.out.println("4 - Concluir Tarefa");
        System.out.println("5 - Deletar Tarefa");
        System.out.println("0 - Sair");
        System.out.println("\nEscolha uma opção: ");
        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){

            case 1:

                criarTarefa();

                break;

            case 2:

                listarTarefas();

                break;

            case 3:

                buscarTarefa();

                break;

            case 4:

                concluirTarefa();

                break;

            case 5:

                deletarTarefa();

                break;

            case 0:

                System.out.println("Saindo...");

                sc.close();

                System.exit(0);

                break;

            default:

                System.out.println("Opção Inválida. Tente Novamente");


        }

    }

        private void criarTarefa(){

            String titulo;
            String descricao;

            System.out.println("\n== CRIAÇÃO DE TAREFA ==");

            System.out.println("Digite o Título da sua Tarefa");
            titulo = sc.nextLine();

            System.out.println("Digite uma Descrição para a sua Tarefa: ");
            descricao = sc.nextLine();

            Tarefa tarefa = new Tarefa(titulo, descricao);

            tarefaService.salvarTarefa(tarefa);

            System.out.println("Tarefa criada com Sucesso!!");

    }

    private void  listarTarefas(){

        List<Tarefa> tarefas = tarefaService.findAll();

        if (tarefas.isEmpty()){

            System.out.println("Nenhuma Tarefa cadastrada ainda. Lista Vazia");

        }else {

            System.out.println("== LISTA DE TAREFAS CADASTRADAS ==");

            for (Tarefa tarefa : tarefas){

                System.out.printf("\n ID: %d | Título: %s | Status: %s", tarefa.getId(), tarefa.getTitulo(), tarefa.getStatus());

            }

        }

    }

    private void buscarTarefa(){

        System.out.println("\n== BUSCAR TAREFA POR ID ==");

        System.out.println("Digite o ID da tarefa buscada: ");
        Long id = sc.nextLong();
        sc.nextLine();

        Optional<Tarefa> optTarefa = tarefaService.buscarPorId(id);

        if (optTarefa.isPresent()){

            Tarefa tarefa = optTarefa.get();

            System.out.println("Tarefa Encontrada");

            System.out.printf("ID: %d | Título: %s | Status: %s", tarefa.getId(), tarefa.getTitulo(), tarefa.getStatus());

        }else{

            System.out.println("Tarefa não encontrada");

        }

    }

    private void concluirTarefa(){

        System.out.println("Digite o ID da tarefa que deseja concluir");
        Long id = sc.nextLong();
        sc.nextLine();

        Optional<Tarefa> optTarefaCT = tarefaService.concluirTarefa(id);

        if (optTarefaCT.isPresent()){

            Tarefa tarefa = optTarefaCT.get();

            System.out.println("Tarefa concluída com Sucesso!!");

            System.out.printf("ID: %d | Título: %s | Status: %s", tarefa.getId(), tarefa.getTitulo(), tarefa.getStatus());

        }else{

            System.out.println("Tarefa não encontrada");

        }

    }

    private void deletarTarefa(){

        

    }

}
