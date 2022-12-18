public class AbstractFactoryExample {

    public static void main(String[] args) {

        AbstractFactory fabrica1 = new ConcreteFactory();
        Client cliente1 = new Client(fabrica1);
        cliente1.execute();

        AbstractFactory fabrica2 = new ConcreteFactory2();
        Client cliente2 = new Client(fabrica2);
        cliente2.execute();
    }
}