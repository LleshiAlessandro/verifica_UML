/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lleshi.alessandro
 */
public class Aula {
    private String nomeStanza;
    private int numPosti;

    
    public Aula(String nomeStanza, int numPosti){
        this.nomeStanza = nomeStanza;
        this.numPosti = numPosti;
    }
    
    @Override
    public String toString(){
        return "la stanza: " + nomeStanza + " puoo' contenere: " + numPosti + " alunni ";
    }
}
