import java.util.Scanner;

public class TonyeStudentGrade {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);               

        System.out.print("Enter number of students enrolled: ");
        int students = inputCollector.nextInt();                        

        System.out.print("Enter number of quizzes taken: ");
        int quizzes = inputCollector.nextInt();                         

        int[][] scores = new int[students][quizzes];                    

        for (int student = 0; student < students; student++) {         
            System.out.println("\n--- Student " + (student + 1) + " ---");

            for (int quiz = 0; quiz < quizzes; quiz++) {                
                System.out.print("Score for Quiz " + (quiz + 1) + ": ");
                int score = inputCollector.nextInt();                   

                while (score < 0 || score > 100) {                     
                    System.out.print("Invalid! Enter score between 0 and 100: ");
                    score = inputCollector.nextInt();                  
                }

                scores[student][quiz] = score;                         
            }
        }

        System.out.println("\n========== QUIZ GRADE REPORT ==========");

        for (int student = 0; student < students; student++) {          
            int sum = 0;                                               

            System.out.print("Student " + (student + 1) + " scores: ");

            for (int quiz = 0; quiz < quizzes; quiz++) {              
                sum += scores[student][quiz];                           
                System.out.print(scores[student][quiz] + " ");        
            }

            double average = (double) sum / quizzes;                   
            System.out.printf("%n  AVG: %.1f%n", average);             
        }

        double[] quizAverages = new double[quizzes];                    

        for (int quiz = 0; quiz < quizzes; quiz++) {                    
            int sum = 0;                                                
            
            for (int student = 0; student < students; student++) {     
                sum += scores[student][quiz];                           
            }

            quizAverages[quiz] = (double) sum / students;              
        }


        System.out.println("\n========== QUIZ AVERAGES ==========");
        for (int quiz = 0; quiz < quizzes; quiz++) {                    
            System.out.printf("Quiz %d Avg: %.1f%n",
                quiz + 1, quizAverages[quiz]);                         
        }

        int    bestQuiz    = 0;                                         
        double bestAverage = quizAverages[0];                          

        for (int quiz = 1; quiz < quizzes; quiz++) {                    
            if (quizAverages[quiz] > bestAverage) {                    
                bestAverage = quizAverages[quiz];                    
                bestQuiz    = quiz;                                     
            }
        }

        System.out.println("\n========== BEST QUIZ ==========");
        System.out.printf("Best Quiz: Quiz %d (Avg %.1f)%n",
            bestQuiz + 1, bestAverage);                                
                                       
    }
}
