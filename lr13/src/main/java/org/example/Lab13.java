package org.example;

public class Lab13 {
    public static void main(String[] args) {
        System.out.println("создание школы:");
        School school = null;

        try {
            school = new School("школа №1", "ул. Ленина 10", 20, 5);
            System.out.println("школа создана: " + school);
        } catch (InvalidSchoolDataException e) {
            System.out.println("ошибка создания: " + e.getMessage());
            return;
        }

        System.out.println("\nзачисление учеников:");
        try {
            school.enrollStudent("Анна");
            school.enrollStudent("Борис");
            school.enrollStudent("Виктор");
        } catch (InvalidSchoolDataException | EnrollmentException e) {
            System.out.println("ошибка зачисления: " + e.getMessage());
        }

        System.out.println("\nпопытка повторного зачисления:");
        try {
            school.enrollStudent("Анна");
        } catch (InvalidSchoolDataException | EnrollmentException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        System.out.println("\nпопытка зачислить пустое имя:");
        try {
            school.enrollStudent("");
        } catch (InvalidSchoolDataException | EnrollmentException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        System.out.println("\nсписок учеников:");
        school.printStudents();

        System.out.println("\nотчисление Бориса:");
        try {
            school.expelStudent("Борис");
        } catch (StudentNotFoundException e) {
            System.out.println("ошибка: " + e.getMessage() +
                    " (ученик: " + e.getStudentName() + ")");
        }

        System.out.println("\nотчисление несуществующего:");
        try {
            school.expelStudent("неизвестный");
        } catch (StudentNotFoundException e) {
            System.out.println("ошибка: " + e.getMessage() +
                    " (ученик: " + e.getStudentName() + ")");
        }

        System.out.println("\nитоговый список:");
        school.printStudents();
        System.out.println("\nитого учеников: " + school.getStudentsCount());
    }
}