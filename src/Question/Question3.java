package Question;
import java.util.Scanner;
/* Write a program to find whether the array of integers contains a duplicate number. if yes print the location where duplicate numbers are found.
Q. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. Now write a program to
(a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.
 (c) find the number of students who have scored below 50 in their average.
(d) display the scores obtained by every student.
 */
class student4Subject5
{
    int [][]stu;
    int students=4, subject=5;
    student4Subject5()
    {
        stu=new int[students][subject];
    }
    public void operation()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<students;i++)
        {
            System.out.println("Enter the marks of" +(i+1)+" student :");
            for (int j=0;j<subject;j++)
            {
                stu[i][j]=sc.nextInt();
            }
        }
        System.out.println("Average marks obtained in each subject ");
        int sum=0;
        for(int i=0;i<subject;i++)
        {
            System.out.print("Subject "+(i+1)+" :");
            for (int j=0;j<students;j++)
            {
                sum+=stu[j][i];
            }
            System.out.print(" "+sum+"\n");
        }

        int sum1=0;
        int numberOfStudents=0;
        System.out.println("Average marks obtained by every student :");
        for(int i=0;i<students;i++)
        {
            System.out.print("Student "+(i+1)+" :");
            for (int j=0;j<subject;j++)
            {
                sum1+=stu[i][j];
            }
            System.out.print(" "+sum1+"\n");
            if(sum1<=50)
            {
                numberOfStudents+=1;
            }
        }

        System.out.println("There are "+numberOfStudents+" Students who have scored below 50 in their average.");
        System.out.println("Marks of every students :");
        for(int i=0;i<students;i++)
        {
            System.out.print("Student "+(i+1)+" :");
            for (int j=0;j<subject;j++)
            {
                System.out.print(stu[i][j]+" ");
            }
            System.out.println();
        }

    }
}
public class Question3 {
    public static void main(String[] args) {
        student4Subject5 st=new student4Subject5();
        st.operation();
    }
}
