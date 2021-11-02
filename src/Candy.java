public class Candy {
    public String name;
    public String size;

    public Candy(String name) {
        this.name = name;
        this.size = "unknown";
    }

    public static void main(String[] args) {
        Candy unknownCandy = new Candy("Snickers");


        System.out.println("unknownCandy.name = " + unknownCandy.name);
        System.out.println("unknownCandy.size = " + unknownCandy.size);

    }
}
