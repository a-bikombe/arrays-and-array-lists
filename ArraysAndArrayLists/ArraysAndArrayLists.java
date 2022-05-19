package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.ArrayList;

public class ArraysAndArrayLists {

    public static void main(String[] args) {

        int[] numbers = new int[37];    // declare an array to store 37 integers (called Arrays)

        Arrays.fill(numbers, -1);    // set value for all elements of the array to -1 (.fill method)
        System.out.println(Arrays.toString(numbers));    // print array of -1s

        numbers[3] = 99;    // change the value of the fourth and ninth elements of the array to 99
        numbers[8] = 99;

        int i;    // initializes i
        int sum = 0;
        for (i = 0; i < numbers.length; i++) {    // loop through arrays, changing all the elements that are -1
            if (numbers[i] == -1) {
                numbers[i] = (int) (Math.random() * 100);    // chooses random number between 0 and 100
            }
            if (numbers[i] == 47) {    // check if it is number 47
                System.out.println("Element [" + i + "] is 47!");
            } else {
                System.out.println("Element [" + i + "] is not 47. Instead, you found " + numbers[i] + ".");
            }
            sum = sum += numbers[i];    // get the sum of the values in the array
        }

        Arrays.sort(numbers);    // sort the array
        System.out.println("Sorted numbers array: " + Arrays.toString(numbers));    // prints sorted array

        double average = sum / numbers.length;    // get the average of the values in the array
        System.out.println("The average of the numbers array is " + average + ".");

        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == 47) {    // flag that indicates whether it has been found and report the results at the end
                System.out.println("47 was found in the numbers Array.");
            }
        }

        ArrayList<String> kitties = new ArrayList<>();    // create an ArrayList to store strings
        kitties.add("Ragdoll");    // add 7 arbitrary strings into the ArrayList
        kitties.add("Birman");
        kitties.add("Munchkin");
        kitties.add("Scottish Fold");
        kitties.add("Maine Coon");
        kitties.add("Persian");
        kitties.add("Siberian");

        kitties.remove(1);    // remove the second element from the ArrayList

        for (i = 0; i < kitties.size(); i++) {    // loop through the ArrayList and change all the strings to be lower case
            kitties.set(i, kitties.get(i).toLowerCase());
            System.out.println("kitties[" + i + "] = " + kitties.get(i));
        }

        if (kitties.isEmpty()) {    // check if the ArrayList is empty
            System.out.println("The kitties ArrayList is empty.");
        } else {
            System.out.println("The kitties ArrayList is not empty. Instead, here is the kitties ArrayList: " + kitties);
        }

        kitties.clear();    // remove all the elements from the ArrayList

        if (kitties.isEmpty()) {    // check again if the ArrayList is empty
            System.out.println("The kitties ArrayList is now empty.");
        } else {
            System.out.println("The kitties ArrayList is still not empty. Instead, here is the kitties ArrayList: " + kitties);
        }

    }

}