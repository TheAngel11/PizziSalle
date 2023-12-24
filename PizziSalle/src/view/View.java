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
        \nWould you like to add more ingredients to the pizza?
        Available ingredients:
                1. Tomato sauce
                2. Cheese
                3. Ham
                4. Pineapple
                5. Chicken
                6. Bacon
                7. Frankfurt
                8. Egg
                9. Sausage
                10. Onion
                11. Miniburgers
                12. Tuna
                13. Peperoni
                14. Olives
                15. BBQ Sauce
                16. Cheddar
                17. Roquefort
                18. Tomato slices
                19. Anchovies
                20. Prawns
                21. Beef
                22. Carbonara sauce
                23. Mushrooms
                24. “Jamón Serrano”
                25. Brie
                26. Mozzarella
                27. Emmental
                28. Bell pepper
                29. Artichoke
                30. Goat cheese
                31. “Sobrassada”
                32. Honey
                
                33. None
                
        Please enter the number of the ingredient you want to add:\s""";
        

    private static final String SELECT_CRUST_TYPE = """
        \nAvailable crust types:
                1. Original
                2. Thin
                3. Sicilian
                
        Please enter the number of the crust type you want (Original by default):\s""";

    private static final String SELECT_DRINK_MENU = """
        \nAvailable drinks:
                1. Water
                2. Soda
                3. Beer (only for adults)
                
                4. None
       
        Please enter the number of the drink you want:\s""";

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


    public void showDrinkMenu() {
        System.out.print(SELECT_DRINK_MENU);
    }
}
