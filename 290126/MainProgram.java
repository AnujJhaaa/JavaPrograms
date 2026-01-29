import mathematics.Addition;
import mathematics.Division;
import mathematics.geometry.Triangle;
import mathematics.geometry.Square;
import bank.CreditCard;
import bank.DebitCard;
import ecommerce.Product;
import ecommerce.Order;

public class MainProgram {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.additionOperation1();
        addition.additionOperation2();
        System.out.println();

        Division division = new Division();
        division.divisionOperation1();
        division.divisionOperation2();
        System.out.println();

        Triangle triangle = new Triangle();
        triangle.triangleOperation1();
        triangle.triangleOperation2();
        System.out.println();

        Square square = new Square();
        square.squareOperation1();
        square.squareOperation2();
        System.out.println();

        CreditCard creditCard = new CreditCard();
        creditCard.creditOperation1();
        creditCard.creditOperation2();
        System.out.println();

        DebitCard debitCard = new DebitCard();
        debitCard.debitOperation1();
        debitCard.debitOperation2();
        System.out.println();

        Product product = new Product();
        product.productOperation1();
        product.productOperation2();
        System.out.println();

        Order order = new Order();
        order.orderOperation1();
        order.orderOperation2();
        System.out.println();
    }
}
