public class Main
{
    public static void main(String[] args)
    {
        int numberExampleOne = 1;
        int numberExampleTwo = 2;
        int numberExampleThree = 3;
        int numberExampleFour = 4;
        int numberToExamine;
        int numberToPrint;

        numberToExamine = numberExampleOne;
        numberToPrint = numberToExamine % 2;

        System.out.println("The first example is 1. This number is odd because 1 % 2 == " + numberToPrint);

        numberToExamine = numberExampleTwo;
        numberToPrint = numberToExamine % 2;

        System.out.println("The second example is 2. This number is even because 2 % 2 == " + numberToPrint);

        numberToExamine = numberExampleThree;
        numberToPrint = numberToExamine % 2;

        System.out.println("The third example is 3. This number is odd because 3 % 2 == " + numberToPrint);

        numberToExamine = numberExampleFour;
        numberToPrint = numberToExamine % 2;

        System.out.println("The fourth example is 4. This number is even because 4 % 2 == " + numberToPrint);
    }
}