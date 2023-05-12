import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GardenCreatorTest {

    @Test
    void testIranianGardenCreator() {
        IranianGardenCreator gardenCreator = new IranianGardenCreator();

        AbstractTree tree = gardenCreator.createTree();
        assertTrue(tree instanceof Chenar);

        AbstractFlower flower = gardenCreator.createFlower();
        assertTrue(flower instanceof Khatmi);
    }

    @Test
    void testJapaneseGardenCreate() {
        JapaneseGardenCreator gardenCreator = new JapaneseGardenCreator();

        AbstractTree tree = gardenCreator.createTree();
        assertTrue(tree instanceof Maple);

        AbstractFlower flower = gardenCreator.createFlower();
        assertTrue(flower instanceof Tsubaki);

    }

}
