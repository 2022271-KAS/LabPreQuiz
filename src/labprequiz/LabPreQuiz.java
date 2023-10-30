package labprequiz;

import ioutils.IOUtils;
import labprequiz.enums.*;

public class LabPreQuiz {

    public static void main(String[] args) {

        IOUtils myInput = new IOUtils();
        Kitchen kitchen = new Kitchen();
        System.out.println("Welcome to our restaurant!");

        try {
            
            System.out.println("Before I take your order, do you have any allergies?");
            System.out.println("Here goes a list with the allergens in case you have missed it.");
            kitchen.displayAllergens();
            System.out.println();
            System.out.println("Ready now? Cool, let's go!");

            kitchen.order();
            System.out.println("Thank you so much!");
                        
            

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("I hope you have enjoyed your meal! See you again!");
        }

    }

}
