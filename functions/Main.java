package trab1.functions;

import java.util.Scanner;
import trab1.material.*;
import trab1.recursos.*;

public class Main {

    public static void main(String[] args) {
        MaterialDidatico didatico = new MaterialDidatico();
        MaterialEscolar escolar = new MaterialEscolar();
        MaterialLimpeza limpeza = new MaterialLimpeza();
        RecursosHumanos pessoas = new RecursosHumanos();
        Scanner input = new Scanner(System.in);

        int x = 0;

        while(x != 3){ 

            System.out.println("\nSelecione o que deseja operar:");
            System.out.println("\n 1 - Recursos Humanos\n 2 - Recursos Materiais\n 3 - Finalizar Programa\n");
            x = input.nextInt();

            if(x == 1){
                Operacoes.operarPessoas(pessoas);
            }

            else if(x == 2){
                Operacoes.operarMateriais(didatico, escolar, limpeza, pessoas);
            }

            else if(x == 3){
                System.out.println("Finalizando Programa");
                input.close();
            }

            else{
                System.out.println("Opção inválida");
                return;
            }     
        }  
    }
}