package group1;

public class HDD extends Computer {
    String name;
    int volume;
    String externaltype;
    String internaltype2;

    public HDD(int price, String model, String name, int volume, String externaltype, String internaltype2) {
        super(price, model);
        this.name = name;
        this.volume = volume;
        this.externaltype = externaltype;
        this.internaltype2 = internaltype2;
    }

    public HDD() {
    }

    public static void main(String[] args) {


    }
}
