/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lleshi.alessandro
 */
class Nave {
    private String nome;
    private double stazzaTonnellate;
    private Motore motore;
    private double cavalli;
    
    public Nave(String nome,double stazzaTonnellate,Motore motore,double cavalli){
        this.nome = nome;
        this.stazzaTonnellate = stazzaTonnellate;
        this.motore = motore;
        this.cavalli = cavalli;
    }
    public Motore getMotore(){
        return motore;
    }
    @Override
    public String toStirng(){
        return "la nave: " + nome + "della stazzaTonnelate paria a: " + stazzaTonnellate + " posside la cilidrata pari a " + motore + " con la potenza dei cavalli pari a: " + cavalli;
    }
        
}
