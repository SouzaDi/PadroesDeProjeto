class ProductB2 implements AbstractProductB {

    @Override
    public void interact(AbstractProductA a) {
        System.out.println(this.getClass().getName() + " interact with " + a.getClass().getName());
    }

}