package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 07/10/2019.
 */
public class PianoCartesiano {

    //attributi
    private Rettangolo rettangolo1;
    private Rettangolo rettangolo2;

    public PianoCartesiano(Rettangolo rettangolo1, Rettangolo rettangolo2){
        this.rettangolo1 = new Rettangolo(rettangolo1);
        this.rettangolo2 = new Rettangolo(rettangolo2);
    }

}
