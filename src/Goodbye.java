public class Goodbye implements MessageSendler{
    @Override
    public void messageSend(BuyerTypeIdentifier buyerType) {
        System.out.println("Goodbye!");
    }
}
