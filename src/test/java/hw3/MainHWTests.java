package hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.gbhomeworks.hw3.MainHW;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainHWTests {
    MainHW mainHW;

    @BeforeEach
    void initData() {
        mainHW = new MainHW();
    }

    @Test
    void evenOddNumberTestTrue() {
        assertTrue(mainHW.evenOddNumber(1587954638));
    }

    @Test
    void evenOddNumberTestFalse() {
        assertFalse(mainHW.evenOddNumber(477984137));
    }


    @ParameterizedTest()
    @ValueSource(ints = {26, 30, 78, 99})
    void numberInIntervalTest(int number){
        assertTrue(mainHW.numberInInterval(number));
    }

    @ParameterizedTest()
    @ValueSource(ints = {10, 25, 100, 110})
    void numberNotInIntervalTest(int number){
        assertFalse(mainHW.numberInInterval(number));
    }
}
