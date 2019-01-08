
package Student;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: A student with a name and total quiz score which 
 * is altered.
 * 
 */



public class Student {
    
    private final String name;
    private int totalQuizScore;
    private int quizCount;
    private double averageQuizScore;
    
    
    /**
     * Creates student object
     * @param studentName 
     */
    
    public Student(String studentName)
    {
        name = studentName;
        totalQuizScore = 0;
        quizCount = 0;
    }
    
    
    /**
     * Adds the quiz score to the total quiz score
     * Keeps count of the number of quizzes student participates in
     * @param score score in quiz
     */
    public void addQuiz(int score)
    {
        totalQuizScore = totalQuizScore + score;
        quizCount = quizCount + 1;
    }
    
    /**
     * Returns the student's name
     * @return name 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the total quiz score
     * @return totalQuizScore
     */
    public int getTotalScore()
    {
        return totalQuizScore;
    }
    
    /**
     * Calculates the average score
     * @return averageQuizScore
     */
    public double getAverageScore()
    {
        averageQuizScore = totalQuizScore/quizCount;
        return averageQuizScore;
    }
            
    }
