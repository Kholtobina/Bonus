public class Main {
    public static void main(String[] args) {
        int initial = 120;
        int transfer = 1000;
        int bonus;
        int total;
        if (transfer >= 1000) {
            bonus = transfer / 100;
            total = initial + transfer + bonus;
            System.out.println(bonus);
            System.out.println(total);
        }else{
            System.out.print("Бонусов не начислено");
        }
    }
}
