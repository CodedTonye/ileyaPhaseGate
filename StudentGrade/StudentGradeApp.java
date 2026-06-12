import java.util.Scanner;

public class StudentGradeApp {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("How many students do you have? ");
        int students = inputCollector.nextInt();

        System.out.println("How many subjects do they offer? ");
        int subjects = inputCollector.nextInt();
        
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully");

        int[][]  scores       = collectScores(inputCollector, students, subjects);
        double[] subjectAverages = calculateSubjectAverages(scores, students, subjects);

        printGradeReport(scores, students, subjects);
        printSubjectAverages(subjectAverages);
        printBestSubject(subjectAverages);
    }    
    

    public static int[][] collectScores(Scanner inputCollector, int students, int subjects) {
    
        int[][] scores = new int[students][subjects];
        
        for (int student = 0; student < students; student++) {            
            for (int subject = 0; subject < subjects; subject++) {
                System.out.println("\nEntering score for Student " + (student + 1));
                System.out.print("Enter Score for Subject " + (subject + 1) + "\n");
                int score = inputCollector.nextInt();
                
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully");
                
                while (score < 0 || score > 100) {
                    System.out.print("Invalid! Enter score between 0 and 100: ");
                    score = inputCollector.nextInt();
                }
                scores[student][subject] = score;
            }
        }
        return scores;
    }

  
    public static void printGradeReport(int[][] scores, int students, int subjects) {
    
        System.out.println("\n==================================================");
        System.out.printf("%-12s", "STUDENT");
        for (int subject = 0; subject < subjects; subject++) {
            System.out.printf("%-6s", "SUB" + (subject + 1));    
        }    
        System.out.printf("%-6s %-8s %-4s%n", "TOT", "AVE", "POS");
        System.out.println("\n==================================================");
        
        for (int student = 0; student < students; student++) {
        
            int sum = 0;
            
            for (int subject = 0; subject < subjects; subject++) {
                sum += scores[student][subject];
            }
            
            double average = (double) sum / subjects;
            
            int position = 1;
            for (int count = 0; count < students; count++) {
                int total = 0;
                for (int subject = 0; subject < subjects; subject++) {
                    total += scores[count][subject];                  
                }
                if (total > sum) position++;
            }
            
            System.out.printf("%-12s", "Student " + (student + 1));
        
            for (int subject = 0; subject < subjects; subject++) {
                System.out.printf("%-6d", scores[student][subject]);
            }
        
            System.out.printf("%-6d %-8.2f %-4d%n", sum, average, position);
        }
        
        System.out.println("\n==================================================");
      
        System.out.println("\n==================================================");
    }

    
    public static double[] calculateSubjectAverages(int[][] scores, int students, int subjects) {
    
        double[] subjectAverages = new double[subjects];
        
        for (int subject = 0; subject < subjects; subject++) {
            
            int sum = 0;
            for (int student = 0; student < students; student++) {
                sum += scores[student][subject];
            }
            subjectAverages[subject] = (double) sum / students;
        }
        return subjectAverages;
    }

    
    public static void printSubjectAverages(double[] subjectAverages) {
    
        System.out.println("\n========== SUBJECT AVERAGES ==========");
        
        for (int subject = 0; subject < subjectAverages.length; subject++) {
            System.out.printf("subject %d Avg: %.1f%n", subject + 1, subjectAverages[subject]);
        }
    }

    
    public static void printBestSubject(double[] subjectAverages) {
    
        int bestSubject = 0;
        double bestAverage = subjectAverages[0];
        
        for (int subject = 1; subject < subjectAverages.length; subject++) {
        
            if (subjectAverages[subject] > bestAverage) {
                bestAverage = subjectAverages[subject];
                bestSubject = subject;
            }
        }
        System.out.println("\n========== BEST SUBJECT ==========");
        System.out.printf("Best Subject: Subject %d (Avg %.1f)%n", bestSubject + 1, bestAverage);
    }

}
