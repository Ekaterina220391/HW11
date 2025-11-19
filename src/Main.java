//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+ firstName+ " " + middleName;
        System.out.println("Ф. И. О. сотрудника —" + fullName);

        System.out.println("Задача 2");
        fullName = "Ivanov Ivan Ivanovich";
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —" + fullName1);

        System.out.println("Задача 3");
        fullName = "Иванов Семём Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника —" + fullNameTrue);


    }
}