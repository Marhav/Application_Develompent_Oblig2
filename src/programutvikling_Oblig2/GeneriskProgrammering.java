package programutvikling_Oblig2;

public class GeneriskProgrammering<E> {

    //Oppgave 2.1
    //Implementer en generisk metode som skriver ut en array. Metoden skal støtte forskjellige typer arrayer.
    public void writeArray(E[] ary) {

        for(E obj : ary){
            System.out.print("\t"+obj);
        }
        System.out.println("\n");
    }
    //Oppgave 2.2
    //private Object[] elems;
    public void reverseArray(E[] ary){

        //elems = new Object[ary.length];
        for(int i = 0; i < ary.length/2; i++){
            E temp = ary[i];
            ary[i] = ary[ary.length-i-1];
            ary[ary.length-i-1] = temp;
        }

    }
}

