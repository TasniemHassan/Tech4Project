package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args){

        /*
Write a program that generates a random number bt -50 and 50
if number is positive, then we will win 10 points
if number is more than 25, then we will win extra 10 points
if number is -7, then we will win extra 10 points
lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
*/
        /*
        positive +10
            more than 25 --> +10
            number 7 --> +100
        negative 0
            less than -25   0
            number -7    +10
         */
        int number = (int) (Math.random() * 101) -50;
        int point = 0;
        if (number > 0) {
            //positive  //point +=10
        }if (number > 25) {
            point += 10;

        }else if (number == 7) {
                point += 100;
            } else if (number < 0) {
            //negative

        } if (number < -25) {
            point += 0;
        } else if (number == -7) {
                    point += 10;
                } else {
                    point += 0;
                }
            }
        }

