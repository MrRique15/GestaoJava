package trab1.recursos;

import java.util.ArrayList;
import java.util.Scanner;

import trab1.pessoas.*;

public class RecursosHumanos{
    private static ArrayList<Alunos> alunos = new ArrayList<>();
    private static ArrayList<Cozinheiros> cozinheiros = new ArrayList<>();
    private static ArrayList<Instrutores> instrutores = new ArrayList<>();
    private static ArrayList<Monitores> monitores = new ArrayList<>();
    private static ArrayList<Professores> professores = new ArrayList<>();
    private static ArrayList<Serventes> serventes = new ArrayList<>();

    public int getQuantidades(int _num){
        switch(_num){
            case 1:
                return alunos.size();
            case 2:
                return cozinheiros.size();
            case 3:
                return instrutores.size();
            case 4:
                return monitores.size();
            case 5:
                return professores.size();
            case 6:
                return serventes.size();
            default:
                System.out.println("Erro");
                return 0;
        }
    }
    //insere uma nova pessoa no array escolhido, para cada pessoa uma chamada de função
    public static void insere(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja inserir");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        System.out.println("Nome: ");
        String name = input.next();
        System.out.println("CPF: ");
        String cpf = input.next();

        switch(x){
            case 1:
                insereAluno(name, cpf);
                break;
            case 2:
                insereCozinheiro(name, cpf);
                break;
            case 3:
                insereInstrutor(name, cpf);
                break;
            case 4:
                insereMonitor(name, cpf);
                break;
            case 5:
                insereProfessor(name, cpf);
                break;
            case 6:
                insereServente(name, cpf);
                break;
            default:
        }
        if(input){
            input.close();
        }
    }

    //consulta uma  pessoa no array, printando todos os seus atributos em tela. Para cada pessoa uma chamada de função
    public static void consulta(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja consultar");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        System.out.println("Nome: ");
        String name = input.next();

        switch(x){
            case 1:
                consultaAluno(name);
                break;
            case 2:
                consultaCozinheiro(name);
                break;
            case 3:
                consultaInstrutor(name);
                break;
            case 4:
                consultaMonitor(name);
                break;
            case 5:
                consultaProfessor(name);
                break;
            case 6:
                consultaServente(name);
                break;
            default:
        }
        if(input){
            input.close();
        }
    }

    //remove uma  pessoa no array a partir do nome, para cada pessoa uma chamada de função
    public static void remove(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja remover");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        System.out.println("Nome: ");
        String nome = input.next();

        switch(x){
            case 1:
                removeAluno(nome);
                break;
            case 2:
                removeCozinheiro(nome);
                break;
            case 3:
                removeInstrutor(nome);
                break;
            case 4:
                removeMonitor(nome);
                break;
            case 5:
                removeProfessor(nome);
                break;
            case 6:
                removeServente(nome);
                break;
            default:
        }
        if(input){
            input.close();
        }
    }

    //atualiza todos os atributos de uma pessoa a partir do nome, para cada pessoa uma chamada de função
    public static void atualiza(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja atualizar");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        System.out.println("Nome: ");
        String name = input.next();

        switch(x){
            case 1:
                atualizaAluno(name);
                break;
            case 2:
                atualizaCozinheiro(name);
                break;
            case 3:
                atualizaInstrutor(name);
                break;
            case 4:
                atualizaMonitor(name);
                break;
            case 5:
                atualizaProfessor(name);
                break;
            case 6:
                atualizaServente(name);
                break;
            default:
        }
        if(input){
            input.close();
        }
    }

    //realiza uma listagem de todas as pessoas cadastradas no array escolhido, para cada pessoa uma chamada de função
    public static void list(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja listar");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        switch(x){
            case 1:
                listAlunos();
                break;
            case 2:
                listCozinheiros();
                break;
            case 3:
                listInstrutores();
                break;
            case 4:
                listMonitores();
                break;
            case 5:
                listProfessores();
                break;
            case 6:
                listServentes();
                break;
            default:
        }
        if(input){
            input.close();
        }
    }

    // todas as chamadas de funções para a pessoa aluno
    public static void insereAluno(String name, String cpf){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getNome().equals(name)){
                System.out.println("Aluno já existe");
                return;
            }
        }
        
        System.out.println("Turma: ");
        String turma = input.next();
        System.out.println("Curso: ");
        String curso = input.next();

        alunos.add(new Alunos(name, cpf, turma, curso));
        if(input){
            input.close();
        }
    }

    public static void consultaAluno(String name){
        boolean confirm = false;
        for(int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getNome().equals(name)){

                System.out.println("Nome: "+ alunos.get(i).getNome());
                System.out.println("CPF: "+ alunos.get(i).getCpf());
                System.out.println("Turma: "+ alunos.get(i).getTurma());
                System.out.println("Curso: "+ alunos.get(i).getCurso());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Aluno não encontrado");
        }
        confirm = false;
    }

    public static void removeAluno(String name){
        boolean confirm = false;
        for(int i = 0; i < alunos.size(); i++){ 
            if (alunos.get(i).getNome().equals(name)){
                alunos.remove(i);

                System.out.println("Aluno removido");
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Aluno não encontrado");
        }
        confirm = false;
    }

    public static void atualizaAluno(String name){
        Scanner input = new Scanner(System.in);

        boolean confirm = false;
        for(int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getNome().equals(name)){

                System.out.println("Digite novo CPF: ");
                String cpf = input.nextLine();
                alunos.get(i).setCpf(cpf);

                System.out.println("Digite nova turma: ");
                String turma = input.nextLine();
                alunos.get(i).setTurma(turma);

                System.out.println("Digite novo curso: ");
                String curso = input.nextLine();
                alunos.get(i).setCurso(curso);

                System.out.println("Nome: "+ alunos.get(i).getNome());
                System.out.println("Novo CPF: "+ alunos.get(i).getCpf());
                System.out.println("Nova Turma: "+ alunos.get(i).getTurma());
                System.out.println("Novo Curso: "+ alunos.get(i).getCurso());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Aluno não encontrado");
        }
        confirm = false;
        if(input){
            input.close();
        }
    }

    public static void listAlunos(){
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i).getNome());
        }
    }

    // todas as chamadas de funções para a pessoa cozinheiro
    public static void insereCozinheiro(String name, String cpf){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < cozinheiros.size(); i++){
            if (cozinheiros.get(i).getNome().equals(name)){
                System.out.println("Cozinheiro ja cadastrado");
                return;
            }
        }

        System.out.println("Salário: ");
        int salario = input.nextInt();

        cozinheiros.add(new Cozinheiros(name, cpf, salario));
        if(input){
            input.close();
        }
    }
    
    public static void consultaCozinheiro(String name){
        boolean confirm = false;
        for(int i = 0; i < cozinheiros.size(); i++){
            if (cozinheiros.get(i).getNome().equals(name)){
                
                System.out.println("Nome: "+ cozinheiros.get(i).getNome());
                System.out.println("CPF: "+ cozinheiros.get(i).getCpf());
                System.out.println("Salario: "+ cozinheiros.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Cozinheiro não encontrado");
        }
        confirm = false;
        if(input){
            input.close();
        }
    }

    public static void removeCozinheiro(String name){
        boolean confirm = false;
        for(int i = 0; i < cozinheiros.size(); i++){
            if (cozinheiros.get(i).getNome().equals(name)){
                cozinheiros.remove(i);

                System.out.println("Cozinheiro removido");
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Cozinheiro não encontrado");
        }
        confirm = false;
    }

    public static void atualizaCozinheiro(String name){
        Scanner input = new Scanner(System.in);
        
        boolean confirm = false;
        for(int i = 0; i < cozinheiros.size(); i++){
            if (cozinheiros.get(i).getNome().equals(name)){

                System.out.println("Digite novo CPF: ");
                String cpf = input.nextLine();
                cozinheiros.get(i).setCpf(cpf);

                System.out.println("Digite novo salário: ");
                int salario = input.nextInt();
                cozinheiros.get(i).setSalario(salario);

                System.out.println("Nome: "+ cozinheiros.get(i).getNome());
                System.out.println("Novo CPF: "+ cozinheiros.get(i).getCpf());
                System.out.println("Novo Salario: "+ cozinheiros.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Cozinheiro não encontrado");
        }
        confirm = false;
        if(input){
            input.close();
        }
    }

    public static void listCozinheiros(){
        for(int i = 0; i < cozinheiros.size(); i++){
            System.out.println(cozinheiros.get(i).getNome());
        }
    }

    // todas as chamadas de funções para a pessoa instrutor
    public static void insereInstrutor(String name, String cpf){
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < instrutores.size(); i++){
            if (instrutores.get(i).getNome().equals(name)){
                System.out.println("Instrutor ja cadastrado");

                return;
            }
        }

        System.out.println("Salário: ");
        int salario = input.nextInt();
        System.out.println("Graduação: ");
        int graduacao = input.nextInt();

        instrutores.add(new Instrutores(name, cpf, salario, graduacao));
        if(input){
            input.close();
        }
    }
    
    public static void consultaInstrutor(String name){
        boolean confirm = false;
        for(int i = 0; i < instrutores.size(); i++){
            if (instrutores.get(i).getNome().equals(name)){

                System.out.println("Nome: "+ instrutores.get(i).getNome());
                System.out.println("CPF: "+ instrutores.get(i).getCpf());
                System.out.println("Salario: "+ instrutores.get(i).getSalario());
                System.out.println("Graduacao: "+ instrutores.get(i).getGraduacao());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Instrutor não encontrado");
        }
        confirm = false;
    }

    public static void removeInstrutor(String name){
        boolean confirm = false;
        for(int i = 0; i < instrutores.size(); i++){
            if (instrutores.get(i).getNome().equals(name)){
                instrutores.remove(i);

                System.out.println("Instrutor removido");
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Instrutor não encontrado");
        }
        confirm = false;
    }

    public static void atualizaInstrutor(String name){
        Scanner input = new Scanner(System.in);

        boolean confirm = false;
        for(int i = 0; i < instrutores.size(); i++){
            if (instrutores.get(i).getNome().equals(name)){

                System.out.println("Digite novo CPF: ");
                String cpf = input.nextLine();
                instrutores.get(i).setCpf(cpf);

                System.out.println("Digite novo salário: ");
                int salario = input.nextInt();
                instrutores.get(i).setSalario(salario);

                System.out.println("Digite nova graduação: ");
                int graduacao = input.nextInt();
                instrutores.get(i).setGraduacao(graduacao);

                System.out.println("Nome: "+ instrutores.get(i).getNome());
                System.out.println("Novo CPF: "+ instrutores.get(i).getCpf());
                System.out.println("Novo Salario: "+ instrutores.get(i).getSalario());
                System.out.println("Nova Graduacao: "+ instrutores.get(i).getGraduacao());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Instrutor não encontrado");
        }
        confirm = false;
        if(input){
            input.close();
        }
    }

    public static void listInstrutores(){
        for(int i = 0; i < instrutores.size(); i++){
            System.out.println(instrutores.get(i).getNome());
        }
    }

    // todas as chamadas de funções para a pessoa monitor
    public static void insereMonitor(String name, String cpf){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < monitores.size(); i++){
            if (monitores.get(i).getNome().equals(name)){
                System.out.println("Monitor ja cadastrado");

                return;
            }
        }

        System.out.println("Salário: ");
        int salario = input.nextInt();

        monitores.add(new Monitores(name, cpf, salario));
        if(input){
            input.close();
        }
    }
    
    public static void consultaMonitor(String name){
        boolean confirm = false;
        for(int i = 0; i < monitores.size(); i++){
            if (monitores.get(i).getNome().equals(name)){

                System.out.println("Nome: "+ monitores.get(i).getNome());
                System.out.println("CPF: "+ monitores.get(i).getCpf());
                System.out.println("Salario: "+ monitores.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Monitor não encontrado");
        }
        confirm = false;
    }

    public static void removeMonitor(String name){
        boolean confirm = false;
        for(int i = 0; i < monitores.size(); i++){
            if (monitores.get(i).getNome().equals(name)){

                monitores.remove(i);
                System.out.println("Monitor removido");
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Monitor não encontrado");
        }
        confirm = false;
    }

    public static void atualizaMonitor(String name){
        Scanner input = new Scanner(System.in);
        
        boolean confirm = false;
        for(int i = 0; i < monitores.size(); i++){
            if (monitores.get(i).getNome().equals(name)){

                System.out.println("Digite novo CPF: ");
                String cpf = input.nextLine();
                monitores.get(i).setCpf(cpf);

                System.out.println("Digite novo salário: ");
                int salario = input.nextInt();
                monitores.get(i).setSalario(salario);

                System.out.println("Nome: "+ monitores.get(i).getNome());
                System.out.println("Novo CPF: "+ monitores.get(i).getCpf());
                System.out.println("Novo Salario: "+ monitores.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Monitor não encontrado");
        }
        confirm = false;
        if(input){
            input.close();
        }
    }

    public static void listMonitores(){
        for(int i = 0; i < monitores.size(); i++){
            System.out.println(monitores.get(i).getNome());
        }
    }

    // todas as chamadas de funções para a pessoa professor
    public static void insereProfessor(String name, String cpf){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(name)){
                System.out.println("Professor ja cadastrado");
                return;
            }
        }

        System.out.println("Salário: ");
        int salario = input.nextInt();
        System.out.println("Salário: ");
        int graduacao = input.nextInt();

        professores.add(new Professores(name, cpf, salario, graduacao));
        if(input){
            input.close();
        }
    }
    
    public static void consultaProfessor(String name){
        boolean confirm = false;
        for(int i = 0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(name)){
                System.out.println("Nome: "+ professores.get(i).getNome());
                System.out.println("CPF: "+ professores.get(i).getCpf());
                System.out.println("Salario: "+ professores.get(i).getSalario());
                System.out.println("Graduacao: "+ professores.get(i).getGraduacao());
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Professor não encontrado");
        }
        confirm = false;
    }

    public static void removeProfessor(String name){
        boolean confirm = false;
        for(int i = 0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(name)){
                professores.remove(i);
                System.out.println("Professor removido");
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Professor não encontrado");
        }
        confirm = false;
    }

    public static void atualizaProfessor(String name){
        Scanner input = new Scanner(System.in);

        boolean confirm = false;
        for(int i = 0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(name)){

                System.out.println("Digite novo CPF: ");
                String cpf = input.nextLine();
                professores.get(i).setCpf(cpf);

                System.out.println("Digite novo salário: ");
                int salario = input.nextInt();
                professores.get(i).setSalario(salario);

                System.out.println("Digite nova graduação: ");
                int graduacao = input.nextInt();
                professores.get(i).setGraduacao(graduacao);

                System.out.println("Nome: "+ professores.get(i).getNome());
                System.out.println("Novo CPF: "+ professores.get(i).getCpf());
                System.out.println("Novo Salario: "+ professores.get(i).getSalario());
                System.out.println("Nova Graduacao: "+ professores.get(i).getGraduacao());
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Professor não encontrado");
        }
        confirm = false;
        if(input){
            input.close();
        }
    }

    public static void listProfessores(){
        for(int i = 0; i < professores.size(); i++){
            System.out.println(professores.get(i).getNome());
        }
    }

    // todas as chamadas de funções para a pessoa servente
    public static void insereServente(String name, String cpf){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < serventes.size(); i++){
            if (serventes.get(i).getNome().equals(name)){
                System.out.println("Servente ja cadastrado");
                return;
            }
        }

        System.out.println("Salário: ");
        int salario = input.nextInt();

        serventes.add(new Serventes(name, cpf, salario));
        if(input){
            input.close();
        }
    }
    
    public static void consultaServente(String name){
        boolean confirm = false;
        for(int i = 0; i < serventes.size(); i++){
            if (serventes.get(i).getNome().equals(name)){
                System.out.println("Nome: "+ serventes.get(i).getNome());
                System.out.println("CPF: "+ serventes.get(i).getCpf());
                System.out.println("Salario: "+ serventes.get(i).getSalario());
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Servente não encontrado");
        }
        confirm = false;
    }

    public static void removeServente(String name){
        boolean confirm = false;
        for(int i = 0; i < serventes.size(); i++){
            if (serventes.get(i).getNome().equals(name)){
                serventes.remove(i);
                System.out.println("Servente removido");
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Servente não encontrado");
        }
        confirm = false;
    }

    public static void atualizaServente(String name){
        Scanner input = new Scanner(System.in);
        
        boolean confirm = false;
        for(int i = 0; i < serventes.size(); i++){
            if (serventes.get(i).getNome().equals(name)){

                System.out.println("Digite novo CPF: ");
                String cpf = input.nextLine();
                serventes.get(i).setCpf(cpf);

                System.out.println("Digite novo salário: ");
                int salario = input.nextInt();
                serventes.get(i).setSalario(salario);

                System.out.println("Nome: "+ serventes.get(i).getNome());
                System.out.println("Novo CPF: "+ serventes.get(i).getCpf());
                System.out.println("Novo Salario: "+ serventes.get(i).getSalario());
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("\nServente não encontrado");
        }
        confirm = false;
        if(input){
            input.close();
        }
    }

    public static void listServentes(){
        for(int i = 0; i < serventes.size(); i++){
            System.out.println(serventes.get(i).getNome());
        }
    }

    //função que distribui os materiais para a pessoa escolhida
    //realiza uma chamada da função distribuiMaterial(), que existe em cada classe de pessoas
    //incrementa em 1 todos os atributos de recursos materiais da pessoa escolhida
    public void distribuiMateriais(int numero){
        switch(numero){
            case 1:
                if(alunos.size() >= 1){
                    for(int i = 0; i < alunos.size(); i++){
                        alunos.get(i).distribuiMaterial();
                    }
                }
                break;
            case 2:
                if(cozinheiros.size() >= 1){
                    for(int i = 0; i < cozinheiros.size(); i++){
                        cozinheiros.get(i).distribuiMaterial();
                    }
                }
                break;
            case 3:
                if(instrutores.size() >= 1){
                    for(int i = 0; i < instrutores.size(); i++){
                        instrutores.get(i).distribuiMaterial();
                    }
                }
                break;
            case 4:
                if(monitores.size() >= 1){
                    for(int i = 0; i < monitores.size(); i++){
                        monitores.get(i).distribuiMaterial();
                    }
                }
                break;
            case 5:
                if(professores.size() >= 1){
                    for(int i = 0; i < professores.size(); i++){
                        professores.get(i).distribuiMaterial();
                    }
                }
                break;
            case 6:
                if(serventes.size() >= 1){
                    for(int i = 0; i < serventes.size(); i++){
                        serventes.get(i).distribuiMaterial();
                    }
                }
                break;
            default:
                System.out.println("erro");
                return;
        }
    }

    

}

