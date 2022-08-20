//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1 5:30
        /**
         * Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в
         * неструктурированном формате, и бухгалтерия попросила написать программу, в которой можно
         * работать с Ф.И.О. сотрудников.
         * Напишите четыре строки:
         * первая с именем firstName — для хранения имени;
         * вторая с именем middleName — для хранения отчества;
         * третья с именем lastName — для хранения фамилии;
         * четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя
         * Отчество".
         * Выведите в консоль фразу: “ФИО сотрудника — ….”
         * В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
         * - Критерии оценки
         *     – Строки инициализированы верно.
         *     – Сложение строк проведено корректно.
         *     – При изменении данных в строках результат программы выводится корректно.
         *     – Все условия задания выполнены.
         */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // task 2 6:09
        /**
         * Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны    Ф.И.О.
         * сотрудников, полностью написанные заглавными буквами (верхним регистром).
         * Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich”
         * на полностью заглавные буквы.
         * В качестве строки с исходными данными используйте строку fullName.
         * Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения
         * отчета — …”
         * - Критерии оценки
         *     – Применен метод, меняющий регистр символов строки.
         *     –При изменении содержания строки результат программы выполняется.
         *     – Результат программы выведен в консоль согласно условиям задачи.
         */
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + upperCaseFullName);

        // task 3 6:17
        /**
         * Система, в которой мы работаем, не принимает символ “ё”.
         * Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
         * В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён
         * Семёнович”.
         * Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
         * - **Подсказка**
         *     Может потребоваться метод split() и метод contains().
         * - Критерии оценки
         *     – Применен метод, меняющий написание данных строки.
         *     –При изменении содержания строки результат программы выполняется.
         *     – Результат программы выведен в консоль согласно условиям задачи.
         */
        fullName = "Иванов Семён Семёнович";
        String replacedCharInFullName = fullName.replace("ё", "е");
        System.out.println(replacedCharInFullName);
        // 6:30

        // task 4
        /**
         * К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
         * разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
         * В качестве исходных данных используйте:
         * Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
         * строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
         * переменная firstName — для хранения имени;
         * переменная middleName — для хранения отчества;
         * переменная lastName — для хранения фамилии.
         * Решите задание с помощью метода substring().
         * Результат программы выведите в формате:
         * “Имя сотрудника — …”
         * “Фамилия сотрудника — …”
         * “Отчество сотрудника — ...”
         * :лампочка: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки
         * запрещено. Их должен вычислить компьютер.
         * :sos: Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
         * Критерии оценки
         * – При изменении содержания строки результат программы выполняется.
         * – Программа решена с помощью метода substring().
         * – Результат программы выведен в консоль согласно условиям задачи.
         */
        System.out.println("\nTask 4");
        fullName = "Ivanov - Ivan - Ivanovich";
        firstName = "";
        middleName = "";
        lastName = "";

        // option 1
        /*String[] splitedFullName = fullName.split(" - ");
        firstName = splitedFullName[1];
        middleName = splitedFullName[2];
        lastName = splitedFullName[0];
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);*/


        //option 2

        int firstBreake = fullName.indexOf(' ');
        int lastBreake = fullName.lastIndexOf(' ');
        lastName = fullName.substring(0, firstBreake);
        lastName = lastName.replace(" ", "");
        lastName = lastName.replace("-", "");
        firstName = fullName.substring(firstBreake, lastBreake);
        firstName = firstName.replace(" ", "");
        firstName = firstName.replace("-", "");
        middleName = fullName.substring(lastBreake, fullName.length());
        middleName = middleName.replace(" ", "");
        middleName = middleName.replace("-", "");
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        // task 5 8:58
        /**
         * Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают
         * со строчных букв.
         * Такую оплошность нужно исправить, написав программу, которая преобразует написанное со
         * строчных букв Ф. И. О. в правильный формат.
         * В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
         * которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
         * Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с
         * заглавных букв — …”
         * :sos: Подсказка 1
         * Метод toCharArray() может быть полезен.
         * :sos: Подсказка 2
         * Для преобразования символа в верхний регистр следует использовать метод
         * Character.toUpperCase(c), где c — символ.
         * Критерии оценки
         * – Применен метод, меняющий написание данных строки.
         * – При изменении содержания строки результат программы выполняется.
         * – Результат программы выведен в консоль согласно условиям задачи.
         */
       /* System.out.println("\nTask 5");
        fullName = "ivanov ivan ivanovich";
        String fullNameToUpperCase = "";
        String firstNameToUpperCase = "";
        String middleNameToUpperCase = "";
        String lastNameToUpperCase = "";
        String[] splitedFullName = fullName.split(" ");

        char[] nameToChars = new char[splitedFullName.length];

        for (String name : splitedFullName) {
            nameToChars = name.toCharArray();
            nameToChars[0] = Character.toUpperCase(nameToChars[0]);
            nameToChars.toString();
            System.out.print(nameToChars);
        }
        */
    }
}

