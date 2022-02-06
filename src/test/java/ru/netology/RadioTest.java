package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
        //если значение 0 ++
    void increaseVolume0() {
        Radio thisRadio = new Radio();
        thisRadio.increasevolume();
        int expected = 1;
        int actual = thisRadio.getcurrentvolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume10() {
        Radio thisRadio = new Radio();
        thisRadio.setcurrentvolume(10);
        thisRadio.increasevolume();
        int expected = 10;
        int actual = thisRadio.getcurrentvolume();
        assertEquals(expected, actual);
    }

    @Test
        //0--
    void decreaseVolume0() {
        Radio thisRadio = new Radio();
        thisRadio.decreasevolume();
        int expected = 0;
        int actual = thisRadio.getcurrentvolume();
        assertEquals(expected, actual);
    }

    @Test
        //любое значение --
    void decreaseVolume2() {
        Radio thisRadio = new Radio();
        thisRadio.setcurrentvolume(3);
        thisRadio.decreasevolume();
        int expected = 2;
        int actual = thisRadio.getcurrentvolume();
        assertEquals(expected, actual);
    }

    @Test
        //канал ++
    void chNext() {
        Radio thisRadio = new Radio();
        thisRadio.next();
        int expected = 1;
        int actual = thisRadio.getch();

        assertEquals(expected, actual);
    }

    @Test
        //канал ++
    void chNext10() {
        Radio thisRadio = new Radio();
        thisRadio.setch(9);
        thisRadio.next();
        int expected = 0;
        int actual = thisRadio.getch();

        assertEquals(expected, actual);
    }

    @Test
        //канал ---
    void chPrev() {
        Radio thisRadio = new Radio();
        thisRadio.prev();
        int expected = 9;
        int actual = thisRadio.getch();
        assertEquals(expected, actual);
    }

    @Test
    void chPrev0() {
        Radio thisRadio = new Radio();
        thisRadio.setch(1);
        thisRadio.prev();
        int expected = 0;
        int actual = thisRadio.getch();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void Setch() {
        Radio thisRadio = new Radio();
        thisRadio.setch(8);
        thisRadio.next();
        int expected = 9;
        int actual = thisRadio.getch();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void Setch12() {
        Radio thisRadio = new Radio();
        thisRadio.setch(10);
        thisRadio.next();
        int expected = 1;
        int actual = thisRadio.getch();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void setchA() {
        Radio thisRadio = new Radio();
        thisRadio.setch(-1);
        thisRadio.next();
        int expected = 1;
        int actual = thisRadio.getch();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void SetVolume11() {
        Radio thisRadio = new Radio();
        thisRadio.setcurrentvolume(11);
        thisRadio.increasevolume();
        int expected = 1;
        int actual = thisRadio.getcurrentvolume();
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void SetVolumeA() {
        Radio thisRadio = new Radio();
        int expected;
        int actual;
        thisRadio.setcurrentvolume(-1);
        thisRadio.increasevolume();
        expected = 1;
        actual = thisRadio.getcurrentvolume();
        assertEquals(expected, actual);
    }
}