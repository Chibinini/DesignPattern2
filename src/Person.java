public class Person {
    //Fields della classe person
    private String firstName;
    private String lastName;
    private int age;
    private String adress;

    //costruttore che accetta un builder di PersonBuilder in input
    Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.adress = builder.adress;
        this.age = builder.age;
        this.lastName = builder.lastName;
    }

    //getter
    public int getAge() {
        return age;
    }

    //Setter
    public void setAge(int age) {
        this.age = age;
    }

    //getter
    public String getFirstName() {
        return firstName;
    }

    //Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Getter
    public String getLastName() {
        return lastName;
    }

    //Setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter
    public String getAdress() {
        return adress;
    }

    //setter
    public void setAdress(String adress) {
        this.adress = adress;
    }

    //Aggiungo un metodo per stampare i dettagli
    public void stampaDettagli() {
        System.out.println("Nome: " + this.firstName);
        System.out.println("Cognome: " + this.lastName);
        System.out.println("Età: " + this.age);
        System.out.println("Indirizzo : " + this.adress);
    }
}


//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input