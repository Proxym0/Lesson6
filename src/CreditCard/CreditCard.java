package CreditCard;
import java.util.Scanner;
public class CreditCard {
    int accountNumber;
    double currentAccountBalance;
    Scanner scanner = new Scanner(System.in);
      CreditCard(int accountNumber, double currentAccountBalance) {
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;
    }
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1234, 23.0);
        card1.currentAmountCard1();
        System.out.println(card1);
        CreditCard card2 = new CreditCard(4321, 10.0);
        card2.currentAmountCard2();
        System.out.println(card2);
        CreditCard card3 = new CreditCard(5678,40.0);
        card3.getTheAmount();
        System.out.println(card3);
    }
        void currentAmountCard1(){                                                                //начислить сумму на карту 1
            double a = scanner.nextInt();
            currentAccountBalance= currentAccountBalance + a;
        }
        void currentAmountCard2(){                                                                //начислить сумму на карту 2
            double a = scanner.nextInt();
            currentAccountBalance= currentAccountBalance + a;
        }
        void getTheAmount() {                                                                     //снять сумму с карты 3
            double a = scanner.nextInt();
            if(currentAccountBalance>a) {
                currentAccountBalance = currentAccountBalance - a;
            }else{
                System.out.println("недостаточно денег на счету");
            }
        }
        @Override
            public String toString() {
                return "CreditCard{" +
                        ", accountNumber=" + accountNumber +
                        ", currentAccountBalance=" + currentAccountBalance +
                        '}';
        }
        }








