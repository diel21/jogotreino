package classes;

import java.util.ArrayList;

public class Time{
    private Liga liga;
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private int dinheiroTime;

    public Time(String nome, Liga liga,int dinheiroTime) {
        this.dinheiroTime = dinheiroTime;
        this.nome = nome;
        this.liga = liga;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void setJogadores(Jogador jogador){jogadores.add(jogador);}

    public int getDinheiroTime() {
        return dinheiroTime;
    }

    public void setDinheiroTime(int dinheiroTime) {
        this.dinheiroTime += dinheiroTime;
    }
}
