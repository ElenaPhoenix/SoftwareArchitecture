package Class.Rewards;

import Class.IGameItem;

public class Silver implements IGameItem {

    @Override
    public void open() {
        System.out.println("Silver!");
    }
}
