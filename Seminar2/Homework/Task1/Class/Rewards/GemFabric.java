package Class.Rewards;

import Class.ItemGenerator;
import Class.IGameItem;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
