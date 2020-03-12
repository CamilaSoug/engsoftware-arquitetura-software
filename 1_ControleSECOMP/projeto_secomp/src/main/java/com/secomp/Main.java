package com.secomp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read/*Nome de variavel compreensivel*/ = new Scanner(System.in);
       // String participantName = null;
        ArrayList<String> participants = new ArrayList<String>();

        System.out.println("---------------------------------------------");
        System.out.println("SECOMP 2020");
        System.out.println("---------------------------------------------");
        
        //ciação do menu
        
        do {
        System.out.println("Digite a opção desejada:");
        System.out.println("[1]- Nome da Atividade");
        System.out.println("[2]- Inserir aluno");
        System.out.println("[3]- Listar chamada");
        System.out.println("[0]- SAIR");
            
            
        menuOption = read.nextLine();

            switch (menuOption) {
                case "1":
                    System.out.println("Digite o nome da atividade:");
                    String activity = read.nextLine();

                    System.out.println("\n\n---------------------------------------------");
                    System.out.println("Lista de participantes da atividade " + activity);
                    System.out.println("---------------------------------------------");
                    break;
                case "2":
                    inserirAluno();
                    break;
                case "3":
                    System.out.println("\n\n---------------------------------------------");
                    System.out.println("Lista de chamada com todos os participantes da atividade " + activity);
                    System.out.println("---------------------------------------------");
                        for (int i = 0; i < participants.size() - 1; i++) {
                            // imprime com size()-1 pra não mostrar o caractere 0
                            System.out.println(participants.get(i));
                        }
                    break;
                    } 
            }while (!menuOption.equals("0"));
        
    
        
        /*System.out.println("Digite o nome da atividade:");
        String activity = read.nextLine();

        System.out.println("\n\n---------------------------------------------");
        System.out.println("Lista de participantes da atividade " + activity);
        System.out.println("---------------------------------------------");*/

       /* do {
            System.out.println("Digite o nome do aluno ou pressione [0] para sair: ");
            participantName = read.nextLine();
            
            // comparar se esta repetido
            participants.add(participantName);
        } while (participantName.charAt(0) != '0');*/
       //inserirAluno();// Modularização das funçoes

        /*System.out.println("\n\n---------------------------------------------");
        System.out.println("Lista de chamada com todos os participantes da atividade " + activity);
        System.out.println("---------------------------------------------");
        for (int i = 0; i < participants.size() - 1; i++) {
            // imprime com size()-1 pra não mostrar o caractere 0
            System.out.println(participants.get(i));
        }*/

        read.close();
        
    }
   
   private static void inserirAluno() {
       do {   
        System.out.println("Digite o nome do aluno ou pressione [0] para sair: ");
        participantName = read.nextLine();
        participants.add(participantName);
        } while (participantName.charAt(0) != '0');
    }
   
}
