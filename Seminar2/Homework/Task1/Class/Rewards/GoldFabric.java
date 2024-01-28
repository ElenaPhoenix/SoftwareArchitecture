package Class.Rewards;

import Class.ItemGenerator;
import Class.IGameItem;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
