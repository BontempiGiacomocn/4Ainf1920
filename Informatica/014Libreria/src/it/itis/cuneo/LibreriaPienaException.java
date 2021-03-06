package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 30/10/2019.
 */
public class LibreriaPienaException extends Exception {

    private int codice;
    private String descrizione;

    public LibreriaPienaException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "LibreriaPienaException{" +
                "codice=" + codice +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
    /*public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }*/



}
