class ConcreteFactory implements AbstractFactory {

    @Override
    public AbstractProductA createProdutoA() {
        return new ProductA1();
    }
    @Override
    public AbstractProductB createProdutoB() {
        return new ProductB1();
    }
}