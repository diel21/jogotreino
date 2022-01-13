package ClasseMain;

import classes.*;
import metodos.*;

import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opc = Integer.parseInt(JOptionPane.showInputDialog(
                "O que deseja Fazer\n" +
                "1- Criar Liga\n" +
                "2- Criar Time\n" +
                "3- Criar Jogador\n" +
                "4- Mostrar Jogadores do Time\n" +
                "5- Mostrar Times\n" +
                "6- Mostrar Ligas"));
        if (opc == 1){
            Liga liga = new Liga(JOptionPane.showInputDialog("Digite o Nome da Liga"));
            criarLiga criarliga = new criarLiga(liga);
        }
        if (opc == 2){
            String nome = JOptionPane.showInputDialog("Nome do Time");

            Liga liga = new Liga("");
            liga.imprimirligas();
            System.out.println("Escolha a Liga pelo indice");
            liga = liga.getLigas().get(tec.nextInt());

            System.out.println("Qual a quantidade de Dinheiro do Time");
            int dinheiro  = tec.nextInt();

            Time time = new Time(nome,liga,dinheiro);
        }
        if (opc == 3){


        }
    }
}
