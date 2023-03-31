public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("bread", 35, 10))
                .addProduct(new Milk("moloko", 50, 2))
                .addProduct(new Product("cheese", 100.2, 5))
                .addProduct(new ConcentrateMilk("Советская", 150, 1))
                .addProduct(new Chocolate("Аленка", 35.20,3, "ореховый"))
                .addProduct(new Cookies("сливочное", 55.73, 8, "Ккофе" ))
                .addProduct(new Puff("сдобная", 23.18, 4, "с сахаром"))
                .addProduct(new Water("Святой источник", 76.55, 5, "газированная"))
                .addProduct(new Chips("Lays", 65.00, 9, "краба"));

        System.out.println("До продажи");
        System.out.println(mart);
        PrintSell(mart,"moloko");
        PrintSell(mart,"moloko");
        PrintSell(mart,"moloko");
        System.out.println();
        System.out.println("После продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart,"Фиговина");
        System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}