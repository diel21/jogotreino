package classes;

public class Jogador {
    private String Apelido;
    private String cpf;
    private String idade;
    private Time time;
    private int valorJogador;

    public Jogador(String apelido, String cpf, String idade, Time time, int valorJogador) {
        Apelido = apelido;
        this.cpf = cpf;
        this.idade = idade;
        this.time = time;
        this.valorJogador = valorJogador;
    }

    public int getValorJogador() {
        return valorJogador;
    }

    public void setValorJogador(int valorJogador) {
        this.valorJogador = valorJogador;
    }

    public String getApelido() {
        return Apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setApelido(String apelido) {
        Apelido = apelido;
    }
}
