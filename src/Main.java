public class Main {
    public static void main(String[] args) {
        int price = 10_000;
        int needMin = 20;
        int bonus = price / needMin;
        String message = "Начислено бонусных миль: ";
        String message2 = "Бонусные мили не начислены";

        if (bonus > 0) {
            System.out.println(message + bonus);
        } else {
            System.out.println(message2);
        }
    }
}
