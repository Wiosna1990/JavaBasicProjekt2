package org.example;

public class LekarzRodzinny extends OsobaZKontraktem
{
    private double liczbaZapisanychPacjentow;
    public LekarzRodzinny(String imie,String nazwisko, double liczbaZapisanychPacjentow)
    {
        super(imie,nazwisko); // wywoluje konstruktor z klasy Osoba,wczytanie imienia i nazwiska
        this.liczbaZapisanychPacjentow = liczbaZapisanychPacjentow;
    }
    public void Drukuj()
    {
        super.Drukuj(); //to jest wywolanie metody Drukuj z klasy Osoba,czyli wyswietlenie imie i nazwiska.
        System.out.println("Liczba zapisanych pacjentow: " + this.liczbaZapisanychPacjentow);
    }
    public double IleDoWyplaty()
    {
        return this.liczbaZapisanychPacjentow * new ParametryFinansowe().GetKwotaZaPacjentaPodstawowegoKontaktu();
        //mnoze razy obiekt(anonimowy bez nazwy).wywolanie funkcji, (gdyby byla statyczna to bez obiektu, klasa.funkcja)

    }
}
