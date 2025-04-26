package utils;

import models.Student;
import java.util.List;

public class SortStudents {
    public static void insertionSort(List<Student> students) {
        for (int i = 1; i < students.size(); i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getRegistrationTime().after(key.getRegistrationTime())) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }
            students.set(j + 1, key);
        }
    }
}
