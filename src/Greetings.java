public class Greetings implements MessageSendler, SendMessageOnEmail {

    @Override
    public void messageSend(BuyerTypeIdentifier buyerType) {
        if (buyerType.isMan()) {
            System.out.println("Hello! We have good discounts on weapons today");
        } else if (buyerType.isWoman()) {
            System.out.println("Hello! We have good discounts on panties today");
        } else if (buyerType.isChild()) {
            System.out.println("Hello! If you don't have money, leave");
        } else {
            System.out.println("I don't know who you are, but hello");
        }
    }

    @Override
    public void sendOnEmail(String email) {
        // Алгоритм отправки сообщения на почту
    }
}
