package trab1.pessoas;

public class Alunos extends Pessoa{
    //atributos
    // private String nome;
    // private String cpf;
    private String turma;
    private String curso;
    
    //materiais que podem ser entregues
    private int lapis = 0;
    private int caneta = 0;
    private int caderno = 0;

    public Alunos(String name, String num, String classe, String course){
        super(name, num);
        this.turma = classe;
        this.curso = course;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurma() {
        return this.turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //função presente em todas as pessoas, faz a distribuição dos materiais associados à cada pessoa
    //função é chamada na classe Distribuicao
    //incrementa em 1 a quantidade de materiais
    public void distribuiMaterial(){
        this.lapis = this.lapis + 1;
        this.caderno = this.caderno + 1;
        this.caneta = this.caneta + 1;
    }
}
