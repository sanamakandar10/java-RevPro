/*7. The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.*/
public class GetGrade{
    public static void main(String[] args) {
        int totalStudents=90;
        int boys=45;
        int boysGradeA=20;
        int girls=totalStudents - boys;
        int girlsGradeA=(int)(totalStudents*0.5)-boysGradeA;
        System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
}
}
