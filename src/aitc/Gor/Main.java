package aitc.Gor;

public class Main {

    public static void main(String[] args) {

        String[] surnames = {"Gasparyan", "Stepanyan", "Mayilyan"};

        int len = surnames.length;

        for (int i = 0; i < len; i++) {

            System.out.println("surname: " + surnames[i]);

        }

        int j = 0;

        while (j < len) {
            System.out.println("my surname: " + surnames[j]);
            j++;

            if (5 == j)
                break;
        }

        int number = 2;

        switch (number){

            case 0: System.out.println(surnames[number] + "is a 1st participant" );
            break;

            case 3: System.out.println(surnames[number] + "is a 4th participant" );
            break;
            default:
                System.out.println(surnames[number] + "is just a participant");
                break;

        }

        // write your code here

    }

}