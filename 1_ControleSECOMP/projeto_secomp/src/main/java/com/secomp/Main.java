package com.secomp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String participantName = null;
        ArrayList<String> participants = new ArrayList<String>();

        System.out.println("---------------------------------------------");
        System.out.println("SECOMP 2020");
        System.out.println("---------------------------------------------");

        System.out.println("Digite o nome da atividade:");
        String activity = scanner.nextLine();

        System.out.println("\n\n---------------------------------------------");
        System.out.println("Lista de participantes da atividade " + activity);
        System.out.println("---------------------------------------------");

        do {
            System.out.println("Digite o nome do aluno ou pressione [0] para sair: ");
            participantName = scanner.nextLine();
            // comparar se esta repetido
            participants.add(participantName);
        } while (participantName.charAt(0) != '0');

        System.out.println("\n\n---------------------------------------------");
        System.out.println("Lista de chamada com todos os participantes da atividade " + activity);
        System.out.println("---------------------------------------------");
        for (int i = 0; i < participants.size() - 1; i++) {
            // imprime com size()-1 pra não mostrar o caractere 0
            System.out.println(participants.get(i));
        }

        scanner.close();
    }
}
