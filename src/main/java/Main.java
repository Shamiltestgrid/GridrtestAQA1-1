public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int rezult = service.remain(1300);
        System.out.println(rezult);

        if (rezult % 1000 == 0){
            System.out.println("Спасибо за покупку!");
        } else System.out.println("Докупите товар на сумму " + rezult + " рублей");
    }
}
