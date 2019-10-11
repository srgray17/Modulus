public class Counter {
    public static void main (String[] args){
        System.out.printf("Counting to 10 in a while loop%n");
        int counter = 2;

        while (counter <=10){
            System.out.println(counter);
            counter = counter+2;
        }

        System.out.printf("Challenge 2 = display my name 5 times");
        counter = 1;

        while (counter<=5){
            System.out.println("My name is Stella");
            counter++;
        }

        System.out.printf("%n%nChallenge 3 = display name with #'s%n");
        counter = 1;

        while (counter<=100){
            System.out.printf("%3d. Stella%n", counter);
            counter++;
        }
    }
}
