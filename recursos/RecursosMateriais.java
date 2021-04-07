package trab1.recursos;

import java.util.Scanner;
import trab1.material.*;

public class RecursosMateriais{

    //cadastra a quantidade inicial de todos os materiais disponíveis
    public static void cadastrar(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nOpção de cadastro selecionada: ");
        System.out.println("\nDigite a quantidade inicial de cada item: ");

        System.out.println("------- Material didático -------");

        System.out.println("Apagador: ");
        int apagador = input.nextInt();
        didatico.setApagador(apagador);

        System.out.println("Giz: ");
        int giz = input.nextInt();
        didatico.setGiz(giz);

        System.out.println("Livros: ");
        int livros = input.nextInt();
        didatico.setLivros(livros);

        System.out.println("Pincel: ");
        int pincel = input.nextInt();
        didatico.setPincel(pincel);

        System.out.println("Quadro branco: ");
        int quadroBranco = input.nextInt();
        didatico.setQuadroBranco(quadroBranco);

        System.out.println("Quadro negro: ");
        int quadroNegro = input.nextInt();
        didatico.setQuadroNegro(quadroNegro);

        System.out.println("------- Material escolar -------");

        System.out.println("Lápis: ");
        int lapis = input.nextInt();
        escolar.setLapis(lapis);

        System.out.println("Caderno: ");
        int caderno = input.nextInt();
        escolar.setCaderno(caderno);

        System.out.println("Caneta: ");
        int caneta = input.nextInt();
        escolar.setCaneta(caneta);

        System.out.println("------- Material de limpeza -------");

        System.out.println("Alvejante: ");
        int alvejante = input.nextInt();
        limpeza.setAlvejante(alvejante);

        System.out.println("Sabão em pó: ");
        int sabaoPo = input.nextInt();
        limpeza.setSabaoPo(sabaoPo);

        System.out.println("Água sanitaria: ");
        int aguaSanitaria = input.nextInt();
        limpeza.setAguaSanitaria(aguaSanitaria);

        System.out.println("Sabão em barra: ");
        int sabaoBarra = input.nextInt();
        limpeza.setSabaoBarra(sabaoBarra);
        if(input){
            input.close();
        }
    }

    //atualiza a quantidade de materiais disponíveis, divididos entre os 3 tipos de materiais existentes
    //ao selecionar um tipo de material, será possível atualizar todos os materiais do tipo escolhido
    //é realizada uma chamada de função para cada tipo de material
    public static void atualizar(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione o tipo de material que deseja atualizar");
        System.out.println("\n 1 - Material didático\n 2 - Material escolar\n 3 - Material de limpeza");

        int w;
        w = input.nextInt();
        switch (w) {
            case 1:
                attMatDid(didatico);
                break;
            case 2:
                attMatEsc(escolar);
                break;
            case 3:
                attMatLimp(limpeza);
                break;
            default:
                System.out.println("erro");
        }
        if(input){
            input.close();
        }
    }

    // função que atualiza os materiais didáticos
    public static void attMatDid(MaterialDidatico didatico) {
        Scanner input = new Scanner(System.in);
        int sair = 1;

        while (sair == 1) {
            System.out.println("\nSelecione um atributo para atualizar: ");
            System.out.println("\n 1 - Livros\n 2 - Quadro negro\n 3 - Quadro branco\n 4 - Giz\n 5 - Apagador\n 6 - Pincel");

            int z = input.nextInt();
            switch (z) {
                case 1:
                    System.out.println("\nDigite a nova quantidade de Livros: ");
                    int livros = input.nextInt();
                    didatico.setLivros(livros);
                    break;
                case 2:
                    System.out.println("\nDigite a nova quantidade de Quadros Negros: ");
                    int quadroNegro = input.nextInt();
                    didatico.setQuadroNegro(quadroNegro);
                    break;
                case 3:
                    System.out.println("\nDigite a nova quantidade de Quadros Brancos: ");
                    int quadroBranco = input.nextInt();
                    didatico.setQuadroBranco(quadroBranco);
                    break;
                case 4:
                    System.out.println("\nDigite a nova quantidade de Giz: ");
                    int giz = input.nextInt();
                    didatico.setGiz(giz);
                    break;
                case 5:
                    System.out.println("\nDigite a nova quantidade de Apagadores: ");
                    int apagador = input.nextInt();
                    didatico.setApagador(apagador);
                    break;
                case 6:
                    System.out.println("\nDigite a nova quantidade de Pinceís: ");
                    int pincel = input.nextInt();
                    didatico.setPincel(pincel);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja alterar outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
        if(input){
            input.close();
        }
    }

    // função que atualiza os materiais escolares
    public static void attMatEsc(MaterialEscolar escolar) {
        Scanner input = new Scanner(System.in);
        int sair = 1;

        while (sair == 1) {
            System.out.println("\nSelecione um atributo para atualizar: ");
            System.out.println("\n 1 - Lápis\n 2 - Caderno\n 3 - Caneta");
            int z = input.nextInt();

            switch (z) {
                case 1:
                    System.out.println("\nDigite a nova quantidade de Lápis: ");
                    int lapis = input.nextInt();
                    escolar.setLapis(lapis);
                    break;
                case 2:
                    System.out.println("\nDigite a nova quantidade de Cadernos: ");
                    int caderno = input.nextInt();
                    escolar.setCaderno(caderno);
                    break;
                case 3:
                    System.out.println("\nDigite a nova quantidade de Canetas: ");
                    int caneta = input.nextInt();
                    escolar.setCaneta(caneta);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja alterar outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
        if(input){
            input.close();
        }
    }

    // função que atualiza os materiais de limpeza
    public static void attMatLimp(MaterialLimpeza limpeza) {
        Scanner input = new Scanner(System.in);
        int sair = 1;

        

        while (sair == 1) {
            System.out.println("\nSelecione um atributo para atualizar: ");
            System.out.println("\n 1 - Alvejante\n 2 - Sabão em pó\n 3 - Água sanitária\n 4 - Sabão em barra");
            int z = input.nextInt();

            switch (z) {
                case 1:
                    System.out.println("\nDigite a nova quantidade de Alvejantes: ");
                    int alvejante = input.nextInt();
                    limpeza.setAlvejante(alvejante);
                    break;
                case 2:
                    System.out.println("\nDigite a nova quantidade de Sabão em Pó: ");
                    int sabaoPo = input.nextInt();
                    limpeza.setSabaoPo(sabaoPo);
                    break;
                case 3:
                    System.out.println("\nDigite a nova quantidade de Agua Sanitária: ");
                    int aguaSanitaria = input.nextInt();
                    limpeza.setAguaSanitaria(aguaSanitaria);
                    break;
                case 4:
                    System.out.println("\nDigite a nova quantidade de Sabão em Barra: ");
                    int sabaoBarra = input.nextInt();
                    limpeza.setSabaoBarra(sabaoBarra);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja alterar outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
        if(input){
            input.close();
        }
    }

    //remove a quantidade de materiais disponíveis, setando para 0. Está dividida entre os 3 tipos de materiais existentes
    //ao selecionar um tipo de material, será possível remover todos os materiais do tipo escolhido
    //é realizada uma chamada de função para cada tipo de material
    public static void remover(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione o tipo de material que deseja remover");
        System.out.println("\n 1 - Material didático\n2 - Material escolar\n3 - Material de limpeza");
        int y = input.nextInt();
        
        switch (y) {
            case 1:
                removeMatDid(didatico);
                break;
            case 2:
                removeMatEsc(escolar);
                break;
            case 3:
                removeMatLimp(limpeza);
                break;
            default:
                System.out.println("erro");
        }
        if(input){
            input.close();
        }
    }

    // função que remove os materiais didáticos
    public static void removeMatDid(MaterialDidatico didatico) {
        Scanner input = new Scanner(System.in); 
        int sair = 1;

        

        while (sair == 1) {
            System.out.println("\nSelecione um atributo para remover: ");
            System.out.println("\n 1 - Livros\n2 - Quadro negro\n3 - Quadro branco\n4 - Giz\n5 - Apagador\n6 - Pincel");
            int z = input.nextInt();

            switch (z) {
                case 1:
                    if(didatico.getLivros() > 0) { 
                        didatico.setLivros(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 2:
                    if(didatico.getQuadroNegro() > 0) { 
                        didatico.setQuadroNegro(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 3:
                    if(didatico.getQuadroBranco() > 0) { 
                        didatico.setQuadroBranco(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 4:
                    if(didatico.getGiz() > 0) { 
                        didatico.setGiz(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 5:
                    if(didatico.getApagador() > 0) { 
                        didatico.setApagador(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 6:
                    if(didatico.getPincel() > 0) { 
                        didatico.setPincel(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja remover outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
        if(input){
            input.close();
        }
    }

    // função que remove os materiais ecolares
    public static void removeMatEsc(MaterialEscolar escolar) {
        Scanner input = new Scanner(System.in);
        int sair = 1;

        while (sair == 1) {
            System.out.println("\nSelecione um atributo para remover: ");
            System.out.println("\n 1 - Lápis\n 2 - Caderno\n 3 - Caneta");
            int z = input.nextInt();

            switch (z) {
                case 1:
                    if(escolar.getLapis() > 0){ 
                        escolar.setLapis(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 2:
                    if(escolar.getCaderno()>0){ 
                        escolar.setCaderno(0);
                    }else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 3:
                    if(escolar.getCaneta()>0){ 
                        escolar.setCaneta(0);
                    }else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja remover outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
        if(input){
            input.close();
        }
    }

    // função que remove os materiais de limpeza
    public static void removeMatLimp(MaterialLimpeza limpeza) {
        Scanner input = new Scanner(System.in);
        int sair = 1;

        while (sair == 1) {
            System.out.println("\nSelecione um atributo para remover: ");
            System.out.println("\n 1 - Alvejante\n 2 - Sabão em pó\n 3 - Água sanitária\n 4 - Sabão em barra");
            int z = input.nextInt();

            switch (z) {
                case 1:
                    if(limpeza.getAlvejante()>0){ 
                        limpeza.setAlvejante(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 2:
                    if(limpeza.getSabaoPo()>0){ 
                        limpeza.setSabaoPo(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 3:
                    if(limpeza.getAguaSanitaria()>0){ 
                        limpeza.setAguaSanitaria(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                case 4:
                    if(limpeza.getSabaoBarra()>0){ 
                        limpeza.setSabaoBarra(0);
                    }
                    else{
                        System.out.println("\nNão é possível remover um material com quantidade já em 0");
                    }
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja alterar outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
        if(input){
            input.close();
        }
    }

    //printa em tela a quantidade de todos os materiais disponíveis. 
    public static void gerarRelatorio(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDeseja acessar o relatório? --> 1");
        System.out.println("\nDeseja sair? --> 2");
        int resp = input.nextInt();

        if (resp == 1) {
            System.out.println("\nRelatório de recursos materiais:");

            System.out.println("Material didático:");
            System.out.println("- Apagador: " + didatico.getApagador());
            System.out.println("- Giz: " + didatico.getGiz());
            System.out.println("- Livros: " + didatico.getLivros());
            System.out.println("- Pincel: " + didatico.getPincel());
            System.out.println("- Quadro Branco: " + didatico.getQuadroBranco());
            System.out.println("- Quadro negro: " + didatico.getQuadroNegro());

            System.out.println("------------------------------------");

            System.out.println("Material escolar:");
            System.out.println("- Lápis: " + escolar.getLapis());
            System.out.println("- Caderno: " + escolar.getCaderno());
            System.out.println("- Caneta: " + escolar.getCaneta());

            System.out.println("------------------------------------");

            System.out.println("Material de limpeza:");
            System.out.println("- Alvejante: " + limpeza.getAlvejante());
            System.out.println("- Sabão em pó: " + limpeza.getSabaoPo());
            System.out.println("- Água sanitária: " + limpeza.getAguaSanitaria());
            System.out.println("- Sabão em barra: " + limpeza.getSabaoBarra());

        } else {
            System.out.println("\nSem relatório");
        }
        if(input){
            input.close();
        }
    }

    //busca a quantidade de um material esécífico. Está dividida entre os 3 tipos de materiais existentes
    //ao selecionar um tipo de material, será possível remover todos os materiais do tipo escolhido
    //é realizada uma chamada de função para cada tipo de material
    public static void buscarDados(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza) {
        Scanner input = new Scanner(System.in);

        int k;
        int i;
        int sair = 1;
        int out = 1;

        while (sair == 1) {
            System.out.println("\nSelecione o recurso que deseja buscar: ");
            System.out.println("\n 1 - Material didático\n2 - Material escolar\n3 - Material de limpeza");
            k = input.nextInt();

            if (k == 1) {
                while (out == 1) {
                    System.out.println("\nSelecione o atributo que deseja consultar: ");
                    System.out.println("\n 1 - Livros\n 2 - Quadro negro\n 3 - Quadro branco\n 4 - Giz\n 5 - Apagador\n 6 - Pincel");
                    i = input.nextInt();

                    switch (i) {
                        case 1:
                            System.out.println("- Livros: " + didatico.getLivros());
                            break;
                        case 2:
                            System.out.println("- Quadro negro: " + didatico.getQuadroNegro());
                            break;
                        case 3:
                            System.out.println("- Quadro Branco: " + didatico.getQuadroBranco());
                            break;
                        case 4:
                            System.out.println("- Giz: " + didatico.getGiz());
                            break;
                        case 5:
                            System.out.println("- Apagador: " + didatico.getApagador());
                            break;
                        case 6:
                            System.out.println("- Pincel: " + didatico.getPincel());
                            break;
                        default:
                            System.out.println("erro");
                    }

                    System.out.println("\nDeseja alterar outro atributo? --> 1");
                    System.out.println("\nDeseja sair? --> 2");
                    out = input.nextInt();
                }
            }

            else if (k == 2) {
                while (out == 1) {
                    System.out.println("\nSelecione o atributo que deseja consultar: ");
                    System.out.println("\n 1 - Lápis\n 2 - Caderno\n 3 - Caneta");
                    i = input.nextInt();

                    switch (i) {
                        case 1:
                            System.out.println(" - Lápis: " + escolar.getLapis());
                            break;
                        case 2:
                            System.out.println("- Caderno: " + escolar.getCaderno());
                            break;
                        case 3:
                            System.out.println("- Caneta: " + escolar.getCaneta());
                            break;
                        default:
                            System.out.println("erro");
                    }

                    System.out.println("\nDeseja alterar outro atributo? --> 1");
                    System.out.println("\nDeseja sair? --> 2");
                    out = input.nextInt();
                }
            }

            else if (k == 3) {
                while (out == 1) {
                    System.out.println("\nSelecione o atributo que deseja consultar: ");
                    System.out.println("\n 1 - Alvejante\n 2 - Sabão em pó\n 3 - Água sanitária\n 4 - Sabão em barra");
                    i = input.nextInt();

                    switch (i) {
                    case 1:
                        System.out.println("- Alvejante: " + limpeza.getAlvejante());
                        break;
                    case 2:
                        System.out.println("- Sabão em pó: " + limpeza.getSabaoPo());
                        break;
                    case 3:
                        System.out.println("- Água sanitária: " + limpeza.getAguaSanitaria());
                        break;
                    case 4:
                        System.out.println("- Sabão em barra: " + limpeza.getSabaoBarra());
                        break;
                    default:
                        System.out.println("erro");
                    }

                    System.out.println("\nDeseja alterar outro atributo? --> 1");
                    System.out.println("\nDeseja sair? --> 2");
                    out = input.nextInt();
                }
            }
            else {
                System.out.println("erro");
            }
            sair = input.nextInt();
        }
        if(input){
            input.close();
        }

    }
    
}