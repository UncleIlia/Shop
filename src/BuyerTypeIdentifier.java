
public class BuyerTypeIdentifier {
    private boolean man;
    private boolean woman;
    private boolean child;

    public boolean isMan() {
        return man;
    }

    public boolean isWoman() {
        return woman;
    }

    public boolean isChild() {
        return child;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public void setWoman(boolean woman) {
        this.woman = woman;
    }

    public void setChild(boolean child) {
        this.child = child;
    }

    public void identify (Buyer buyer) {

        if ((buyer.getSex().equals("Man") || buyer.getSex().equals("man")) && buyer.getAge() >= 18) {
            setMan(true);
        }
        if ((buyer.getSex().equals("Woman") || buyer.getSex().equals("woman")) && buyer.getAge() >= 18) {
            setWoman(true);
        }
        if ((buyer.getSex().equals("Man") || buyer.getSex().equals("man")
                || buyer.getSex().equals("Woman") || buyer.getSex().equals("woman")) && buyer.getAge() < 18) {
            setChild(true);
        }
    }
}
