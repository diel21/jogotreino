package classes;

import java.util.ArrayList;

public class Liga {
    private String nome;
    private ArrayList<Time> times = new ArrayList<>();
    private ArrayList<Liga>ligas = new ArrayList<>();

    public ArrayList<Liga> getLigas() {
        return ligas;
    }

    public void setLigas(Liga liga) {
        this.ligas.add(liga);
    }

    public Liga(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    public void imprimirligas(){
        String todos = "";
        Liga liga = new Liga("Liga");
        int indice = 0;
        for (Liga ligas : liga.getLigas() ) {
            todos += indice + " - " + liga.getNome() + "\n";
            indice++;
        }
    }
}
