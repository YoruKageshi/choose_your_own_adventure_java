import java.util.Scanner;

public class Story extends Choices {

    static Story story = new Story();
    static Scanner scan = new Scanner(System.in);
    static int choices;

    public static void main(String[] args) {

        System.out.println("You've forgotten your name once again. What is it? ");
        story.setName(scan.nextLine());

        System.out.println("\nRemember your name for good this time, " + story.getName() + ".\n");
        System.out.println("You need to make money. Should you become a) an Adventurer, or b) an Assassin?");
        choices += 1;

        boolean input = true;

        while (input) {

            String answer = scan.nextLine();

            if (answer.equals("a")) {

                story.setProfession("Adventurer");
                break;

            } else if (answer.equals("b")) {

                story.setProfession("Assassin");
                break;

            } else {

                System.out.println("Please enter either 'a' or 'b'.");
            }
        }

        switch (story.getProfession()) {

            case "Adventurer": {

                while (true) {

                    story.adventurer();

                    System.out.println("\nPress any type any character and hit <ENTER> to play again; otherwise, just press <ENTER>");
                    String answer = scan.nextLine();

                    if (answer.isEmpty()) {

                        int totalChoices = story.getChoices() + choices;

                        System.out.println("GAME STATS\n");
                        System.out.println("Name: " + story.getName());

                        if (endings.size() == 9) {

                            System.out.println("Endings: ALL ENDINGS ACHIEVED");

                        } else {

                            System.out.println("Endings: " + endings.size());

                        }

                        System.out.println("Playthroughs: " + story.getPlaythroughs());
                        System.out.println("Choices: " + totalChoices);
                        System.out.println("Last Route: " + story.getProfession());

                        if (story.getProfession().equals("Assassin")) {

                            System.out.println("Assassin Name: " + story.getAssassinName());
                            System.out.println("Organization: " + story.getOrganization());

                        } else {

                            System.out.println("Adventurer Name: " + story.getAdventName());
                            System.out.println("Class: " + story.getAdventClass());

                        }

                        System.out.println("Thanks for playing!");
                        System.exit(1);

                    } else {

                        System.out.println("You need to make money. Should you become a) an Adventurer, or b) an Assassin?");
                        choices += 1;

                        while (true) {

                            answer = scan.nextLine();

                            if (answer.equals("a")) {

                                story.setProfession("Adventurer");
                                break;

                            } else if (answer.equals("b")) {

                                story.setProfession("Assassin");
                                break;

                            } else {

                                System.out.println("Please enter either 'a' or 'b'.");
                            }
                        }

                        switch (story.getProfession()) {

                            case "Adventurer": {

                                story.adventurerLoop();

                            }

                            case "Assassin": {

                                story.assassin();
                            }
                        }
                    }
                }
            }

            case "Assassin": {


            }
        }
    }
}
