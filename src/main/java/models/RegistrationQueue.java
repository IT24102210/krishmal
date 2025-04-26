package utils;

import models.Student;
import java.util.LinkedList;
import java.util.Queue;

public class RegistrationQueue {
    private Queue<Student> queue = new LinkedList<>();

    public void addStudent(Student student) {
        queue.add(student);
    }

    public Student processNextStudent() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
