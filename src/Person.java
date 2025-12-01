import java.util.regex.*;
public class Person {
    String email = "test@gmail.com";
    boolean ok = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");


public static void main(String[] args) {
    Person p = new Person();
    System.out.println("Email: " + p.email);
    System.out.println("Is valid email: " + p.ok);

    String txt = "Prix : 120 DH, Quantité : 5 unités";

        Pattern pm = Pattern.compile("\\d+");
        Matcher m = pm.matcher(txt);

        while (m.find()) {
            System.out.println("Nombre trouvé : " + m.group());
        }
    }
}