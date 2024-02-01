package DIP;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Запущен бензиновый двигатель");
    }
}
