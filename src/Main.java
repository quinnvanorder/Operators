public class Main {
    public static void main(String[] args) {
        int result = 1 + 2; //1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        //code is sequential, previousResult does not change as result is changes after previousResult is assigned
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2 -1 =1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10; //3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; //30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }
        //single equals is an assignment operator. double equals is testing if value is false. if evaluation matches, next line is run. Note lack of ending semicolon on the if statement

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // || is logical or, | is bitwise or, same with && vs &. Bitwise is advanced concept not yet covered, almost always going to use logical and vs bitwise
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("this is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        //ternary operator is a shortcut to assigning one of 2 values to a variable depending on a given condition

        //begin operator challenge

        //step 1
        double myVar = 20.00;

        //step 2
        double myVar2 = 80.00;

        //step 3
        double myVar3 = (myVar + myVar2)*100.00;

        //step 4
        double myRemainder = myVar3 % 40.00;

        //step 5
        boolean isZero = myRemainder == 0 ? true : false;

        //step 6
        System.out.println(isZero);

        //step 7
        if (!isZero) {
            System.out.println("got some remainder");
        }

    }
}