package essaie.amine;

public class Main {
       public static void main(String[] args) {
       Person p1= new Student("Mohamed Amine", "Anane",28, null,14757900);
       Person p2= new Professor("Aida", "Anane", 58, "aida.anane@yahoo.fr",16892331);
       Person p3= new Student("Aida", "Anane",28, "Luigi",14757900);
       Person p4= new Professor("Aida", "Anane", 28, null ,14757900);
       System.out.println(p1);
       System.out.println(p2);
        if (p1.equals(p2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        if (p3.equals(p4)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}