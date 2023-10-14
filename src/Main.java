import utils.Utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        /* --------------------------------------------------------------------- */

        String cat1 = "Francisco";
//        System.out.println(cat1.toUpperCase()); // FRANCISCO
//        System.out.println(cat1.toLowerCase()); // francisco
//        System.out.println(cat1.length()); // 9

        String cat2 = "Quinzinho";
        String cat2LowerCase = cat2.toLowerCase(); // quinzinho

//        System.out.println(cat1.equals(cat2)); // false
//        System.out.println(cat2.equalsIgnoreCase(cat2LowerCase)); //true

        /* --------------------------------------------------------------------- */

        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now(); // 2023-10-14
        DayOfWeek dayOfTheWeek = today.getDayOfWeek(); // SATURDAY

        // getDisplayName aceita dois parâmetros:
        //    o primeiro é como queremos o nome do dia
        //    o segundo é o local que será usado para determinar o idioma
        String dayOfTheWeekLowercase = dayOfTheWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()).toLowerCase(); // saturday
        // Poderia ser TextStyle.SHORT, e retornaria Sat

        String day = Utils.capitalizeFirstLetter(dayOfTheWeekLowercase);

        Locale brazil = new Locale("pt", "BR");
        // System.out.println(dayOfTheWeek.getDisplayName(TextStyle.FULL, brazil)); // sábado

        String name = "Bianca";
        String welcomeMessage;

        if(now.getHour() >= 0 && now.getHour() < 12) {
            welcomeMessage = "ood morning";
        } else if (now.getHour() >= 12 && now.getHour() < 18) {
            welcomeMessage = "Good afternoon";
        } else if (now.getHour() >= 18 && now.getHour() < 24) {
            welcomeMessage = "Good evening";
        } else {
            welcomeMessage = "Hello";
        }

        // printf - print formatted - exibe uma string formatada
//       System.out.printf("%s, %s.%n Today is %s.%n", welcomeMessage, name, day); // Good afternoon, Bianca. Today is Saturday

        /* --------------------------------------------------------------------- */

        // FOR LOOPS
        for(int i = 1; i <= 10; i += 1) {
            // System.out.println(i);
        }

        /* --------------------------------------------------------------------- */

        // ARRAYS - não é permitido misturar tipos dentro do array!
        //          têm tamanhos fixos
        int[] numbers = new int[3];

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;

        // é necessário usar um FOR LOOP para exibir os valores
        for (int i = 0; i < numbers.length; i += 1) {
            // System.out.println(numbers[i]);
        }

        // outra forma de declarar arrays
        String[] letters = { "A", "B", "C", "D", "E" };
        for (int i = 0; i < letters.length; i += 1) {
            // System.out.println(letters[i]);
        }

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int biggest = array[0];
        int smallest = array[0];
        int sum = 0;

        for(int i = 0; i < array.length; i += 1) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
            sum += array[i];
        }

        // System.out.println("Biggest: " + biggest); // Biggest: 9
        // System.out.println("Smallest: " + smallest); // Smallest: 1

        int avg = sum / array.length;
        // System.out.println("Average: " + avg); // Average: 5

        /* --------------------------------------------------------------------- */

        // TEXT BLOCK

        String message = """
            Hello world!
            This is a text block.""";

         System.out.println(message);

    }
    /* --------------------------------------------------------------------- */

    // FUNÇÕES
    public static void welcome(String name) {
        // System.out.printf("Hello, %s.%n", name);
    }
}