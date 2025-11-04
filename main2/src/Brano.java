/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lleshi.alessandro
 */
class Brano {
    private String titolo;
    private String autore;
    private int classifica;
    
    public Brano(String titolo, String autore, int classifica){
        this.titolo = titolo;
        this.autore = autore;
        this.classifica = classifica;
    }
    
    @Override
    public String toString(){
        return "il titolo del brano e': " + titolo + " dell' autore " + autore + " si e' posizionato nella classifica globale: " + classifica;
    }
}
