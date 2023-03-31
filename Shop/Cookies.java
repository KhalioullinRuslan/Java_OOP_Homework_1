public class Cookies extends Product{

    private String taste;
    public Cookies(String name, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Печенье %s, %s", taste, super.toString());
    }
}