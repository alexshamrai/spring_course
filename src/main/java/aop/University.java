package aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class University {

    private List<Student> sudents = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Alex Shamrai", 4, 7.5);
        Student st2 = new Student("Mikhail Ivanov", 2, 8.3);
        Student st3 = new Student("Elena Sidorova", 1, 9.1);
        sudents.add(st1);
        sudents.add(st2);
        sudents.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents:");
        System.out.println(sudents);
        return sudents;
    }
}
