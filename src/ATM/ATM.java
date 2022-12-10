package ATM;

import java.util.Objects;
import java.util.Scanner;

public class ATM {
    int bill20;
    int bill50;
    int bill100;
    Scanner scanner = new Scanner(System.in);
    static int sum;
    int money= scanner.nextInt();;

    public ATM(int bill20, int bill50, int bill100, int sum) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
        this.sum = 1000;
    }
    public ATM() {
    }
    public static void main(String[] args) {
        ATM cash = new ATM(100, 10, 8, sum);
        cash.noMoney();
        cash.remainder();
        System.out.println(cash);
//    }
//    Object summa() {
//        String what = scanner.nextLine();
//        if (Objects.equals(what, "Снять наличные")) {
//            Object remainder = null;
//            return remainder;
//        }
//        return null;
    }
    int noMoney(){
        if (sum <money) {
                System.out.println("недостаточно денег на счету");
            }return money= scanner.nextInt();
    }

    void remainder() {
        sum -= money;
        if (bill100-money / 100 >= 0&&money % 100 == 0) {
            bill100 = bill100 - (money / 100);
            System.out.println("Вы сняли :" + money / 100+" купюр номиналом 100");
        } else if (bill100-money / 100 < 0&&money % 50==0) {
            bill50 =bill50+ 2*(bill100 - (money / 100));
            bill100=bill100-bill100;

            System.out.println("На счету осталось :"+sum+" " + bill50+" купюр наминалом в 50 рублей "
                    +bill100+" купюр наминалом в 100 рублей"+bill20+" купюр наминалом в 20 рублей " );
        } else if (money % 20 == 0) {
            bill20 = bill50 - (money / 20);
            System.out.println("На счету осталось :" + bill20);
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

