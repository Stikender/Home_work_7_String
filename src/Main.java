import javax.naming.InvalidNameException;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Exercise 2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);

        // Exercise 3
        String fullName2 = "Иванов Семён Семёнович";
        String fullName2Correct = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2Correct);
    }
}