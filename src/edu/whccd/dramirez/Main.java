package edu.whccd.dramirez;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;

/*
The purpose of this program is to be able to show the use of all the information that we have learn
form the whole semester by creating a dating or a health App.
Author: Delrio Ramirez.
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter first Name: ");
        String firstName = sc1.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc1.nextLine();

        System.out.print("Enter your gender: ");
        String gender = sc1.nextLine().toUpperCase();
        switch(gender){
            case "M":
                gender = "Male";
                break;
            case "F":
                gender = "Female";
                break;
            default:
                gender = "Other";
                break;
        }

        int age = (LocalDateTime.now().getYear()) - birthYear();

        ArrayList<String> answers = new ArrayList <>();

        Scanner sc5 = new Scanner(System.in);
        System.out.print("What state are are living in (U.S.A): ");
        String state = "State Living in: " + sc5.nextLine();
        answers.add(state);

        System.out.print("how tall are you: ");
        String height = "Heigth: " + sc5.nextLine();
        answers.add(height);

        System.out.print("What are your intrests : ");
        String intrest = "Intrests: " + sc5.nextLine();
        answers.add(intrest);

        System.out.print("What is your Favorite Food: ");
        String food = "Favorite Food: " + sc5.nextLine();
        answers.add(food);

        System.out.print("What is your Favorite type of music: ");
        String music = "Favorite Music: " + sc5.nextLine();
        answers.add(music);

        Scanner sc9 = new Scanner(System.in);
        System.out.print("What is your Favorite Sport: ");
        String sports = "Favorite Sport: " + sc9.nextLine();
        answers.add(sports);

        System.out.print("What is your favotie soda: ");
        String soda = "Favorite soda: " + sc5.nextLine();
        answers.add(soda);

        System.out.print("What is your favotie TV show: ");
        String tvShow = "Favorite TV Show: " + sc5.nextLine();
        answers.add(tvShow);

        System.out.print("What is your favotie movie: ");
        String movie = "Favorite Movie: " + sc5.nextLine();
        answers.add(movie);

        System.out.print("What is your favorite place to visit: ");
        String place = "Favorite soda: " + sc5.nextLine();
        answers.add(place);

        System.out.println();

        summary(firstName, lastName,age,gender,answers);
    }

    public static int birthYear() {
        int birthYear = 0;
        while (birthYear == 0) {
            Scanner sc4 = new Scanner(System.in);
            System.out.print("Enter birth year: ");
            try {
                birthYear = sc4.nextInt();
            } catch (Exception e) {
                System.out.println("Error! Please enter Valid year");
                sc4.next();
            }
        }
        return birthYear;
    }

    public static void summary(String firstname, String lastname, Integer age, String gender, ArrayList questions){
        System.out.println("Full Name: " + firstname + " " + lastname);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

        System.out.println();
        System.out.println("*****************************************");

        for (Object question : questions) {
            System.out.println(question);
        }
    }
}
