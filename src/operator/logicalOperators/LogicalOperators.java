package operator.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isInterviewQuestionsSent = false;
        boolean isJavaHomeworkSent = true;

        // OR - If there is any True, it will be true
        System.out.println("The student is okay (OR): " +
                (isInterviewQuestionsSent || isJavaHomeworkSent));

        // AND - If there is any false, it will be false
        System.out.println("The student is okay (AND): " +
                (isInterviewQuestionsSent && isJavaHomeworkSent));

        System.out.println("\nThe student did send the homework " +
                isInterviewQuestionsSent);
    }
}
