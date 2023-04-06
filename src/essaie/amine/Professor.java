package essaie.amine;

class Professor extends Person {
    private long idp;

    public Professor (String name, String surname, int age, String email, long idp){
        super(name,surname,age, email);
        this.idp=idp;
    }
    @Override
    long getId()
    {
        return idp;
    }
    @Override
    public String toString() {
        return "The full name is" + super.getName() + " " + super.getSurname() + "L email" + super.getEmail()
                + "The age is " + super.getAge() + "the id is " +getId();
    }

}
