package Java.java_Sort;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

//Complete the code
public class Solution  {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }

        Collections.sort(studentList, (s1, s2) -> {
            if (s1.getCgpa()== s2.getCgpa()) {
                return s1.getFname().compareTo(s2.getFname());
            }
//            double v = s1.getCgpa() - s2.getCgpa();
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



