package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

    private static final String PIZZI_SALLE_TITLE = """
         _______ _________ _______  _______ _________       _______  _______  _        _        _______\s
        (  ____ )\\__   __// ___   )/ ___   )\\__   __/      (  ____ \\(  ___  )( \\      ( \\      (  ____ \\
        | (    )|   ) (   \\/   )  |\\/   )  |   ) (         | (    \\/| (   ) || (      | (      | (    \\/
        | (____)|   | |       /   )    /   )   | |         | (_____ | (___) || |      | |      | (__   \s
        |  _____)   | |      /   /    /   /    | |         (_____  )|  ___  || |      | |      |  __)  \s
        | (         | |     /   /    /   /     | |               ) || (   ) || |      | |      | (     \s
        | )      ___) (___ /   (_/\\ /   (_/\\___) (___      /\\____) || )   ( || (____/\\| (____/\\| (____/\\
        |/       \\_______/(_______/(_______/\\_______/      \\_______)|/     \\|(_______/(_______/(_______/
            """;

    private static final String SELECT_PIZZA_MENU = """
        Available pizzas:
                1. Margherita
                2. Hawaiian (Ham & pineapple)
                3. Bacon Crispy (Ham, chicken & bacon)
                4. American (Frankfurt, bacon & egg)
                5. Traviata (Bacon, sausage & onion)
                6. Burger (Miniburgers, egg, bacon & onion)
                7. Castellera (Onion, tuna, peperoni & olives)
                8. Cowboy (BBQ Sauce, cheddar, roquefort cheese & bacon)
                9. Texas (BBQ Sauce, onion, tomato slices & chicken)
                10. Coast (Tuna, anchovies, prawns & pineapple)
                11. BBQ (BBQ Sauce, beef, bacon & chicken)
                12. Diablo (Ham, beef, bacon & chicken)
                13. Carbonara (Carbonara sauce, bacon, onion & mushrooms)
                14. Spanish (“Jamón Serrano”, brie, olives & mushrooms)
                15. 4 cheeses (Mozzarella, emmental, roquefort & cheddar)
                16. Pepperoni (Pepperoni, ham, beef & bacon)
                17. Vegetal (Onion, bell pepper, tomato slices, artichoke & mushrooms)
                18. 6 cheeses (Mozzarella, goat cheese, brie, emmental, roquefort & cheddar)
                19. Mallorca (Goat cheese, emmental, cheddar, brie, “sobrassada” & olives)
                20. Carbonara deluxe (Carbonara sauce, bacon, onion, mushrooms, goat cheese & honey)""";

    private static final String SELECT_EXTRA_INGREDIENTS = """
        Would you like to add more ingredients to the pizza?
        Available ingredients:
                1. Ham
                2. Pineapple
                3. Chicken
                4. Bacon
                5. Frankfurt
                6. Egg
                7. Sausage
                8. Onion
                9. Miniburgers
                10. Tuna
                11. Peperoni
                12. Olives
                13. BBQ Sauce
                14. Cheddar
                15. Roquefort cheese
                16. Tomato slices
                17. Anchovies
                18. Prawns
                19. Beef
                20. Carbonara sauce
                21. Mushrooms
                22. “Jamón Serrano”
                23. Brie
                24. Mozzarella
                25. Emmental
                26. Roquefort
                27. Bell pepper
                28. Artichoke
                29. Goat cheese
                30. “Sobrassada”
                31. Honey
                
                32. None
                
        Please enter the number of the ingredient you want to add:\s""";
        

    private static final String SELECT_CRUST_TYPE = """
        Available crust types:
                1. Original
                2. Thin
                3. Sicilian
                
        Please enter the number of the crust type you want (Original by default):\s""";
    private final Scanner scanner;

        public View() {
                this.scanner = new Scanner(System.in);
        }

        public String askForString(){
            return scanner.nextLine();
        }

        public char askForChar() {
            return scanner.next().charAt(0);
        }

        public int askForInteger() {
            while (true) {
                try {
                    return scanner.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("\nError, not an integer please enter an integer\nPlease enter a valid integer: ");
                } finally {
                    scanner.nextLine();
                }
            }
        }

        public void showMessage(String message){
            System.out.print(message);
        }

        public void showTitle(){
            System.out.println(PIZZI_SALLE_TITLE);
        }

        public void showPizzaMenu(){
            System.out.println(SELECT_PIZZA_MENU);
        }

        public void showExtraIngredientsMenu(){
            System.out.print(SELECT_EXTRA_INGREDIENTS);
        }

        public void showCrustTypeMenu(){
            System.out.print(SELECT_CRUST_TYPE);
        }


}
