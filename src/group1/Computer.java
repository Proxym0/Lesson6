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

    public Computer(int price, String model, RAM ram, HDD hdd) {
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


    class RAM {
        String name;
        int volume;

        RAM(String name, int volume) {
            this.name = name;
            this.volume = volume;
        }

        public RAM() {
        }

        @Override
        public String toString() {
            return "RAM{" +
                    "name='" + name + '\'' +
                    ", volume=" + volume +
                    '}';
        }
    }
        public class HDD {
            String name;
            int volume;
            String externaltype;
            String internaltype2;

            public HDD(String name, int volume, String externaltype, String internaltype2) {
                this.name = name;
                this.volume = volume;
                this.externaltype = externaltype;
                this.internaltype2 = internaltype2;
            }

            public HDD() {
            }
        }
            public static void main(String[] args) {
                Computer computer1 = new Computer(10, "apple");
                Computer computer2 = new Computer(15, "dell");
                System.out.println(computer1);
                System.out.println(computer2);
            }
        }

