package programutvikling_Oblig2;

import java.util.ArrayList;
import java.util.List;

public class Rekursjon {

    //Oppgave 1.1
    //Konverter følgende metode til en løsning med rekursjon:
    static int forSum(int x) {
        int sum = 0;
        for(int i = x; i > 0; i--) {
            sum = sum + i;
        }

        return sum;
    }
    //Løsning
    static int sum(int x){
        int totalt = x;

        if(x <= 0){
            return totalt;
        }
        return totalt + sum(--x);
    }
    //--------------------------------------------
    //Oppgave 1.2
    //Implementer metoden pow(int base, int exponent), som skal kalkulere baseexponent. Bruk rekursjon.
    //Løsning
    static int pow(int base, int exponent){

        if(exponent <= 1){
            return base;
        }

        return base * pow(base, exponent-1);
    }
    //--------------------------------------------
    //Oppgave 1.3
    //Implementer en metode som skriver ut verdiene i en tabell baklengs. Bruk rekursjon.
    //Løsning
    static void reverseList(int[] ints, int length){
        int tall = ints[length-1];

        if(length == 1){
            System.out.print("\t" + tall + "\n");
            return;
        }
        System.out.print("\t" + tall);
        reverseList(ints, length-1);

    }
    //Oppgave 1.4
    //Implementer en metode som finner den minste verdien i en heltallstabell. Bruk rekursjon.
    //Løsning
    static int minTall(int[] ints, int length){
        int tall = 1000;
        if(ints[length-1] < tall){
            tall = ints[length-1];
        }
        if(length == 1){
            return tall;
        }
        return minTall(ints, length-1);
    }
    //-------------------------------------------
    static int magiskMetode(int[]tabell, int startIndex){
        if(startIndex == tabell.length-1){
            return tabell[startIndex];
        }

        int current = tabell[startIndex];

        int minRightOfCurrent = magiskMetode(tabell, startIndex);

        return Math.min(current, minRightOfCurrent);
    }
    //-------------------------------------------
    //Oppgave 1.5
    //Implementer en metode som søker etter et gitt heltall i en heltallstabell. Bruk rekursjon.
    // Returner posisjonen til verdien i tabellen eller -1 hvis verdien ikke er i tabellen.
    //Løsning
    static int gittTall(int[] ints, int length, int tall){

        if(ints[length-1] == tall){
            return length-1;
        }

        if(length == 1){
            return -1;
        }
        return gittTall(ints, length-1, tall);
    }
    //EkstraOppgaver:
    //Oppgave 18.14
    //Euler's Number:
    public static double eulersNumber(int n){
        double e = 2;

        if(n == 1){
            return e;
        }
        return e = 1/fakultet(n) + eulersNumber(n-1);
    }
    private static double fakultet(int n){

        if(n == 1){
            return n;
        }
        return n * fakultet(n-1);
    }

    //Oppgave 18.15 Recursive backtracking
    //Eight Queens:

}

