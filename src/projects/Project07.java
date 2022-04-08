package projects;

import java.util.Arrays;

public class Project07 {
    //public static void main(String[] args) {

    // System.out.println("-------Task-1-------");

    public static void findGreatestWithSort(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

    public static void findSmallestWithSort(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

    /*public static void main(String[] args) {
      int [] findGreatestAndSmallest = {10, 7, 7, 10 -3, 10, -3};

        System.out.println("Smallest = " + findSmallestWithSort(findGreatestAndSmallest));
        System.out.println("Greatest = " + findGreatestWithSort(findGreatestAndSmallest));

    }

     */

    // System.out.println("-------Task-2-------");
    public static void findGreatest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }

    public static void findSmallest(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }

    /*public static void main(String[] args) {

        int [] findGreatestAndSmallest = {10, 7, 7, 10 -3, 10, -3};

        System.out.println("Smallest = " + findSmallest(findGreatestAndSmallest));
        System.out.println("Greatest = " + findGreatest(findGreatestAndSmallest));
    }

     */
//System.out.println("-------Task-3-------");

    public static void findSecondGreatestWithSort(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int secondMax = arr[arr.length - 2];

        if (arr.length < 3) System.out.println(secondMax);
        else if (max == secondMax) System.out.println(arr[arr.length - 3]);
        else System.out.println(secondMax);
    }

    public static void findSecondSmallestWithSort(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int secondMin = arr[1];

        if (arr.length < 3) System.out.println(arr[1]);
        else if (min == secondMin) System.out.println(arr[2]);
        else System.out.println(secondMin);
    }


   /* public static void main(String[] args) {

        int [] findSecondGreatestAndSmallestWithSort = {10, 5, 6, 7, 8, 5, 15, 15};

        System.out.println("Second Smallest = " + findSecondSmallestWithSort(findSecondGreatestAndSmallestWithSort));
        System.out.println("Second Greatest = " + findSecondGreatestWithSort(findSecondGreatestAndSmallestWithSort));
    }

    */
//System.out.println("-------Task-4-------");

    public static void findSecondGreatest(int[] arr) {
        int max = arr[0];
        int secondMax = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && secondMax != max)
                secondMax = arr[i];

        }
        System.out.println(secondMax);
    }

    public static void findSecondSmallest(int[] arr) {
        int min = arr[0];
        int secondMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondMin && arr[i] != min)
                secondMin = arr[i];
        }
        System.out.println(secondMin);
    }

       /* public static void main(String[] args) {

        int[] findSecondGreatestAndSmallest = {10, 5, 6, 7, 8, 5, 15, 15};

        System.out.println("Second Smallest = " + findSecondSmallest(findSecondGreatestAndSmallest));
        System.out.println("Second Greatest = " + findSecondGreatest(findSecondGreatestAndSmallest));
    }

        */

    //System.out.println("-------Task-5-------");
    public static void findDuplicatedElementsInAnArray(String[] arr) {
        String duplicatedElements = "";
        boolean duplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (!(duplicatedElements.contains(arr[i] + "")) && arr[i].equals(arr[j])) {
                    duplicatedElements += arr[i] + "\n";
                    duplicate = true;
                }
            }
        }
        System.out.println(duplicatedElements);
    }

    public static void main(String[] args) {
        String[] s = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(s);
    }


    //System.out.println("-------Task-6-------");
    public static void findMostRepeatedElementsInAnArray(String[] arr) {
        int mostCountedTimes = 0;
        String mostCountedWord = "";

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            int countOfWord = 0;
            for(String element : arr){
                if(word.equals(element)) countOfWord++;
            }
            if(countOfWord > mostCountedTimes){
                mostCountedWord = word;
                mostCountedTimes = countOfWord;
            }
        }
        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");

    }
   /* public static void main(String[] args) {
        String[] s = {"pen", "eraser", "pencil", "pen", "123", "abc",  "pen", "eraser"};


        findMostRepeatedElementsInAnArray(s);


    }

    */
}

