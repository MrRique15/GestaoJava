package trab1.pessoas;

public class Professores extends Pessoa{
    //atributos
    // private String nome;
    // private String cpf;
    private int salario;
    public int graduacao;

    //materiais que podem ser entregues
    private int livros;
    private int giz;
    private int apagador;
    private int pincel;

    public Professores(String name, String num, int salary, int graduation){
        // this.nome = name;
        // this.cpf = num;
        super(name, num);
        this.salario = salary;
        this.graduacao = graduation;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String num) {
        this.cpf = num;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salary) {
        this.salario = salary;
    }

    public int getGraduacao() {
        return this.graduacao;
    }

    public void setGraduacao(int graduation) {
        this.graduacao = graduation;
    }

    //função presente em todas as pessoas, faz a distribuição dos materiais associados à cada pessoa
    //função é chamada na classe Distribuicao
    //incrementa em 1 a quantidade de materiais
    public void distribuiMaterial(){
        this.livros = this.livros + 1;
        this.giz = this.giz + 1;
        this.apagador = this.apagador + 1;
        this.pincel = this.pincel + 1;
    } 
}
