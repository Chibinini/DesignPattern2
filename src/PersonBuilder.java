public class PersonBuilder {
    //Campi obbligatori
    public String firstName;
    public String lastName;
    //campi opzionali
    public int age;
    public String adress;

    //Costruttore creato con i campi obbligatori
    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public Person build() {
        // Crea un nuovo oggetto Person utilizzando i valori del PersonBuilder.
        // Passa l'istanza corrente del builder (this) al costruttore di Person,
        // che copierà i campi del builder nei campi del nuovo oggetto Person.
        return new Person(this);
    }
}


//Creare una classe Builder che attraverso il costruttore e
// dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video