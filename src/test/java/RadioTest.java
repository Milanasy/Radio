import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.platform.engine.support.hierarchical.SingleTestExecutor;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void setCurrentStationWhenStationFromZeroToNineShouldGetFive() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationWhenStationMoreThanNineShouldSetZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationWhenStationLessThanZeroShouldSetZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStationShouldGetCurrentStationShouldGetSeven() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextWhenCurrentStationEqualNineShouldSetZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextWhenCurrentStationNotEqualNineShouldSetEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevShouldExpectedNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevShouldExpectedFour() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeTest() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenVolumeMoreThen100() {
        Radio radio = new Radio();

        for (int i = 0; i<=102; i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseVolumeTest() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeWhenElementZeroTest() {
        Radio radio = new Radio();
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}