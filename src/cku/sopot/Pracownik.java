package cku.sopot;

public class Pracownik {
    private String nazwisko;
    private String imie;
    private float stawka;
    private float godziny;
    private float staz;

    public Pracownik(String nazwisko, String imie) {
        setNazwisko(nazwisko);
        setImie(imie);
        this.stawka = 0;
        this.godziny = 0;
        this.staz = 0;
    }

    public Pracownik(String nazwisko, String imie, float stawka, float godziny, float staz) {
        setNazwisko(nazwisko);
        setImie(imie);
        setStawka(stawka);
        setGodziny(godziny);
        setStaz(staz);
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko.length()>50)
            this.nazwisko = nazwisko.substring(0, 50);
        else this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie.length()>20)
            this.imie = imie.substring(0, 20);
        else this.imie = imie;
    }

    public float getStawka() {
        return stawka;
    }

    public void setStawka(float stawka) {
        this.stawka = stawka;
    }

    public float getGodziny() {
        return godziny;
    }

    public void setGodziny(float godziny) {
        if(godziny < 0) this.godziny = 0;
        else if(godziny > 320) this.godziny = 320;
        else this.godziny = godziny;
    }

    public float getStaz() {
        return staz;
    }

    public void setStaz(float staz) {
        if(staz < 0) this.staz = 0;
        else if(staz > 55) this.staz = 55;
        else this.staz = staz;
    }
    public float obliczPodstawe(){
        return stawka * godziny;
    }

    public float obliczDodatek(){
        return staz * 0.05F * obliczPodstawe();
    }

    public float obliczWynagrodzenie(){
        return obliczPodstawe() + obliczDodatek();
    }

    @Override
    public String toString() {
        return "Pracownik: " + nazwisko + " " + imie + " " +
                obliczPodstawe() + " + " + obliczDodatek() + " = " + obliczWynagrodzenie();
    }
}
