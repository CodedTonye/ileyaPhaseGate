import java.util.Scanner;

public class TonyeStudentsGrade {

        static int maxItems  = 50;                      
        static int[] scores = new int [maxItems];  
        static int[] student1 = new int [maxItems];
        static int[] student2 = new int [maxItems]; 
        static int[] student3 = new int [maxItems];  
//        static int[] students = new int[maxItems];  
//        static int[] quiz = new int[maxItems];  
//        static int numberOfQuizzes;
//        static int numberOfStudents;
        static int scoreCount  = 0; 
        
        static int score;
        static int quiz;  
        
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("\nEnter number of students: ");
        int numberOfStudents = inputCollector.nextInt();
        
        System.out.print("Enter number of quizzes: ");
        quiz = inputCollector.nextInt();
        inputCollector.nextLine();
        
        collectScores(inputCollector);
        
        printGradeReport(student1, student2, score, average);
    
    }
    
    public static void collectScores(Scanner inputCollector) {
                           
//        while (score <= quiz) { 
            while (score >= 0 && score <= 100) {
            
            System.out.println("\n--- Student 1 ---");
            System.out.print("Score for Quiz 1: ");
            scores[scoreCount] = inputCollector.nextInt();   
            
            System.out.print("Score for Quiz 2: ");
            scores[scoreCount] = inputCollector.nextInt();  
            
            System.out.print("Score for Quiz 3: ");
            scores[scoreCount] = inputCollector.nextInt(); 
            
            
            System.out.println("\n--- Student 2 ---");  
            System.out.print("Score for Quiz 1: ");
            scores[scoreCount] = inputCollector.nextInt();   
            
            System.out.print("Score for Quiz 2: ");
            scores[scoreCount] = inputCollector.nextInt();  
            
            System.out.print("Score for Quiz 3: ");
            scores[scoreCount] = inputCollector.nextInt();  
                  
                            
            scoreCount++; 
            
            break;                                     
        }
    }
    
    
    public static double printGradeReport(String student1, String student2 , int score, double average) {
    
        System.out.println("\n================= QUIZ GRADE REPORT =====================");
        System.out.printf("%15s %10s %10s %16s\n", "STUDENT", "QZ1", "QZ2", "QZ3", "AVG");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%15s %10d %10d %16d %16.2f\n", "Student 1", score1, score2, score3, average1);
        System.out.printf("%15s %10d %10d %16d %16.2f\n", "Student 2", score4, score5, score6, average2);
        System.out.println("-----------------------------------------------------------");
    }
}

