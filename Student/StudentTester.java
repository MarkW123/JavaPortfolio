
package Student;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests student class methods
 */



public class StudentTester {

    public static void main(String[] args) {
        
        Student Isaac = new Student("Isaac");
        Isaac.addQuiz(200);
        Isaac.addQuiz(300);
        
        System.out.println(Isaac.getName());
        System.out.println(Isaac.getTotalScore());
        System.out.println(Isaac.getAverageScore());
        
    }

}
