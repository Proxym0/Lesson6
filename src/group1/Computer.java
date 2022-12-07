package group1;

public class Computer {
    int price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }
    public  Computer(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

    public static void main(String[] args) {
        Computer computer1=new Computer(10,"apple");
        Computer computer2=new Computer(15,"dell");
        System.out.println(computer1);
        System.out.println(computer2);

    }
}