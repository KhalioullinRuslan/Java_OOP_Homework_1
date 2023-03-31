public class Water extends Product{

    private String taste;
    public Water(String name, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Вода %s, %s", taste, super.toString());
    }
}
