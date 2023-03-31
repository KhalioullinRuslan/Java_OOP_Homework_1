public class Chips extends Product{

    private String taste;
    public Chips(String name, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Чипсы со вкусом %s, %s", taste, super.toString());
    }
}