package trab1.pessoas;

public class Serventes extends Pessoa{
    //atributos
    // private String nome;
    // private String cpf;
    private int salario;

    //materiais que podem ser entregues
    private int alvejante = 0;
    private int aguaSanitaria = 0;
    private int sabaoPo = 0;

    public Serventes(String name, String num, int salary){
        // this.nome = name;
        // this.cpf = num;
        super(name, num);
        this.salario = salary;
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

    //função presente em todas as pessoas, faz a distribuição dos materiais associados à cada pessoa
    //função é chamada na classe Distribuicao
    //incrementa em 1 a quantidade de materiais
    public void distribuiMaterial(){
        this.aguaSanitaria = this.aguaSanitaria + 1;
        this.alvejante = this.alvejante + 1;
        this.sabaoPo = this.sabaoPo + 1;
    }
}
