
package br.com.roisidoro.elevador;

import java.util.Scanner;


public class Elevador {
    Scanner sc = new Scanner(System.in);
    public int andarDoPredio, quantidadePessoas, escolherAndar, elevator1, elevator2, elevator3, elevator4;
    
    
    public Elevador() {
        this.andarDoPredio = andarDoPredio;
        this.quantidadePessoas = quantidadePessoas;
        this.escolherAndar = escolherAndar;
        this.elevator1 = elevator1;
        this.elevator2 = elevator2;
        this.elevator3 = elevator3;
        this.elevator4 = elevator4;
    }
    
    public void escolherElevador (){
       
            if (quantidadePessoas < 7){
                elevator1 = quantidadePessoas;
                elevator2 = 0;
                elevator3 = 0;
                elevator4 = 0;
            } else if (quantidadePessoas < 13) {
                elevator2 = quantidadePessoas - 6;
                elevator3 = 0;
                elevator4 = 0;
            } else if (quantidadePessoas < 19) {
                elevator3 = quantidadePessoas - 12;
                elevator4  = 0;
            } else if (quantidadePessoas < 25) {
                elevator4 = quantidadePessoas - 18;
            }
        
    }
           
    public void subir (){
        int i = 1;
        if (escolherAndar < 12){
            escolherAndar+= i;
        } else {
            escolherAndar = 12;
        }
    }
    
    public void descer (){
        int i = 1;
        if (escolherAndar > 0 || escolherAndar >= 6){
            escolherAndar -=i;
        }else {
            andarDoPredio = 0;
        }
    }
    
    public void entrar (){
        int i = 1;
        if (quantidadePessoas < 24){
            quantidadePessoas+= i;
        } 
    }
    
    public void sair (){
        int i = 1;
        
        if (quantidadePessoas > 0 || quantidadePessoas <= 24){
            quantidadePessoas -=i;
        }else {
            quantidadePessoas = 0;
        }
    }

    public int getAndarDoPredio() {
        
        return andarDoPredio;
    }

    public void setAndarDoPredio(int andarDoPredio) {
        
        this.andarDoPredio = andarDoPredio;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        
        this.quantidadePessoas = quantidadePessoas;
    }
    
    public int getEscolherAndar(){
        return escolherAndar;
    }
    
    public void setEscolherAndar(int escolherAndar){
        this.escolherAndar = escolherAndar;
    }
    
    public int getElevator1 (){
        return quantidadePessoas;
    }
    
    public void setElevator1 (int elevator1){
        this.elevator1 = elevator1;
    } 
    
    public int getElevator2(){
        return quantidadePessoas;
    }
    
    public void setElevator2(int elevator2){
        this.elevator2 = elevator2;
    }
    
    public int getElevator3(){
        return elevator3;
    }
    
    public void setElevator3 (int elevator3){
        this.elevator3 = elevator3;
    }
    
    public int getElevator4 (){
        return elevator4;
    }
    
    public void setElevator4 (int elevator4) {
        this.elevator4 = elevator4;
    }

    @Override
    public String toString() {
        return "Andar que o elevador se encontra: " + escolherAndar + 
                "\n" + elevator1 + 
                " pessoas no elevador 1\n" + elevator2 + 
                " pessoas no elevador 2\n" + elevator3 + 
                " pessoas no elevador 3\n" + elevator4 + 
                " pessoas no elevador 4";
        
    }
    
    
}
