class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProdutoA() {
        return new ProductA2();
    }
    @Override
    public AbstractProductB createProdutoB() {
        return new ProductB2();
    }
}