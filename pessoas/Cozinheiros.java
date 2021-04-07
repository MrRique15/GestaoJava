package trab1.pessoas;

public class Cozinheiros extends Pessoa{
    //atributos
    // private String nome;
    // private String cpf;
    private int salario;

    //materiais que podem ser entregues
    private int sabaoBarra = 0;

    public Cozinheiros(String name, String num, int salary){
        // this.nome = name;
        // this.cpf = num;
        super(name, num);
        this.salario = salary;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //função presente em todas as pessoas, faz a distribuição dos materiais associados à cada pessoa
    //função é chamada na classe Distribuicao
    //incrementa em 1 a quantidade de materiais
    public void distribuiMaterial(){
        this.sabaoBarra = this.sabaoBarra + 1;
    }
}
