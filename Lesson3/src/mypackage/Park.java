package mypackage; // Указываем пакет
public class Park {
    private String name; // Название парка
    public Park(String name) {
        this.name = name;
    }
    // Внутренний класс "Attraction"
    class Attraction {
        private String name; // Название аттракциона
        private String workingHours; // Время работы
        private double price; // Стоимость
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
        public void printAttractionInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
        }
    }
    // Метод для создания и вывода информации об аттракционах
    public void addAttraction() {
        Attraction attraction1 = new Attraction("Американские горки", "10:00 - 20:00", 500);
        Attraction attraction2 = new Attraction("Колесо обозрения", "11:00 - 22:00", 300);
        attraction1.printAttractionInfo();
        System.out.println(); // Разделение информации
        attraction2.printAttractionInfo();
    }
    public static void main(String[] args) {
        Park park = new Park("Развлекательный Парк");
        park.addAttraction();
    }
}