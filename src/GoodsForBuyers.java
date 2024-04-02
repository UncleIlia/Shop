import java.util.Arrays;
import java.util.List;

public class GoodsForBuyers implements Goods{
    private String goodsForMen = "bread, weapons, guitars";
    private String goodsForWomen = "bread, panties, candies";
    private String goodsForChildren = "bread, candies, toys, guitars";
    private String allGoods = "bread, weapons, panties, candies, guitars, toys";
    @Override
    public List<String> creationListOfGoods(BuyerTypeIdentifier buyerType) {
        if (buyerType.isMan()) {
            return Arrays.asList(goodsForMen.split("\\s*,\\s*"));
        } else if (buyerType.isWoman()) {
            return Arrays.asList(goodsForWomen.split("\\s*,\\s*"));
        } else if (buyerType.isChild()) {
            return Arrays.asList(goodsForChildren.split("\\s*,\\s*"));
        } else {
            return Arrays.asList(allGoods.split("\\s*,\\s*"));
        }
    }
}
