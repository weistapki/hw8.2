package order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Vladimir");
        coffeeOrderBoard.add("Anna");
        coffeeOrderBoard.add("Artem");
        coffeeOrderBoard.add("Dima");
        coffeeOrderBoard.add("Vasiliy");
        coffeeOrderBoard.add("Senator");
        coffeeOrderBoard.add("Gena");

        System.out.println("All orders: ");
        System.out.println(coffeeOrderBoard);
        System.out.println();
        System.out.println("Return done order : ");
        System.out.println(coffeeOrderBoard.deliver());
        System.out.println("Check delete orders : ");
        System.out.println(coffeeOrderBoard);
        System.out.println();
        System.out.println("Return done order by num : ");
        System.out.println(coffeeOrderBoard.deliver(3));
        System.out.println("Check delete orders : ");
        System.out.println(coffeeOrderBoard);
        System.out.println();
        coffeeOrderBoard.draw();
    }
}
