import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task 1
        System.out.println("Task 1");
        String firstName = "Ivanov ";
        String middleName = "Ivan";
        String lastName = " Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
// task 2
        System.out.println("Task 2");
        String fullName1 = "Ivanov Ivan Ivanovich";
        String vFullName=fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + vFullName);
        //task 3
        System.out.println("Task 3");
        String fullName2 = "Иванов Семён Семёнович";
        String zFullName = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + zFullName);
    }
}