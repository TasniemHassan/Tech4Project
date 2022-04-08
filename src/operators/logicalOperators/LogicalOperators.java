package operators.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args){

        boolean isInterviewQuestionsSent = false;
        boolean isJavaHomeworkSent = false;

        //Send me interviewQuestions OR JavaHomework

        System.out.println("The student is okay (OR): " +
                (isInterviewQuestionsSent || isJavaHomeworkSent));

        //If there is a single True for OR (||) it is true

        //Send me interviewQuestions AND JavaHomework
        System.out.println("The student is okay (AND): " +
                (isInterviewQuestionsSent && isJavaHomeworkSent));

        //If there is a single FALSE for AND(&&) it is false


        System.out.println("\nThe Student did send the homework " +
                !isInterviewQuestionsSent);
    }

}
