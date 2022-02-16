public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 100;
        int bonus;
        int limit = 1000;
        if (amount >= limit) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println(account + amount + bonus);
    }
}
