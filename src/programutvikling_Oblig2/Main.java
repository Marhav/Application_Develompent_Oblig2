package programutvikling_Oblig2;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------Rekursjons Oppgaver------------");
        //Oppgave 1.1
        System.out.println("Oppgave 1.1");
        int sum1 = Rekursjon.sum(15);
        int sum2 = Rekursjon.forSum(15);
        System.out.println("\tSum 1 = " + sum1);
        System.out.println("\tSum 2 = " + sum2);

        //Oppgave 1.2
        System.out.println("Oppgave 1.2");
        int base = 3;
        int exponent = 3;
        int sum3 = Rekursjon.pow(base, exponent);
        System.out.println("\t"+base + " opphøyd i " + exponent + " er " + sum3);

        //Oppgave 1.3
        System.out.println("Oppgave 1.3");
        int[] list = {1, 2, 3, 4, 5};
        System.out.println("\tReversert liste:");
        Rekursjon.reverseList(list, list.length);

        //Oppgave 1.4
        System.out.println("Oppgave 1.4");
        int minTall = Rekursjon.minTall(list, list.length);
        System.out.println("\tMin tall: " + minTall);

        //Oppgave1.5
        System.out.println("Oppgave 1.5");
        int tall = 4;
        int gittTall = Rekursjon.gittTall(list, list.length, tall);
        System.out.println("\tGitt tall: " + gittTall);

        System.out.println("--------------Ekstraoppgaver---------------");
        //Ekstraoppgave 18.14
        System.out.println("Ekstraoppgave 18.14");
        double eulersNumber = Rekursjon.eulersNumber(18);
        System.out.println("\tEulers Nummer er: " + eulersNumber);

        System.out.println("------Generisk Programmering Oppgaver------");
        //Oppgave 2.1
        System.out.println("Oppgave 2.1");
        Integer[] list2 = {4,3,7,2,1,8,2};
        GeneriskProgrammering<Integer> ints = new GeneriskProgrammering<>();
        ints.writeArray(list2);

        //Oppgave 2.2
        System.out.println("Oppgave 2.2");
        ints.reverseArray(list2);
        ints.writeArray(list2);

        //Oppgave 2.3
        MyArrayList<Integer> list3 = new MyArrayList<>();
        if(list3.setElement(3)){
            System.out.println("list3 is full!");
        }
        if(list3.setElement(6)){
            System.out.println("list3 is full!");
        }
        if(list3.setElement(10)){
            System.out.println("list3 is full!");
        }

        int arrayLength = list3.size();
        System.out.println(arrayLength);


    }
}
