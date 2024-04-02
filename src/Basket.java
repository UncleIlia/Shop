import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {
    public List<String> createBasket(List<String> listOfGoods) {
        List<String> basket = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("������� ����� ������ ��� ������� end");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int productNumber = Integer.parseInt(input);
            basket.add(listOfGoods.get(productNumber - 1));
        }
        int quantityOfProducts = basket.size();
        System.out.println("����� �������: " + quantityOfProducts);
        System.out.println("���������� ����� �������:");
        return basket;
    }
}
