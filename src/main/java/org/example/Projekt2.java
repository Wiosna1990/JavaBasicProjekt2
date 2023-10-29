package org.example;

public class Projekt2 {
    public static void main(String[] args)
    {
        Ksiegowosc ksiegowosc = new Ksiegowosc();
        LekarzRodzinny lekarzRodzinny1 = new LekarzRodzinny("Natalia", "Bur",100.00);
        ksiegowosc.DrukujPoleceniePrzelewu(lekarzRodzinny1);

        LekarzSpecjalista lekarzSpecjalista1 = new LekarzSpecjalista("Agnieszka", "Kot", 100.00);
        ksiegowosc.DrukujPoleceniePrzelewu(lekarzSpecjalista1);
        //nie wolno tworzyc obiektow klasy abstrakcyjnej
        // OosbaZKontraktem ozk = new OsobaZKontraktem();

    }
}