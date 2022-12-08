package group1;

public class Computer {
    int price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer() {
        price = 10;
        model ="apple";
        this.ram = new RAM();
        this.hdd = new HDD();
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
    public static void main(String[] args) {
        Computer.RAM ram = new RAM("app",256);
        Computer.HDD hdd=new HDD("ddr",256,"12");
        Computer computer1 = new Computer();
        Computer computer2 = new Computer(20,"DELL",ram,hdd);

//        computer2.internaltype2;
        System.out.println(computer1);
        System.out.println(computer2);}

    static class RAM {
        String name;
        int volume;

        public RAM(String name, int volume) {
            this.name = name;
            this.volume = volume;
        }

        public RAM() {
            name = "ddr2";
            volume =512;
        }
        void ram1(){

        }
        @Override
        public String toString() {
            return "RAM{" +
                    "name='" + name + '\'' +
                    ", volume=" + volume +
                    '}';
        }
    }
        public static class HDD {
            String name;
            int volume;
            String externaltype;

            public HDD(String name, int volume, String externaltype) {
                this.name = name;
                this.volume = volume;
                this.externaltype = externaltype;

            }

            public HDD() {
                name="ddr";
                volume=256;
                externaltype="12";


            }

            @Override
            public String toString() {
                return "HDD{" +
                        "name='" + name + '\'' +
                        ", volume=" + volume +
                        ", externaltype='" + externaltype + '\'' +
                        '}';
            }
        }
}


