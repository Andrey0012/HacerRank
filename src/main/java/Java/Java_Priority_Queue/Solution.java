package Java.Java_Priority_Queue;

import java.util.*;

class Student implements Comparable<Student> {
    private final String name;
    private final int id;
    private final double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name + ", id: " + id + ", cgpa: " + cgpa;
    }


    @Override
    public int compareTo(Student o) {
        int cgpaCompare = Double.compare(o.cgpa, cgpa);
        if (cgpaCompare == 0) {
            int nameCompare = name.compareTo(o.name);
            if (nameCompare == 0) {
                return Integer.compare(o.id, id);
            }
            return nameCompare;
        }
        return cgpaCompare;
    }
}

class Priorities {
    private final Queue<Student> queue = new PriorityQueue<>();

    public List<Student> getStudents(List<String> events) {

        ArrayList<Student> list = new ArrayList<>();
        for (String event : events) {
            String[] split = event.split(" ");
            String action = split[0];
            String name = "";
            double cgpa = 0;
            int id = 0;
            if (split.length > 1) {
                name = split[1];
                cgpa = Double.parseDouble(split[2]);
                id = Integer.parseInt(split[3]);
            }
            Student student = new Student(id, name, cgpa);
            if (action.equals("ENTER")) {
                queue.add(student);
            } else queue.poll();
        }
        while (queue.size()>0){
            list.add(queue.poll());
        }
        return list;
    }

}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
