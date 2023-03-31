public class Puff extends Product{

    private String taste;
    public Puff(String name, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Слойка %s, %s", taste, super.toString());
    }
}
