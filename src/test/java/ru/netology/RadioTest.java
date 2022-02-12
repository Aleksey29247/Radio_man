package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
        //если значение 0 ++
    void increaseVolume0() {
        Radio thisRadio = new Radio();
        thisRadio.incVolume();
        int expected = 1;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume10() {
        Radio thisRadio = new Radio();
        thisRadio.setCurrentVolume(10);
        thisRadio.incVolume();
        int expected = 10;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);//a
    }

    @Test
        //0--
    void decreaseVolume0() {
        Radio thisRadio = new Radio();
        thisRadio.decVolume();
        int expected = 0;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //любое значение --
    void decreaseVolume2() {
        Radio thisRadio = new Radio();
        thisRadio.setCurrentVolume(3);
        thisRadio.decVolume();
        int expected = 2;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //канал ++
    void chNext() {
        Radio thisRadio = new Radio();
        thisRadio.next();
        int expected = 1;
        int actual = thisRadio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
        //канал ++
    void chNext10() {
        Radio thisRadio = new Radio();
        thisRadio.setChannel(9);
        thisRadio.next();
        int expected = 0;
        int actual = thisRadio.getChannel();

        assertEquals(expected, actual);
    }

    @Test
        //канал ---
    void chPrev() {
        Radio thisRadio = new Radio();
        thisRadio.prev();
        int expected = 9;
        int actual = thisRadio.getChannel();
        assertEquals(expected, actual);
    }

    @Test
    void chPrev0() {
        Radio thisRadio = new Radio();
        thisRadio.setChannel(1);
        thisRadio.prev();
        int expected = 0;
        int actual = thisRadio.getChannel();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void Setch() {
        Radio thisRadio = new Radio();
        thisRadio.setChannel(8);
        thisRadio.next();
        int expected = 9;
        int actual = thisRadio.getChannel();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void Setch12() {
        Radio thisRadio = new Radio();
        thisRadio.setChannel(10);
        thisRadio.next();
        int expected = 1;
        int actual = thisRadio.getChannel();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void setchA() {
        Radio thisRadio = new Radio();
        thisRadio.setChannel(-1);
        thisRadio.next();
        int expected = 1;
        int actual = thisRadio.getChannel();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void SetVolume11() {
        Radio thisRadio = new Radio();
        thisRadio.setCurrentVolume(11);
        thisRadio.incVolume();
        int expected = 1;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void SetVolumeA() {
        Radio thisRadio = new Radio();
        int expected;
        int actual;
        thisRadio.setCurrentVolume(-1);
        thisRadio.incVolume();
        expected = 1;
        actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void SetChaenelConstA() {
        Radio thisRadio = new Radio(100);
        int expected;
        int actual;
        thisRadio.setChannel(97);
        thisRadio.next();
        expected = 98;
        actual = thisRadio.getChannel();
        assertEquals(expected, actual);
    }

    @Test
    void SetVolumeConstALL() {
        Radio thisRadio = new Radio(100, 100);
        int expected;
        int actual;
        thisRadio.setCurrentVolume(-1);
        thisRadio.incVolume();
        expected = 1;
        actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void SetVolumeConst0() {
        Radio thisRadio = new Radio(0);
        int expected;
        int actual;
        thisRadio.setCurrentVolume(0);
        thisRadio.incVolume();
        expected = 1;
        actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void SetVolumeConst2() {
        Radio thisRadio = new Radio(0, 1);
        int expected;
        int actual;
        thisRadio.setCurrentVolume(0);
        thisRadio.incVolume();
        expected = 1;
        actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void SetChanel() {
        Radio thisRadio = new Radio();
        int expected;
        int actual;
        thisRadio.setChannelMax(2);
        thisRadio.incVolume();
        expected = 1;
        actual = thisRadio.getChannelMax();
        assertEquals(expected, actual);
    }

    @Test
    void SetChanel1() {
        Radio thisRadio = new Radio();
        int expected;
        int actual;
        thisRadio.setChannelMax(1);
        thisRadio.incVolume();
        expected = 1;
        actual = thisRadio.getChannelMax();
        assertEquals(expected, actual);
    }
}