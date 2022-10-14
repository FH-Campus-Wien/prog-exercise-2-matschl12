package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int x = 1; //used for the output "Number X"
        double biggestNum = 0;

        while(true)
        {

            double userInput;

            System.out.print("Number "+x+": ");
            userInput = scan.nextDouble();

            if(x == 1 && userInput <= 0 )
            {
                System.out.println("No number entered.");
                return;
            }
            else if(x == 1 && userInput > 0)
            {
                biggestNum = userInput;
            }
            else if(x != 1 && userInput > 0)
            {
                if(userInput > biggestNum)
                {
                    biggestNum = userInput;
                }
            }
            else
            {
                System.out.println("The largest number is " + String.format("%.2f", biggestNum)); //using String.format to change the output to the .00 format
                return;
            }
            x++;
        }

    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int input = scan.nextInt();

        if(input <= 0)
        {
            System.out.println("Invalid number!");
        }
        else
        {
            int tempNum =1;
            for (int x=0; x < input; x++)
            {
                tempNum =  tempNum+x;
                System.out.print(tempNum+" "); //output of the first numbers of each row

                for (int y=1; y < x+1; y++)
                {
                    System.out.print(tempNum+y + " "); //output from the second number onwards of each row
                }
                System.out.println();

            }
        }


    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        for (int x = 1; x<=6; x++) //creates an "empty" row
        {

            for (int y = x; y < 6; y++) //fills the rows with blankspaces
            {
                System.out.print(" ");
            }
            for (int z = 1; z <= (x*2) -1 ; z++) //fills the rows with stars
            {

                System.out.print("*");
            }
            System.out.println();
        }


    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here

        Scanner scan = new Scanner(System.in);

        System.out.print("h: ");
        int rows = scan.nextInt();

        System.out.print("c: ");
        char userChar = scan.next().charAt(0);

        if (rows % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }


        char userCharMinus = userChar;
        char userCharMinus2 = userChar;

        for (int x = 0; x <= rows / 2; x++)    //creates the rows from the top to the middle of the rhombus
        {

            for (int y = x; y < rows / 2; y++)  //creates blankspaces for these rows
            {
                System.out.print(" ");
            }

            for (int z = x; z >= 0 ; z--)  //fills the rows till the middle with the right letters
            {

                userCharMinus = (char) (((int) userChar) - z);
                System.out.print(userCharMinus);
            }

            for (int a = 1; a <= x ; a++) //fills the rows from the middle to the end of the row with the right letters
            {
                userCharMinus2 = (char) (((int) userChar) - a);
                System.out.print(userCharMinus2);
            }

            System.out.println();
        }


        for (int x = rows/2; x > 0; x--) //create the rows from the middle to the end of the rhombus
        {

            for (int y = rows/2; y >= x; y--) //creates blankspaces for these rows
            {

                System.out.print(" ");
            }
            for (int z = x-1; z >= 0 ; z--)  //fills the rows till the middle with the right letters
            {

                userCharMinus = (char) (((int) userChar) - z);
                System.out.print(userCharMinus);
            }

            for (int a = 1; a < x ; a++) //fills the rows from the middle to the end of the row with the right letters
            {
                userCharMinus2 = (char) (((int) userChar) - a);
                System.out.print(userCharMinus2);
            }

                System.out.println();
        }


    }



    //todo Task 5
    public void marks(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        double sumGrades = 0.00;
        int negativeGrades = 0;
        int x = 1;

        while(true) {

            int input;

            System.out.print("Mark " + x + ": ");
            input = scan.nextInt();

            if (input == 0) {

                if (x == 1)
                {
                    double average = sumGrades/(x);
                    System.out.println("Average: " + String.format("%.2f", average)); //using String.format to change the output to the .00 format
                    System.out.println("Negative marks: " +negativeGrades);
                    return;
                }
                else
                {
                    double average = sumGrades/(x-1);
                    System.out.println("Average: " + String.format("%.2f", average)); //using String.format to change the output to the .00 format
                    System.out.println("Negative marks: " +negativeGrades);
                    return;
                }

            }
            else if (input > 0 && input < 5)
            {
                sumGrades += input;
                x++;

            }
            else if (input == 5)
            {
                sumGrades += input;
                negativeGrades ++;
                x++;
            }
            else
            {
                System.out.println("Invalid mark!");
            }
        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        System.out.print("n:");
        int input = scan.nextInt();
        int newNum;
        newNum = input;
        int tempNum2 = 0;

        while (true)
        {
            tempNum2 = 0;
            while(newNum > 0)     //function to get each digit of the number, to put these digits to ^2 and then to calculate the sum of these numbers
            {
                int tempNum = newNum%10;

                tempNum2 += (int)Math.pow(tempNum,2);

                newNum = newNum/10;
            }

            newNum = tempNum2;

            if(newNum == 1)
            {
                System.out.println(" Happy number!");
                return;
            }
            else if(newNum == 4)
            {
                System.out.println(" Sad number!");
                return;
            }
        }





    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}