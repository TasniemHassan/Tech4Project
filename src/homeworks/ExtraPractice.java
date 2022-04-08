package homeworks;

public class ExtraPractice {
    //public static void main(String[] args){

    //TASK - 1 : fav students powerpoint in general
        public static String luckUnluckyGame(int num) {
            if (num == -11) return "You have hit the unlucky number!";
            else if (num == 9 )return "You have hit the lucky number!";
             else if(num == 0) return "The number is zero";
            else if(num > -50 && num < 0) return "The number is negative and more than -50";
            else if(num > 0 && num < 50)return " The number is positive and less than 50";
            else return "The number you provided is not good for this game";
    }
}
