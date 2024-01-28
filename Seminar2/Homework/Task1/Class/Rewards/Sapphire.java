package Class.Rewards;

import Class.IGameItem;

public class Sapphire implements IGameItem {
    @Override
    public void open() {
        System.out.println("Sapphire!");
    }
}
