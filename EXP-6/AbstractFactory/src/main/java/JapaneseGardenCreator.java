public class JapaneseGardenCreator extends AbstractGardenCreator {

    @Override
    public AbstractTree createTree() {
        Maple maple = new Maple();
        return maple;
    }

    @Override
    public AbstractFlower createFlower() {
        Tsubaki tsubaki = new Tsubaki();
        return tsubaki;
    }
}
