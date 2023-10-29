package org.example;

public class Ksiegowosc
{
    public void DrukujPoleceniePrzelewu(OsobaZKontraktem o)
    {
        System.out.println("Polecenie przelewu ");
        System.out.println("Imie i nazwisko: ");
        o.Drukuj();
        System.out.println("Kwota do przelewu " + o.IleDoWyplaty());
        System.out.println();
    }


}
