import mypackage.*;
public class Main {
    public static void main(String[] args) {
        Park park = new Park("Развлекательный Парк");
        park.addAttraction();
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
