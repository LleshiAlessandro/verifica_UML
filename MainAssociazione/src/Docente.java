/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author lleshi.alessandro
 */
public class Docente {
    private String nome;
    private String materia;
    private ArrayList<Aula> aulee = new ArrayList();
    
    public Docente(String nome, String materia){
        this.nome = nome;
        this.materia = materia;
        
    }
    
     public void assegnaAula(Aula aula1){
         aulee.add(aula1);
     }
     
    public void rimuoviAula(){
         
         
     }
    
    @Override
    public String toString(){
        return "il docente: " + nome +  " che insegna la materia: " + materia + " insegna nelle aulee: " + aulee;
    }
}
