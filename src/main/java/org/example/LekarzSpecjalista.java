package org.example;

public class LekarzSpecjalista extends OsobaZKontraktem
{
    private double liczbaPrzyjetychPacjentow;
    public LekarzSpecjalista (String imie, String nazwisko, double liczbaPrzyjetychPacjentow)
    {
        super(imie,nazwisko); //to wywolanie kosntruktora z klasy Osoba,czyli uzupelnienie imienia i nazwiska
        this.liczbaPrzyjetychPacjentow = liczbaPrzyjetychPacjentow;
    }
    public void Drukuj()
    {
        super.Drukuj();
        System.out.println("Liczba przyjetych pacjentów: " + liczbaPrzyjetychPacjentow);
    }
    public double IleDoWyplaty()
    {
        return liczbaPrzyjetychPacjentow * new ParametryFinansowe().GetKwotaZaPrzyjetegoPacjentaDlaSpecjalisty();
    }
}
