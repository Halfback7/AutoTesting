package mypackage;
public class Sotrudnik {
    private String fio; // ФИО
    private String dolzhnost; // Должность
    private String email; // Email
    private String telefon; // Телефон
    private double zarplata; // Зарплата
    private int vozrast; // Возраст
    // Конструктор класса
    public Sotrudnik(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }
    // Метод для вывода информации об объекте
    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + dolzhnost);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + telefon);
        System.out.println("Зарплата: " + zarplata);
        System.out.println("Возраст: " + vozrast);
    }
    // Главный метод для тестирования
    public static void main(String[] args) {
        // Создание массива из 5 сотрудников
        Sotrudnik[] persArray = new Sotrudnik[5];
        persArray[0] = new Sotrudnik("Иванов Иван Иванович", "Инженер", "ivivan@mailbox.com", "89231231212", 30000, 30);
        persArray[1] = new Sotrudnik("Петров Пётр Петрович", "Менеджер", "petrov@mailbox.com", "89231231213", 35000, 29);
        persArray[2] = new Sotrudnik("Сидоров Сидор Сидорович", "Аналитик", "sidor@mailbox.com", "89231231214", 40000, 35);
        persArray[3] = new Sotrudnik("Кузнецов Кузьма Кузьмич", "Дизайнер", "kuznetsov@mailbox.com", "89231231215", 32000, 27);
        persArray[4] = new Sotrudnik("Смирнов Смирно Смирнович", "Программист", "smirnov@mailbox.com", "89231231216", 45000, 31);
        // Вывод информации о сотрудниках
        for (Sotrudnik sotrudnik : persArray) {
            sotrudnik.printInfo();
            System.out.println(); // Разделение информации
        }
    }
}