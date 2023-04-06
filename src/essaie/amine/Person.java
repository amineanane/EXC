package essaie.amine;

abstract class Person {
    private String name;
    private String surname;
    private int age;
    private String email;

    abstract long getId();

    public abstract String toString();

    public Person (String name, String surname, int age, String email){
        this.surname = surname;
        this.name=name;
        this.age=age;
        this.email=email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {return false ;}
        if(obj ==this){
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        if (email== null && p.email !=null) {
            return false;
        }
        if (email== null && p.email ==null){
            return this.age== p.age  && this.name.equals(p.name)
                    && this.surname.equals(p.surname);
        }
        else {
        return this.age== p.age && this.email.equals(p.email) && this.name.equals(p.name)
                && this.surname.equals(p.surname);}

    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){return age;}

    public void setSurname(String surname) {this.surname = surname;}

    public void setAge(int age) {this.age = age;}

    public void setName(String name) {this.name = name;}

    public void setEmail(String email) {this.email = email;}

}
