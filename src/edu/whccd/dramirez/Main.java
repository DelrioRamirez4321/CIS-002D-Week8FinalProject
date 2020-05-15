package edu.whccd.dramirez;

import java.time.LocalDateTime;
import java.util.Scanner;

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

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter Last Name: ");
        String lastName = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter your gender (M,F,O): ");
        String gender = sc3.nextLine();
        switch (gender){
            case "M":
                gender = "Male";
                break;
            case "F":
                gender = "Female";
                break;
            case "O":
                gender = "other";
                break;
            default:
                System.out.println("unknown character");
        }

        int birthYear = 0;
        while (birthYear == 0) {
            System.out.print("Enter birth year: ");
            Scanner sc4 = new Scanner(System.in);
            if (sc4.hasNextInt()) {
                birthYear = sc4.nextInt();
            } else if (sc4.hasNextLine()) {
                System.out.println("Error! Please enter Valid year");
                sc4.next();
            }
        }


        Scanner sc5 = new Scanner(System.in);
        System.out.print("What state are are living in (U.S.A): ");
        String State = "State Living in: " + sc5.nextLine();

        Scanner sc10 = new Scanner(System.in);
        System.out.print("how tall are you: ");
        String height = "Heigth: " + sc10.nextLine();

        Scanner sc6 = new Scanner(System.in);
        System.out.print("What are your intrests : ");
        String intrest = "Intrests: " + sc6.nextLine();

        Scanner sc7 = new Scanner(System.in);
        System.out.print("What is your Favorite Food: ");
        String food = "Favorite Food: " + sc7.nextLine();

        Scanner sc8 = new Scanner(System.in);
        System.out.print("What is your Favorite type of music: ");
        String music = "Favorite Music: " + sc8.nextLine();

        Scanner sc9 = new Scanner(System.in);
        System.out.print("What is your Favorite Sport: ");
        String sports = "Favorite Sport: " + sc9.nextLine();

        Scanner sc11 = new Scanner(System.in);
        System.out.print("What is your favotie soda: ");
        String soda = "Favorite soda: " + sc11.nextLine();

        Scanner sc12 = new Scanner(System.in);
        System.out.print("What is your favotie TV show: ");
        String tvShow = "Favorite TV Show: " + sc12.nextLine();

        Scanner sc13 = new Scanner(System.in);
        System.out.print("What is your favotie movie: ");
        String movie = "Favorite Movie: " + sc13.nextLine();

        Scanner sc14 = new Scanner(System.in);
        System.out.print("What is your favorite place to visit: ");
        String place = "Favorite soda: " + sc14.nextLine();

        System.out.println();

        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age(birthYear));
        System.out.println("Gender: " + gender);

        System.out.println();
        System.out.println("*****************************************");

        String[] answers = {State,height, intrest, food, music,sports,soda,tvShow,movie,place};
        for (String answer : answers) {
            System.out.println(answer);
        }
    }

    public static int age(int birthYear) {
        int currentYear = LocalDateTime.now().getYear();
        return currentYear - birthYear;
    }
}
