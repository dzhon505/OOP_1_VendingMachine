import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Ivan", "Novikov", 18, 101);
        Student s2 = new Student("Dima", "Semenov", 25, 121);
        Student s3 = new Student("Kola", "Koshkin", 21, 111);
        Student s4 = new Student("Masha", "Morzhova", 26, 301);
        Student s5 = new Student("Sveta", "Ivanova", 23, 221);
        Student s6 = new Student("Sasha", "Petrov", 22, 106);

        User u1 = new User("Semen", "Krasnii", 21);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group1 = new StudentGroup(listStud);

        for (Student stud :
                group1) {
            System.out.println(stud);
        }

        listStud.clear();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        StudentGroup group2 = new StudentGroup(listStud);

        Collections.sort(group1.getStudents());



        for (Student stud :
                group2) {
            System.out.println(stud);
        }
//        System.out.println(s1);
//        System.out.println(u1);
//        System.out.println(group);
    }
}