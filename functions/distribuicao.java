package trab1.functions;

import java.util.Scanner;

import trab1.recursos.*;
import trab1.material.*;

public class Distribuicao {

    public static void distruibuicaoMat(RecursosHumanos pessoas, MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        int x = 0;
        int quantidade = 0;
        System.out.println("Selecione para qual pessoa deseja distribuir: ");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente\n");

        x = input.nextInt();
        switch(x){
            case 1:
                quantidade = pessoas.getQuantidades(1);
                if(escolar.getCaneta() >= quantidade && escolar.getCaderno() >= quantidade && escolar.getLapis() >= quantidade){ 
                    System.out.println("\nAluno recebe: \nLápis\nCaderno\nCaneta\n");
                    pessoas.distribuiMateriais(1);
                }
                else{
                    System.out.println("Quantidade de materiais insuficiente para realizar a distribuição para todos os alunos");
                }
                break;
            case 2:
                quantidade = pessoas.getQuantidades(2);
                if(limpeza.getSabaoBarra() >= quantidade){ 
                    System.out.println("\nCozinheiro recebe: \nSabão em barra\n");
                    pessoas.distribuiMateriais(2);
                }
                else{
                    System.out.println("Quantidade de materiais insuficiente para realizar a distribuição para todos os cozinheiros");
                }
                

                break;
            case 3:
                quantidade = pessoas.getQuantidades(3);
                if(escolar.getCaneta() >= quantidade && didatico.getQuadroBranco() >= quantidade && didatico.getQuadroNegro() >= quantidade){ 
                    System.out.println("\nInstrutor recebe: \nCaneta\nQuadro Branco\nQuadro Negro\n");
                    pessoas.distribuiMateriais(3);
                }
                else{
                    System.out.println("Quantidade de materiais insuficiente para realizar a distribuição para todos os instrutores");
                }

                break;
            case 4:
                quantidade = pessoas.getQuantidades(4);
                if(escolar.getCaneta() >= quantidade){ 
                    System.out.println("\nMonitor recebe: \nCaneta\n");
                    pessoas.distribuiMateriais(4);
                }
                else{
                    System.out.println("Quantidade de materiais insuficiente para realizar a distribuição para todos os monitores");
                }

                break;
            case 5:
                quantidade = pessoas.getQuantidades(5);
                if(didatico.getLivros() >= quantidade && didatico.getGiz() >= quantidade && didatico.getApagador() >= quantidade && didatico.getPincel() >= quantidade){ 
                    System.out.println("\nProfessor recebe: \nLivros\nGiz\nApagador\nPincel\n");
                    pessoas.distribuiMateriais(5);
                }
                else{
                    System.out.println("Quantidade de materiais insuficiente para realizar a distribuição para todos os professores");
                }

                break;
            case 6:
                quantidade = pessoas.getQuantidades(6);
                if(limpeza.getAlvejante() >= quantidade && limpeza.getAguaSanitaria() >= quantidade && limpeza.getSabaoPo() >= quantidade){ 
                    System.out.println("\nServente recebe: \nAlvejante\nÁgua sanitária\nSabão em pó\n");
                    pessoas.distribuiMateriais(6);
                }
                else{
                    System.out.println("Quantidade de materiais insuficiente para realizar a distribuição para todos os serventes");
                }

                break;
            default:
                System.out.println("erro");
                return;
        }
    }

    public static void mensal(RecursosHumanos pessoas, MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        int x = 0;
        System.out.println("\nDigite o número do mês em que deseja distribuir: ");

        x = input.nextInt();

        switch(x){
            case 1:
                System.out.println("\nDistribuição de recursos materiais em Janeiro\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;
                
            case 2:
                System.out.println("\nDistribuição de recursos materiais em Fevereiro\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 3:
                System.out.println("\nDistribuição de recursos materiais em Marco\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 4:
                System.out.println("\nDistribuição de recursos materiais em Abril\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 5:
                System.out.println("\nDistribuição de recursos materiais em Maio\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 6:
                System.out.println("\nDistribuição de recursos materiais em Junho\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 7:
                System.out.println("\nDistribuição de recursos materiais em Julho\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 8:
                System.out.println("\nDistribuição de recursos materiais em Agosto\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 9:
                System.out.println("\nDistribuição de recursos materiais em Setembro\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 10:
                System.out.println("\nDistribuição de recursos materiais em Outubro\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 11:
                System.out.println("\nDistribuição de recursos materiais em Novembro\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            case 12:
                System.out.println("\nDistribuição de recursos materiais em Dezembro\n");
                distruibuicaoMat(pessoas, didatico, escolar, limpeza);
                break;

            default:
                System.out.println("erro");
                return;
        }
    }

    public static void relatorioSemanal(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        System.out.println("\nSexta-Feira! Aqui está o relatório do estoque da semana: \n");

        RecursosMateriais.gerarRelatorio(didatico, escolar, limpeza);
    }

}
