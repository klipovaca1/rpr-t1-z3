package ba.unsa.etf.rpr.tutorijal_01;

public class Sat {
    private int sati, minute, sekunde;
    public Sat (int h, int m, int s) {
        postavi (h, m, s);
    }
    public void postavi (int h, int m, int s) {
        sati = h;
        minute = m;
        sekunde = s;
    }
    public void sljedeci () {
        sekunde = sekunde + 1;
        if (sekunde == 60) {
            sekunde = 0;
            minute = minute + 1;
        }
        if (minute == 60) {
            minute = 0;
            sati = sati + 1;
        }
        if (sati == 24)
            sati = 0;
    }
    public void prethodni () {
        sekunde = sekunde - 1;
        if (sekunde == -1) {
            sekunde = 59;
            minute = minute - 1;
        }
        if (minute == -1) {
            minute = 59;
            sati = sati - 1;
        }
        if (sati == -1)
            sati = 23;
    }
    public void pomjeriZa (int pomak) {
        if (pomak >= 0)
            for (int i = 0; i < pomak; i = i + 1)
                sljedeci ();
        else
            for (int i = 0; i > pomak; i = i - 1)
                prethodni ();
    }
    public int dajSate () {
        return sati;
    }
    public int dajMinute () {
        return minute;
    }
    public int dajSekunde () {
        return sekunde;
    }
    public void Ispisi () {
        System.out.println (dajSate () + ":" + dajMinute () + ":" + dajSekunde ());
    }
    public static void main (String[] args) {
        Sat sat = new Sat (15, 30, 45);
        sat.Ispisi ();
        sat.sljedeci ();
        sat.Ispisi ();
        sat.pomjeriZa (-48);
        sat.Ispisi ();
        sat.postavi (0, 0, 0);
        sat.Ispisi ();
    }
}