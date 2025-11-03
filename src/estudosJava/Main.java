package estudosJava;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);  //ativando teclado
        boolean executando = true;

        List<Tarefa>listaTarefas=new ArrayList<>();

        System.out.println("======= TO-DO LIST BY DARADEV ========");
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = inputScan.nextLine(); // guardando entrada em uma variavel ex: nomeUsuario
        System.out.println("Bem vindo(a) " + nomeUsuario);
        System.out.println("");

        while (executando) {
            System.out.println("---------------------MENU-------------------------");
            System.out.println("");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - listar tarefas pendentes");
            System.out.println("3 - Buscar tarefa pelo nome");
            System.out.println("4 - Marcar tarefa como concluido");
            System.out.println("5 - Excluir tarefa");
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.println("==================================================");

            //Entrada
            System.out.println("Digite uma opção:");
            int acaoMenu = inputScan.nextInt();
            inputScan.nextLine();

            System.out.println("A opção escolhida foi " + acaoMenu);

            //Output
            executando = switch (acaoMenu){
                case 1 -> {
                    System.out.println("Digite o titulo: ");
                    String titulo = inputScan.nextLine();

                    System.out.println("Digite uma descrição: ");
                    String descricao = inputScan.nextLine();

                    System.out.println("Digite a data de entrega (dd/MM/yyyy): ");
                    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataDeEntrega = LocalDate.parse(inputScan.nextLine(), sdf);

                    // Criando objeto
                    Tarefa novaTarefa = new Tarefa(titulo, descricao, dataDeEntrega);
                    listaTarefas.add(novaTarefa);

                    System.out.println("Tarefa adicionada com sucesso!");
                    System.out.println(novaTarefa);
                    System.out.println(listaTarefas);

                    yield true;
                }
                case 2 -> {
                    System.out.println("Listando tarefas pendentes...");
                    yield true;// p/ entregar um valor
                }
                case 3 -> {
                    System.out.println("Buscando tarefa pelo nome...");
                    yield true;
                }
                case 4 -> {
                    System.out.println(" Marcando como concluido...");
                    yield true;
                }
                case 5 ->{
                    System.out.println("Excluindo...");
                    yield true;
                }
                case 0 -> false;
                default -> { //ELse
                    System.out.println("Opção invalida");
                    yield true;
                }
            };

        }

     inputScan.close();
    }
}
