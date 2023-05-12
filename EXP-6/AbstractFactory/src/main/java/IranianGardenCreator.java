public class IranianGardenCreator extends AbstractGardenCreator{

    @Override
    public AbstractFlower createFlower() {
        Khatmi khatmi = new Khatmi();
        return khatmi;
    }

    @Override
    public AbstractTree createTree() {
        Chenar chenar = new Chenar();
        return chenar;
    }
}
