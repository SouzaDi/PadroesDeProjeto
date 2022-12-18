class Client {
    private AbstractProductA produtoA;
    private AbstractProductB produtoB;

    Client(AbstractFactory fabrica) {
        produtoA = fabrica.createProdutoA();
        produtoB = fabrica.createProdutoB();
    }

    void execute() {
        produtoB.interact(produtoA);
    }
}