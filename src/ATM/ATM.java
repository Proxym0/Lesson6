package ATM;

import java.util.Objects;
import java.util.Scanner;

public class ATM {
    double bill20;
    double bill50;
    double bill100;
    Scanner scanner = new Scanner(System.in);
    static double sum;
    double money = scanner.nextDouble();

    public ATM(double bill20, double bill50, double bill100, double sum) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
        this.sum = 1100;
    }

    public ATM() {
    }

    public static void main(String[] args) {
        ATM cash = new ATM(100.0, 50.0, 8.0, sum);
        cash.noMoney();
        cash.remainder();
        System.out.println(cash);
    }

    double noMoney() {
        if (sum < money) {
            System.out.println("недостаточно денег на счету");
        }
        return money = scanner.nextDouble();
    }

    void remainder() {
        sum -= money;

    if(bill100 -money /100>=0&&money %100==0) {
        bill100 = bill100 - (money / 100);
        System.out.println("На счету осталось :" + sum + " " + bill50 + " купюр наминалом в 50 рублей "
                + bill100 + " купюр наминалом в 100 рублей" + bill20 + " купюр наминалом в 20 рублей ");
    } else if(bill100 -money /100 < 0&&money %50==0&&bill50 /2+bill100 -money /100>=0)

    {
        bill50 = bill50 * 2 + bill100 - (money / 100);
        bill100 = 0.0;
        System.out.println("На счету осталось :" + sum + " " + bill50 + " купюр наминалом в 50 рублей "
                + bill100 + " купюр наминалом в 100 рублей" + bill20 + " купюр наминалом в 20 рублей ");
    } else if(bill100 -money /100 < 0&&bill20 *5+bill50 *2+bill100 -money /100>=0&&money %20==0)

    {
        bill20 = bill20 + 2 * (bill50 + 2 * (bill100 - (money / 100)));
        bill100 = 0.0;
        bill50 = 0.0;
        System.out.println("На счету осталось :" + sum + " " + bill50 + " купюр наминалом в 50 рублей "
                + bill100 + " купюр наминалом в 100 рублей " + bill20 + " купюр наминалом в 20 рублей ");
    } else if(money %20==0&&bill20 -money /20>=0)

    {
        bill20 = bill20 - (money / 20);
        System.out.println("На счету осталось :" + sum + " " + bill50 + " купюр наминалом в 50 рублей "
                + bill100 + " купюр наминалом в 100 рублей " + bill20 + " купюр наминалом в 20 рублей ");
    }else if((bill50 -(money /50))>=0&&money %50==0)

    {
        bill50 = bill50 - money / 50;
        System.out.println("На счету осталось :" + sum + " " + bill50 + " купюр наминалом в 50 рублей "
                + bill100 + " купюр наминалом в 100 рублей " + bill20 + " купюр наминалом в 20 рублей ");
    }

}
        @Override
        public String toString () {
            return "ATM{" +
                    "bill20=" + bill20 +
                    ", bill50=" + bill50 +
                    ", bill100=" + bill100 +
                    ", sum=" + sum +
                    '}';
        }
    }

