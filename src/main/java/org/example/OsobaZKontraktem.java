package org.example;
// po to tworzymy klase abstrakcyjna OsobaZKontraktem zeby nie powtarzac kodu (funkcja dzialala dobrze IleDoWyplaty dla lekarza Rodzinnego i Specjalisty)
//jezeli klasa zawiera funckej abstrakcyjna to tez musi byc abstrakcyjna
abstract public class OsobaZKontraktem extends Osoba
{
    public OsobaZKontraktem(String imie, String nazwisko)
    {
        super(imie,nazwisko);

    }
    public abstract double IleDoWyplaty();
}
