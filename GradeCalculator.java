// Classes & Objects - Question 3: GradeCalculator Class
// Author: S08-8511-2024
// Date: Nov 24, 2025

public class GradeCalculator {
   
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}
