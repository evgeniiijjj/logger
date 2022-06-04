import java.util.*;

public class Main {

    static final Logger logger = Logger.getInstance();
    static final Scanner scanner = new Scanner(System.in);
    static final List<Integer> list = new ArrayList<>();
    static final Random rnd = new Random();

    public static void main(String[] args) {
        int step = 0, n = 0, m, f = 0;
        while (true) {
            try {
                switch (step) {
                    case 0:
                        logger.log("Запускам программу");
                        System.out.println("Здравствуйте!");
                        logger.log("Просим пользователя ввести данные для списка");
                        step++;
                    case 1:
                        System.out.print("Введите размер списка: ");
                        n = Integer.parseInt(scanner.nextLine());
                        step++;
                    case 2:
                        System.out.print("Введите верхнюю границу для значений: ");
                        m = Integer.parseInt(scanner.nextLine());
                        step++;
                        logger.log("Создаем и наполняем список");
                        for (int i = 0; i < n; i++) {
                            list.add(rnd.nextInt(m + 1));
                        }
                        System.out.println("Вот случайный список: " + list);
                        logger.log("Просим пользователя ввести входные данные для фильтрации");
                    case 3:
                        System.out.print("Введите порог для фильтра: ");
                        f = Integer.parseInt(scanner.nextLine());
                        logger.log("Запускам фильтрацию");
                        List<Integer> result = new Filter(f).filterOut(list);
                        logger.log(String.format("Прошло фильтр %d элементов из %d", result.size(), n));
                        logger.log("Выводим результат на экран");
                        System.out.println("Отфильтрованный список: " + result);
                        logger.log("Завершаем программу");
                        break;
                    default:
                }
                break;
            } catch (NumberFormatException e) {
                logger.log("Данные введены не корректно, просим пользователя ввести данные повторно");
                System.out.println("Ввод некорректен, повторите ввод");
            }
        }
    }
}
