public class Main {
    public static void main(String[] args) {


        int startMoney = 300;//Деньги на счету
        int addMoney = 1000;//Сумма пополнения
        int bonus; //Количество бонусов
        int finalMoney; //Итог

        if (addMoney >= 1000) {
            bonus = addMoney / 100;
        } else {
            bonus = 0;
        }

        finalMoney = startMoney + addMoney + bonus;

        if (bonus == 0) {
            System.out.println("Баланс пополнен на " + addMoney + ". Сумма на счету составляет " + finalMoney);
        } else {
            System.out.println("Баланс пополнен на " + addMoney + " руб. Получено бонусов " + bonus + " руб. Сумма на счету составляет " + finalMoney + " руб.");
        }


    }

}
