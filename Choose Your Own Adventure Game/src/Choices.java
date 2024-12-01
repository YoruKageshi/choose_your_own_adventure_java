import java.util.Scanner;
import java.util.ArrayList;

public class Choices {

    // Imports
    Scanner scan = new Scanner(System.in);
    static ArrayList<Boolean> endings = new ArrayList<>();

    // Fields
    private String name, profession, adventClass, adventName, assassinName, organization;
    private boolean solitude, renowned, retirement, tragic, legacy, revered, worldDomination, shadowGarden, moonLight;
    private int choices, playthroughs;

    // Getters and Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getProfession() {return profession; }

    public void setProfession(String profession) {this.profession = profession; }

    public String getAdventClass() { return adventClass; }

    public String getOrganization() { return organization; }

    public String getAdventName() { return adventName; }

    public String getAssassinName() { return assassinName; }

    public int getChoices() { return choices; }

    public int getPlaythroughs() { return playthroughs; }

    // Methods
    // Adventurer Route
    public void adventurer() {

        // Choose a Name
        playthroughs += 1;
        System.out.println("Now that you're an adventurer, you need a new name. What should you go by? ");
        adventName = scan.nextLine();

        // Choose a Class
        System.out.println("You also need to choose a class. Which class will you choose? a) Mage, b) Tank, or c) Blade? ");
        choices += 1;

        // Makes sure the user can only enter an acceptable value
        while (true) {

            String answer = scan.nextLine();

            if (answer.equals("a")) {

                adventClass = "Mage";
                break;

            } else if (answer.equals("b")) {

                adventClass = "Tank";
                break;

            } else if (answer.equals("c")) {

                adventClass = "Blade";
                break;

            } else {

                System.out.println("Please enter 'a', 'b', or 'c'.");
            }
        }

        // Handles routes based on the Class chosen
        switch (adventClass) {

            // Mage route
            case "Mage": {

                System.out.println("After officially becoming a Mage, you join a party who was in desperate need of a mage.");
                System.out.println("However, shortly after joining, your party is ambushed. It seems as though some didn't like how easy it was for you to succeed."
                        + " What will you do?");
                System.out.println("a) Run or b) Fight?");
                choices += 1;

                // Makes sure user can only enter an acceptable value
                while (true) {

                    String answer = scan.nextLine();

                    if (answer.equals("a")) {

                        System.out.println("After you ran to get help, your party died. Blaming yourself for the tragedy, you decide to live the rest of your years in absolute solitude.");
                        System.out.println("SOLITUDE ENDING ACHIEVED");

                        // Stores endings in ArrayList for game stats
                        // Checks if ending is already in ArrayList
                        if (endings.contains(solitude)) {

                            System.out.println("Ending already achieved");

                        } else {

                            endings.add(solitude);

                        }
                        break;

                    } else if (answer.equals("b")) {

                        System.out.println("Although you lost your arm in the struggle, you and your party were able to fight off the assailants and live on.");
                        System.out.print(" A few years later, thanks to advanced prosthetic technology, you receive a prosthetic arm that doubles as a staff. It greatly enhances your abilities.");
                        System.out.println("You and your party work hard and gain fame and renown, spreading your name throughout the land.");
                        System.out.println("RENOWNED ENDING ACHIEVED");

                        // Stores endings in ArrayList for game stats
                        // Checks if ending is already in ArrayList
                        if (endings.contains(renowned)) {

                            System.out.println("Ending already achieved");

                        } else {

                            endings.add(renowned);

                        }
                        break;

                    } else {

                        System.out.println("Please enter either 'a' or 'b'.");

                    }
                }
                break;
            }

            // Tank route
            case "Tank": {

                System.out.println("Since your class requires immense fortitude and physical resistance, you decide to go train in the mountains.");
                System.out.print(" You return 10 years later, after gaining strength surpassing even history's greatest warriors.");
                System.out.println("Looking to put use your newly-acquired strength to good use, you consider either a) joining a party, or b) traveling the world solo.");
                choices += 1;

                // Makes sure user can only enter an acceptable value
                while (true) {

                    String answer = scan.nextLine();

                    if (answer.equals("a")) {

                        System.out.println("Due to the unfathomable strength you bring to your party, your party was able to take the highest ranked and most dangerous quests, earning tons of money and" +
                                "becoming rich in no time. Soon you're the richest in the guild, becoming known across the land as the 'Wealth Party'");
                        System.out.println("RENOWNED ENDING ACHIEVED");

                        // Stores endings in ArrayList for game stats
                        // Checks if ending is already in ArrayList
                        if (endings.contains(renowned)) {

                            System.out.println("Ending already achieved");

                        } else {

                            endings.add(renowned);

                        }
                        break;

                    } else if (answer.equals("b")) {

                        System.out.println("After deciding to go solo, you build a reputation as the 'Great Wall'. Concerned for your safety and health, your closest friends advise you to retire. What do you choose? (y/n)");
                        String response = scan.nextLine();
                        choices += 1;

                        // Makes sure user can only enter an acceptable value
                        while (true) {

                            if (response.equals("y")) {

                                System.out.println("Your friends assure you that you made the right decision. You live comfortably for the rest of your days.");
                                System.out.println("RETIREMENT ENDING ACHIEVED");

                                // Stores endings in ArrayList for game stats
                                // Checks if ending is already in ArrayList
                                if (endings.contains(retirement)) {

                                    System.out.println("Ending already achieved");

                                } else {

                                    endings.add(retirement);

                                }
                                break;

                            } else if (response.equals("n")) {

                                System.out.println("Against your friends' wishes, you decide to keep adventuring. A few years later, you lose your life in a tragic accident.");
                                System.out.println("TRAGIC ENDING");

                                // Stores endings in ArrayList for game stats
                                // Checks if ending is already in ArrayList
                                if (endings.contains(tragic)) {

                                    System.out.println("Ending already achieved");

                                } else {

                                    endings.add(tragic);

                                }
                                break;

                            } else {

                                System.out.println("Please enter either 'y' or 'n'.");
                            }
                        }

                    } else {

                        System.out.println("Please enter either 'a' or 'b'.");
                    }
                }
                break;
            }

            // Blade route
            case "Blade": {

                System.out.println("Because you want to get stronger, you decide to go solo for the time being and focus on getting stronger.");
                System.out.print(" Eventually, you master all sword arts.");
                System.out.println("The guild is looking to commission someone to go on an expedition to chart unknown territory. Do you accept? (y/n");
                choices += 1;

                // Makes sure user can only enter an acceptable value
                while (true) {

                    String answer = scan.nextLine();

                    if (answer.equals("y")) {

                        System.out.println("You find a faraway kingdom on your expedition, and meet someone who wants to spend the rest of their life with you.");
                        System.out.print(" You start a family, creating a legacy that lasts for generations to come.");
                        System.out.println("LEGACY ENDING ACHIEVED");

                        // Stores ending in ArrayList
                        // Checks if ending is in ArrayList
                        if (endings.contains(legacy)) {

                            System.out.println("Ending already achieved");

                        } else {

                            endings.add(legacy);

                        }
                        break;

                    } else if (answer.equals("n")) {

                        System.out.println("You choose to keep adventuring solo instead of being contracted. You become a solo mercenary, doing jobs for a mercenary guild.");
                        System.out.println("One day, you're ambushed by bandits. You survive, but you're now missing an arm and eye.");
                        System.out.print("You become revered across the land, known as 'The Immortal'");
                        System.out.println("REVERED ENDING ACHIEVED");

                        if (endings.contains(revered)) {

                            System.out.println("Ending already achieved");

                        } else {

                            endings.add(revered);

                        }
                        break;

                    } else {

                        System.out.println("Please enter either 'y' or 'n'.");
                    }
                }
                break;
            }
        }
    }

    // This method is the same as the adventurer method, but it's used for multiple playthroughs
    public void adventurerLoop() {

        playthroughs += 1;
        System.out.println("You need to choose a class. Which class will you choose? a) Mage, b) Tank, or c) Blade? ");
        choices += 1;

        boolean input = true;

        while (input) {

            String answer = scan.nextLine();

            if (answer.equals("a")) {

                adventClass = "Mage";
                break;

            } else if (answer.equals("b")) {

                adventClass = "Tank";
                break;

            } else if (answer.equals("c")) {

                adventClass = "Blade";
                break;

            } else {

                System.out.println("Please enter 'a', 'b', or 'c'.");
            }
        }

        switch (adventClass) {

            case "Mage": {

                System.out.println("After officially becoming a Mage, you join a party who was in desperate need of a mage.");
                System.out.println("However, shortly after joining, your party is ambushed. It seems as though some didn't like how easy it was for you to succeed."
                        + " What will you do?");
                System.out.println("a) Run or b) Fight?");
                choices += 1;

                while (input) {

                    String answer = scan.nextLine();

                    if (answer.equals("a")) {

                        System.out.println("After you ran to get help, your party died. Blaming yourself for the tragedy, you decide to live the rest of your years in absolute solitude.");
                        System.out.println("SOLITUDE ENDING ACHIEVED");

                        if (endings.contains(solitude)) {

                            System.out.println("Ending already achieved");

                        } else {

                            endings.add(solitude);

                        }
                        break;

                    } else if (answer.equals("b")) {

                        System.out.println("Although you lost your arm in the struggle, you and your party were able to fight off the assailants and live on.");
                        System.out.print(" A few years later, thanks to advanced prosthetic technology, you receive a prosthetic arm that doubles as a staff. It greatly enhances your abilities.");
                        System.out.println("\nYou and your party work hard and gain fame and renown, spreading your name throughout the land.");
                        System.out.println("RENOWNED ENDING ACHIEVED");

                        if (endings.contains(renowned)) {

                            System.out.println("***Ending already achieved***");

                        } else {

                            endings.add(renowned);

                        }
                        break;

                    } else {

                        System.out.println("Please enter either 'a' or 'b'.");

                    }
                }
                break;
            }

            case "Tank": {

                System.out.println("Since your class requires immense fortitude and physical resistance, you decide to go train in the mountains.");
                System.out.print("You return 10 years later, after gaining strength surpassing even history's greatest warriors.");
                System.out.println("\nLooking to put use your newly-acquired strength to good use, you consider either a) joining a party, or b) traveling the world solo.");
                choices += 1;

                while (input) {

                    String answer = scan.nextLine();

                    if (answer.equals("a")) {

                        System.out.println("Due to the unfathomable strength you bring to your party, your party was able to take the highest ranked and most dangerous quests, earning tons of money and " +
                                "becoming rich in no time. \nSoon you're the richest in the guild, becoming known across the land as the 'Wealth Party'");
                        System.out.println("RENOWNED ENDING ACHIEVED");

                        if (endings.contains(renowned)) {

                            System.out.println("**Ending already achieved**\n");

                        } else {

                            endings.add(renowned);

                        }

                    } else if (answer.equals("b")) {

                        System.out.println("After deciding to go solo, you build a reputation as the 'Great Wall'. Concerned for your safety and health, your closest friends advise you to retire. What do you choose? (y/n)");
                        choices += 1;

                        while (input) {

                            String response = scan.nextLine();

                            if (response.equals("y")) {

                                System.out.println("Your friends assure you that you made the right decision. You live comfortably for the rest of your days.");
                                System.out.println("RETIREMENT ENDING ACHIEVED");

                                if (endings.contains(retirement)) {

                                    System.out.println("Ending already achieved");

                                } else {

                                    endings.add(retirement);

                                }
                                break;

                            } else if (response.equals("n")) {

                                System.out.println("Against your friends' wishes, you decide to keep adventuring. A few years later, you lose your life in a tragic accident.");
                                System.out.println("TRAGIC ENDING");

                                if (endings.contains(tragic)) {

                                    System.out.println("***Ending already achieved***");

                                } else {

                                    endings.add(tragic);

                                }
                                break;

                            } else {

                                System.out.println("Please enter either 'y' or 'n'.");
                            }
                        }

                    } else {

                        System.out.println("Please enter either 'a' or 'b'.");
                    }
                    break;
                }
            }

            case "Blade": {

                System.out.println("Because you want to get stronger, you decide to go solo for the time being and focus on getting stronger.");
                System.out.print(" Eventually, you master all sword arts.");
                System.out.println("The guild is looking to commission someone to go on an expedition to chart unknown territory. Do you accept? (y/n)");
                choices += 1;

                while (input) {

                    String answer = scan.nextLine();

                    if (answer.equals("y")) {

                        System.out.println("You find a faraway kingdom on your expedition, and meet someone who wants to spend the rest of their life with you.");
                        System.out.print(" You start a family, creating a legacy that lasts for generations to come.");
                        System.out.println("LEGACY ENDING ACHIEVED");

                        if (endings.contains(legacy)) {

                            System.out.println("Ending already achieved");

                        } else {

                            endings.add(legacy);

                        }
                        break;

                    } else if (answer.equals("n")) {

                        System.out.println("You choose to keep adventuring solo instead of being contracted. You become a solo mercenary, doing jobs for a mercenary guild.");
                        System.out.println("One day, you're ambushed by bandits. You survive, but you're now missing an arm and eye.");
                        System.out.print("You become revered across the land, known as 'The Immortal'");
                        System.out.println("REVERED ENDING ACHIEVED");

                        if (endings.contains(revered)) {

                            System.out.println("Ending already achieved");

                        } else {

                            endings.add(revered);

                        }
                        break;

                    } else {

                        System.out.println("Please enter either 'y' or 'n'.");
                    }
                }
                break;
            }
        }
    }

    // Method for assassin route
    public void assassin() {

        System.out.println("Now that you've become an assassin, you need an assassin name. What will it be?");
        assassinName = scan.nextLine();

        System.out.println("You must choose an organization to join. You can either join a) Shadow Garden, or b) Moonlight.");

        while (true) {

            String answer = scan.nextLine();

            if (answer.equals("a")) {

                organization = "Shadow Garden";
                break;

            } else if (answer.equals("b")) {

                organization = "Moonlight";
                break;

            } else {

                System.out.println("Please enter either 'a' or 'b'.");

            }
        }

        switch (organization) {

            // Shadow Garden route
            case "Shadow Garden": {

                System.out.println("Shortly after joining Shadow Garden, you climb the ranks and become the next Eminence in Shadow.");
                System.out.println("A new assassin organization, Moonlight, proposes a merger: ");
                System.out.print("Shadow Garden and Moonlight merge into Shadow Moon. Do you agree to this proposal? (y/n)");
                choices += 1;

                while (true) {

                    String answer = scan.nextLine();

                    if (answer.equals("y")) {

                        System.out.println("You choose to merge with Moonlight, becoming Shadow Moon.");
                        System.out.println("With this major addition to its ranks, Shadow Moon rules the world.");
                        System.out.println("WORLD DOMINATION ENDING ACHIEVED");

                        if (endings.contains(worldDomination)) {

                            System.out.println("***Ending already achieved***");

                        } else {

                            endings.add(worldDomination);

                        }
                        break;

                    } else if (answer.equals("n")) {

                        System.out.println("You choose to reject Moonlight's offer. Dejected, Moonlight vows to wage war" +
                                "with Shadow Garden. Five years later, what became known as the Great Assassin War broke out.");
                        System.out.println("Although the war claimed half of Shadow Garden's forces, Moonlight is no more.");
                        System.out.println("SHADOW GARDEN ENDING ACHIEVED");

                        if (endings.contains(shadowGarden)) {

                            System.out.println("***Ending already achieved***");

                        } else {

                            endings.add(shadowGarden);

                        }
                        break;

                    } else {

                        System.out.println("Please enter either 'y' or 'n'.");

                    }
                }
            }

            // Moonlight route
            case "Moonlight": {

                System.out.println("Shortly after joining Moonlight, you quickly gain renown by assassinating government leaders" +
                        " and other high-level targets, earning you a promotion.");
                System.out.println("Shadow Garden, another assassin organization that's been around long before Moonlight" +
                        " was ever established, seeks to merge with Moonlight upon learning of its renown.");
                System.out.println("Now the leader of Moonlight, this decision rests upon your shoulders. Do you" +
                        " accept Shadow Garden's offer? (y/n)");
                choices += 1;

                while (true) {

                    String answer = scan.nextLine();

                    if (answer.equals("y")) {

                        System.out.println("You choose to merge with Shadow Garden, becoming Moonlit Shadow.");
                        System.out.println("With this major addition to its ranks, Moonlit Shadow goes on to rule the world.");
                        System.out.println("WORLD DOMINATION ENDING ACHIEVED");

                        if (endings.contains(worldDomination)) {

                            System.out.println("***Ending already achieved***");

                        } else {

                            endings.add(worldDomination);

                        }
                        break;

                    } else if (answer.equals("n")) {

                        System.out.println("You refuse to merge with Shadow Garden. Dejected, Shadow Garden wages war with" +
                                " Moonlight.");
                        System.out.println("You successfully fend them off, but you suffer major casualties. Nonetheless, Shadow" +
                                " Garden knows not to ever attack Moonlight again.");
                        System.out.println("MOONLIGHT ENDING ACHIEVED");

                        if (endings.contains(moonLight)) {

                            System.out.println("***Ending already achieved***");

                        } else {

                            endings.add(moonLight);

                        }
                        break;

                    } else {

                        System.out.println("Please enter either 'y' or 'n'.");

                    }
                }
            }
        }
    }
}