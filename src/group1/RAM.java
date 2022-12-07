package group1;

public class RAM extends Computer {
    String name;
    int volume;

    public RAM( String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public RAM() {
    }
    public static void main(String[] args) {

//        System.out.println();
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
