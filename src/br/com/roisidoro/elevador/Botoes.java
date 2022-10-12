
package br.com.roisidoro.elevador;

import java.util.Scanner;

public class Botoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevador elevador1 = new Elevador();
        
        // abaixo escolhemos se vamos ou nao usar o elevador
        
        System.out.println("Quer chamar o elevador?\n1 - Sim\n2 - Não");
        int escolha = sc.nextInt();
        
        // Ao escolher que sim verificamos se alguém entrou ou saiu do elevador,
        // se o elevador subiu ou desceu e se alguém chamou ele.
        //Sempre de 1 em 1 pessoa e de 1 em 1 andar.
        
        // Como os botões são específicos não tem a possibilidade de alguém digitar
        // um botão diferente dos propostos
        
        while (escolha == 1){
                
                if (escolha == 1) {
                    
                    do {
                        System.out.println("\n" + elevador1 + "\n");

                        System.out.println("1 - Entrou alguém\n2 - Saiu alguém\n3 - Subiu \n"
                                + "4 - Desceu \n5 - Ninguém chamou o elevador.");
                        int menu = sc.nextInt();

                        while (menu != 5) {
                            if (menu == 1){
                                elevador1.entrar();
                                elevador1.escolherElevador();

                                System.out.println("\n" + elevador1 + "\n");
                                System.out.println("1 - Entrou alguém\n2 - Saiu alguém\n3 - Subiu \n"
                                + "4 - Desceu \n5 - Ninguém chamou o elevador.");
                                menu = sc.nextInt();
                            }
                            if (menu == 2) {
                                elevador1.sair();
                                elevador1.escolherElevador();
                                System.out.println("\n" + elevador1 + "\n");
                                System.out.println("1 - Entrou alguém\n2 - Saiu alguém\n3 - Subiu \n"
                                + "4 - Desceu \n5 - Ninguém chamou o elevador.");
                                menu = sc.nextInt();
                            }
                            if (menu == 3){
                                elevador1.subir();
                                elevador1.escolherElevador();
                                System.out.println("\n" + elevador1 + "\n");
                                System.out.println("1 - Entrou alguém\n2 - Saiu alguém\n3 - Subiu \n"
                                + "4 - Desceu \n5 - Ninguém chamou o elevador.");
                                menu = sc.nextInt();
                            }
                            if (menu == 4) {
                                elevador1.descer();
                                elevador1.escolherElevador();
                                System.out.println("\n" + elevador1 + "\n");
                                System.out.println("1 - Entrou alguém\n2 - Saiu alguém\n3 - Subiu \n"
                                + "4 - Desceu \n5 - Ninguém chamou o elevador.");
                                menu = sc.nextInt();
                            }
                            
                        }    
                        System.out.println("\nQuer chamar o elevador?\n1 - Sim\n2 - Não");
                        int escolha1 = sc.nextInt();
                        escolha = escolha1;
                        elevador1.escolherElevador();
                        System.out.println(elevador1);
                        
                        
                    }
                    while (escolha != 2); 
                } 
        }   
    }        
}
