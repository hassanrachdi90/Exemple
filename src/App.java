// public class App {

// int age = 25;        // variable
// final double PI = 3.14; // constante
// String nom = "Hassan";

//     public static void main(String[] args)  {
//         System.out.println("Hello, World!");
//         System.out.println("Age: " + age);
//         System.out.println("PI: " + PI);
//         System.out.println("Nom: " + nom);
//     }
// }
public class App {

    static int age = 25;              // variable
    static final double PI = 3.14;    // constante
    static String nom = "Hassan";
    static final int number = 42;     // constante
    static char letter = '@';        // variable
    static char a='\u0040';
    static String txt = "Bonjour Hassan";

      


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Age: " + age);
        System.out.println("PI: " + PI);
        System.out.println("Nom: " + nom);
        System.out.println("Number: " + number);
        System.out.println("Letter: " + letter);
        System.out.println("Character a: " + a);
        System.out.println("Text: " + txt.length()+" "+txt.toUpperCase()+" "+txt.toLowerCase() +" "+txt.contains("Hassan")+" "+txt.startsWith("Bon")
+" "+txt.endsWith("an")+" "+txt.substring(0, 7) +" "+txt.replace("Hassan", "Ahmed") +" "+txt.trim()+" "+txt.toLowerCase() +" "+ txt.toUpperCase()+" "+txt.indexOf("H"));
           Person p = new Person();   
            

}
}