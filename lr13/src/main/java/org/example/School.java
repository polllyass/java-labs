package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String address;
    private List<Student> students;
    private int teachers;
    private int rating;

    public School(String name, String address, int teachers, int rating)
            throws InvalidSchoolDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidSchoolDataException("название школы не может быть пустым");
        }
        if (teachers < 0) {
            throw new InvalidSchoolDataException("кол-во учителей не может быть отрицательным");
        }
        if (rating < 0 || rating > 5) {
            throw new InvalidSchoolDataException("рейтинг должен быть от 0 до 5");
        }
        this.name = name;
        this.address = address;
        this.students = new ArrayList<>();
        this.teachers = teachers;
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getStudentsCount() { return students.size(); }
    public int getTeachers() { return teachers; }
    public int getRating() { return rating; }

    public void enrollStudent(String studentName)
            throws InvalidSchoolDataException, EnrollmentException {
        if (studentName == null || studentName.isEmpty()) {
            throw new InvalidSchoolDataException("имя ученика не может быть пустым");
        }
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(studentName)) {
                throw new EnrollmentException("ученик " + studentName + " уже зачислен");
            }
        }
        students.add(new Student(studentName));
        System.out.println("ученик " + studentName + " зачислен в " + name);
    }

    public void expelStudent(String studentName)
            throws StudentNotFoundException {
        Student found = null;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(studentName)) {
                found = s;
                break;
            }
        }
        if (found == null) {
            throw new StudentNotFoundException("ученик не найден", studentName);
        }
        students.remove(found);
        System.out.println("ученик " + studentName + " отчислен");
    }

    public void printStudents() {
        System.out.println("ученики школы " + name + ":");
        if (students.isEmpty()) {
            System.out.println("  (нет учеников)");
        } else {
            for (Student s : students) {
                System.out.println("  - " + s.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Школа{название='" + name + "', адрес='" + address +
                "', студенты=" + students.size() +
                ", учителя=" + teachers + ", рейтинг=" + rating + "}";
    }
}