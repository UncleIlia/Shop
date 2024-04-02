import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BuyerTypeIdentifier buyerType = new BuyerTypeIdentifier();
        MessageSendler messageSandler = new Greetings();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String buyersName = scanner.nextLine();
        System.out.println("Enter your age:");
        int buyersAge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your sex:");
        String buyersSex = scanner.nextLine();

        Buyer buyer = new Buyer(buyersName, buyersAge, buyersSex);

        buyerType.identify(buyer);
        messageSandler.messageSend(buyerType);
        GoodsForBuyers goodsForBuyers = new GoodsForBuyers();

        System.out.println("Please, look at the list of products for you:");
        System.out.println(goodsForBuyers.creationListOfGoods(buyerType));
        Basket basket = new Basket();
        List<String> buyersBasket = basket.createBasket(goodsForBuyers.creationListOfGoods(buyerType));
        Sorter sorter = new LengthSorter();
        sorter.sort(buyersBasket);
        System.out.println(buyersBasket);

        MessageSendler messageSendler = new Goodbye();
        messageSendler.messageSend(buyerType);

    }
}
