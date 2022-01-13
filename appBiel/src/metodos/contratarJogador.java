package metodos;
import classes.*;
import javax.swing.*;
import java.util.ArrayList;

public class contratarJogador {
    private Time time1;
    private Time time2;
    private int i;
    private Liga liga;
    public contratarJogador(Time time1, Time time2) {
        String todos = "";int indice = 0;
        int escolhaLiga;
        int escolhatime;

        for (Liga liga : liga.getLigas()){
            todos += indice + " - " + liga.getNome()+ "\n";
            indice++;
        }
        escolhaLiga = Integer.parseInt(JOptionPane.showInputDialog("Escolha a liga pelo indice"));

        for (Time time :liga.getLigas().get(escolhaLiga).getTimes()){
            todos += indice + " - " + time.getNome()+ "\n";
            indice++;
        }
        escolhatime =  Integer.parseInt(JOptionPane.showInputDialog("Escolha o time pelo indice"));
        for (Jogador jogador :liga.getLigas().get(escolhaLiga).getTimes().get(escolhatime).getJogadores()){
            todos += indice + " - " + jogador.getApelido()+ "\n";
            indice++;
        }
        i = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Jogador Pelo Indice"));
        inserirJogador();
        removerJogador();
    }
    public void inserirJogador(){
        this.time1.setJogadores(time2.getJogadores().get(i));
        this.time1.setDinheiroTime(time1.getDinheiroTime() - time2.getJogadores().get(i).getValorJogador());
    }
    public void removerJogador(){
        this.time2.getJogadores().remove(i);
        this.time2.setDinheiroTime(time2.getDinheiroTime() + time2.getJogadores().get(i).getValorJogador());
    }
}
