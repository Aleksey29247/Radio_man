package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
        //если значение 0 ++
    void increaseVolume0() {
        Radio thisRadio = new Radio();
        thisRadio.increaseVolume();
        int expected = 1;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //если значение 10
    void increaseVolume10() {
        Radio thisRadio = new Radio();
        thisRadio.setCurrentVolume(10);
        int expected = 10;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //0--
    void decreaseVolume0() {
        Radio thisRadio = new Radio();
        thisRadio.decreaseVolume();
        int expected = 0;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //любое значение --
    void decreaseVolume2() {
        Radio thisRadio = new Radio();
        thisRadio.setCurrentVolume(3);
        thisRadio.decreaseVolume();
        int expected = 2;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //канал ++
    void chNext() {
        Radio thisRadio = new Radio();//0+1
        thisRadio.next();
        int expected = 1;
        int actual = thisRadio.getCh();
        ;
        assertEquals(expected, actual);
    }

    @Test
        //канал ++
    void chNext10() {
        Radio thisRadio = new Radio();//0+1
        thisRadio.setCh(9);
        thisRadio.next();
        int expected = 0;
        int actual = thisRadio.getCh();
        ;
        assertEquals(expected, actual);
    }

    @Test
        //канал ---
    void chPrev() {
        Radio thisRadio = new Radio();
        thisRadio.prev();
        int expected = 9;
        int actual = thisRadio.getCh();
        assertEquals(expected, actual);
    }

    @Test
    void chPrev0() {
        Radio thisRadio = new Radio();
        thisRadio.setCh(1);
        thisRadio.prev();
        int expected = 0;
        int actual = thisRadio.getCh();
        ;
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void Setch() {
        Radio thisRadio = new Radio();
        thisRadio.setCh(8); //ср=8
        thisRadio.next();//ср++
        int expected = 9;
        int actual = thisRadio.getCh();//ср=9
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void Setch12() {
        Radio thisRadio = new Radio();
        thisRadio.setCh(10); //ср=8
        thisRadio.next();//ср++
        int expected = 1;
        int actual = thisRadio.getCh();//ср=9
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void SetVolume11() {
        Radio thisRadio = new Radio();
        thisRadio.setCurrentVolume(11); //0
        thisRadio.increaseVolume();//1
        int expected = 1;
        int actual = thisRadio.getCurrentVolume();//1
        assertEquals(expected, actual);
    }

    @Test
        //канал установить
    void SetVolumeForAll() {
        Radio thisRadio = new Radio();
        int[] anr = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 1};
        int count = 0;
        int expected;
        int actual;
        for (int a = -1; a == 13; a++) {
            thisRadio.setCurrentVolume(a);
            thisRadio.increaseVolume();
            expected = anr[count];
            actual = thisRadio.getCurrentVolume();
            assertEquals(expected, actual);
            count++;
        }


    }
}