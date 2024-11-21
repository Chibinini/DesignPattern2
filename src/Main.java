public class Main {
    public static void main(String[] args) {
        // Creo un oggetto Person utilizzando il PersonBuilder.
        // I campi obbligatori (nome e cognome) vengono passati direttamente al costruttore del builder,
        // mentre i campi opzionali (età e indirizzo) vengono impostati tramite i metodi setter del builder.
        Person persona = new PersonBuilder("Costanza", "Piraino")
                // mentre i campi opzionali (età e indirizzo) vengono impostati tramite i metodi setter del builder.
                .setAge(30)
                .setAdress("Via Mario Cutelli, 24").build();
        // Infine, il metodo build() crea l'istanza finale di Person.

        //Richiamo il metodo per stampare tutti i dettagli
        persona.stampaDettagli();

        //Secondo oggetto person con la stessa logica del precedente
        Person person = new PersonBuilder("Carmelo", "Scotti")
                .setAge(40)
                .setAdress("Via Roma, 23").build();

        person.stampaDettagli();
    }
}

//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video