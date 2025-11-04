public class MainComposizioneNaveMotore {
    public static void main(String[] args) {
        // Creo una Nave con un motore
        Nave nave1 = new Nave("Aurora", 32000.5, 12000, 40000);
        System.out.println(nave1);  //Nave{nome='Aurora', stazzaTonnellate=32000.5, motore=Motore{cilindrata=12000, cavalli=40000}}
  
        Motore motoreNave1 = nave1.getMotore();
        System.out.println(motoreNave1);    //Motore{cilindrata=12000, cavalli=40000}
    }
}
