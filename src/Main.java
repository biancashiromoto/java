public class Main {

    public static void main(String[] args) {

        /* --------------------------------------------------------------------- */

        String cat1 = "Francisco";
        System.out.println(cat1.toUpperCase()); // FRANCISCO
        System.out.println(cat1.toLowerCase()); // francisco
        System.out.println(cat1.length()); // 9

        String cat2 = "Quinzinho";
        String cat2LowerCase = cat2.toLowerCase(); // quinzinho

        System.out.println(cat1.equals(cat2)); // false
        System.out.println(cat2.equalsIgnoreCase(cat2LowerCase)); //true

        /* --------------------------------------------------------------------- */

    }
}