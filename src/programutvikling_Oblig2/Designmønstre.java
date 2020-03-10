package programutvikling_Oblig2;

public class Designmønstre {

    //Oppgave 3.1
    //Beskriv et problem som passer for designmønsteret State og et problem som passer for Strategy.
    /*STATE:
    State er et designmønster som egner seg godt til problemer hvor en klasse kan ha flere forskjellige statuser, som
    den "toggler" mellom.
    Eksempel:
    Et lys med 3 forskjellige styrker, Svak-, Normal- og Sterk lysstyrke. Kan bruke state designmønstereret for å
    switche mellom de forskjellige styrkene.
     */
    /*STRATEGY:
    Strategy er et designmønster som egner seg til å løse prøblemer hvor programmer må gjøre foskjellige ting basert på
    en eller annen variabel.
    Eksempel:
    I Oblig 1 brukte vi strategy til å velge om programmet skulle lagre eller lese til en .txt fil eller en .jobj fil.
     */

    //Oppgave 3.2
    //Skriv Java implementasjonen for problemet dere beskrev i 3.1 for State designmønsteret.

}

interface LysStatus {
    LysStatus endreStyrke();
    String getStatus();
}

class Lys_AV implements LysStatus {

    @Override
    public LysStatus endreStyrke() {
        return new Lys_Svak();
    }

    @Override
    public String getStatus() {
        return "AV";
    }
}

class Lys_Svak implements LysStatus {

    @Override
    public LysStatus endreStyrke() {
        return new Lys_Normal();
    }

    @Override
    public String getStatus() {
        return "Svak";
    }
}

class Lys_Normal implements LysStatus {

    @Override
    public LysStatus endreStyrke() {
        return new Lys_Sterk();
    }

    @Override
    public String getStatus() {
        return "Normal";
    }
}

class Lys_Sterk implements LysStatus {

    @Override
    public LysStatus endreStyrke() {
        return new Lys_AV();
    }

    @Override
    public String getStatus() {
        return "Sterk";
    }
}

class Lys {

    private LysStatus status = new Lys_AV();


    public void klikk() {
        status = status.endreStyrke();
    }

    public void printStatus() {
        System.out.println(status.getStatus());
    }

}