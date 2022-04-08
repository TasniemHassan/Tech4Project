package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] studentGroups = { {"Kaly", "Guluzar", "Melda"},
                {"Torrie", "David"},
                {"Abe", "Data"}
                };

        System.out.println(studentGroups[0][1]); //Guluzar
        System.out.println(studentGroups[1][0]); //Torrie
        System.out.println(studentGroups[1][1]);//David


        //How to get the size of the studentGroups
        System.out.println(studentGroups.length); //3

        //How to get the size of the second group
        System.out.println(studentGroups[1].length); //2

        //How to print the third group
        System.out.println(Arrays.toString(studentGroups[2])); //[Abe,Data]

        //How to print all
        System.out.println(Arrays.deepToString(studentGroups)); //[[Kaly, Guluzar, Melda] , [Torrie, David], [Abe,Data]]

        /*How to print each group in separate lines

        [Kaly, Guluzar, Melda]
        [Torrie, David]
        [Abe,Data]
         */

        for(int i =0; i < studentGroups.length; i++){
            System.out.println(Arrays.toString(studentGroups[i]));
        }

        for(String[] group : studentGroups){
            System.out.println(Arrays.toString(group));
        }

        System.out.println("\n----Printing all members with fori loop-----\n");
        for(int i = 0; i< studentGroups.length; i++){
            for(int j = 0; j < studentGroups.length; j++){
                System.out.println(studentGroups[i][j]);
            }
        }

        System.out.println("\n----Printing all members with for each loop-----\n");

        for(String[] group : studentGroups){
            for(String member : group){
                System.out.println(member);
            }
        }
    }
}
