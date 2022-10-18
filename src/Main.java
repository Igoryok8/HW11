public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println();
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " +fullName);
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        fullName = lastName + firstName + middleName;
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " +fullName1);
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " +fullName2);
    }
}