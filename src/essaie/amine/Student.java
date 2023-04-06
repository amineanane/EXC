package essaie.amine;

class Student extends Person {

    private long ids;
    public Student(String name, String surname, int age, String email, long ids ){
        super(name,surname,age,email);

        this.ids=ids;
    }
    @Override
    long getId()
    {
        return ids;
    }
    @Override
    public String toString() {
        return "The full name is" + super.getName() + " " + super.getSurname() + "L email" + super.getEmail()
                + "The age is " + super.getAge() + "the id is " +getId();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }
}
