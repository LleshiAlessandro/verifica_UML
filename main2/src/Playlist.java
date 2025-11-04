
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lleshi.alessandro
 */
class Playlist {
    private String nome;
    private String propietario;
    private int nBrani;
    private int durataTotaleSec;
    private ArrayList<Brano> brani = new ArrayList();
    
    public Playlist(String nome, String propietario){
        this.nome = nome;
        this.propietario = propietario;
    }
    
    public void aggiungi(Brano brano1) {
       brani.add(brano1);
    }

    public ArrayList<Brano> getBrani(){
            System.out.println(brani);
        
        return brani;
    }

    
    @Override
    public String toString(){
        return "la playlist: " + nome + " del propietario: " + propietario;
    }
}
