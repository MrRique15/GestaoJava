package trab1.functions;

import java.util.Scanner;
import trab1.material.*;
import trab1.recursos.*;

public class Operacoes {
    // função que realiza a chamada para todas as funções de RecursosHumanos
    public static void operarPessoas(RecursosHumanos pessoas){
        Scanner input = new Scanner(System.in);

        int x = 0;

        while (x != 6) {
            System.out.println("\nSelecione a ação desejada: ");
            System.out.println("\n1 -> Inserir: ");
            System.out.println("\n2 -> Consultar: ");
            System.out.println("\n3 -> Remover: ");
            System.out.println("\n4 -> Atualizar: ");
            System.out.println("\n5 -> Listar: ");
            System.err.println("\n6 -> Sair: ");
            x = input.nextInt();

            switch(x){
                case 1:
                    RecursosHumanos.insere();
                    break;
                case 2:
                    RecursosHumanos.consulta();
                    break;
                case 3:
                    RecursosHumanos.remove();
                    break;
                case 4:
                    RecursosHumanos.atualiza();
                    break;
                case 5:
                    RecursosHumanos.list();
                    break;
                case 6:
                    System.out.println("Retornando ao menu principal.");
                    break;
                default:
                    System.out.println("Erro");
            }
        }
        if(input){
            input.close();
        }
    }

    // função que realiza a chamada para todas as funções de RecursosMateriais
    public static void operarMateriais(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza, RecursosHumanos pessoas){
        Scanner input = new Scanner(System.in);

        int x = 0;

        while (x != 8) {
            System.out.println("\nSelecione a ação desejada: ");
            System.out.println("\n1 -> Cadastrar: ");
            System.out.println("\n2 -> Atualizar: ");
            System.out.println("\n3 -> Remover: ");
            System.out.println("\n4 -> Gerar relatório: ");
            System.out.println("\n5 -> Gerar relatório semanal: ");
            System.out.println("\n6 -> Buscar dados: ");
            System.err.println("\n7 -> Distribuir Materiais: ");
            System.err.println("\n8 -> Sair: ");
            x = input.nextInt();

            switch (x) {
                case 1:
                    RecursosMateriais.cadastrar(didatico, escolar, limpeza);
                    break;
                case 2:
                    RecursosMateriais.atualizar(didatico, escolar, limpeza);
                    break;
                case 3:
                    RecursosMateriais.remover(didatico, escolar, limpeza);
                    break;
                case 4:
                    RecursosMateriais.gerarRelatorio(didatico, escolar, limpeza);
                    break;
                case 5:
                    Distribuicao.relatorioSemanal(didatico, escolar, limpeza);
                    break;
                case 6:
                    RecursosMateriais.buscarDados(didatico, escolar, limpeza);
                    break;
                case 7:
                    Distribuicao.mensal(pessoas, didatico, escolar, limpeza);
                    break;
                case 8:
                    System.out.println("Retornando ao menu principal.");
                    break;
                default:
                    System.out.println("erro");
            }
        }
        if(input){
            input.close();
        }
    }
}
