/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rudy Arango
 */
package base;

import java.util.Scanner;

/*Exercise 4 - Mad Lib
        Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

        Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

        Example Output
        Enter a noun: dog
        Enter a verb: walk
        Enter an adjective: blue
        Enter an adverb: quickly
        Do you walk your blue dog quickly? That's hilarious!
        Constraints
        Use a single output statement for this program.
        If your language supports string interpolation or string substitution, use it to build up the output.
*/
public class App {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adv = input.nextLine() ;

        System.out.println("Do you " +verb+ " your " +adj+ " " +noun+ " " +adv+"? That's hilarious!");
    }
}

