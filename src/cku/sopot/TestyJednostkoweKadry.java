package cku.sopot;

import java.awt.*;
import java.util.Scanner;

public class TestyJednostkoweKadry {
    static String nazwisko;
    static String imie;
    static float stawka;
    static float godziny;
    static float staz;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(
                System.in
        );
        System.out.print("Podaj nazwisko pracownika: ");
        nazwisko = scanner.nextLine();
        System.out.print("Podaj imię pracownika: ");
        imie = scanner.nextLine();
        System.out.print("Podaj stawkę godzinową: ");
        stawka = scanner.nextFloat();
        System.out.print("Podaj liczbę przepracowanych godzin: ");
        godziny = scanner.nextFloat();
        System.out.print("Podaj staż pracownika: ");
        staz = scanner.nextFloat();

        Pracownik pracownik1 = new Pracownik(nazwisko, imie, stawka, godziny, staz);
        System.out.println(pracownik1.toString());

        Pracownik pracownik2 = new Pracownik("Nowak", "Zenon");
        pracownik2.setStawka(25);
        pracownik2.setGodziny(250);
        pracownik2.setStaz(10);
        System.out.println(pracownik2.toString());
    }
}
