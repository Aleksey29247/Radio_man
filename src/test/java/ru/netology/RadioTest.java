package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test //если значение 0 ++
    void increaseVolume0() {
        Radio thisRadio=new Radio();
        thisRadio.increaseVolume();
        int expected =1;
        int actual = thisRadio.getCurrentVolume();
                assertEquals(expected, actual);
    }
    @Test //если значение 10 ++
    void increaseVolume10() {
        Radio thisRadio=new Radio();
        thisRadio.setCurrentVolume(10);
        int expected =10;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test //0--
    void decreaseVolume0() {
        Radio thisRadio=new Radio();
        thisRadio.decreaseVolume();
        int expected =0;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test //любое значение --
    void decreaseVolume2() {
        Radio thisRadio=new Radio();
        thisRadio.setCurrentVolume(3);
        thisRadio.decreaseVolume();
        int expected =2;
        int actual = thisRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test //канал ++
    void chNext() {
        Radio thisRadio=new Radio();//0+1
        thisRadio.next();
        int expected =1;
        int actual = thisRadio.getCh();;
        assertEquals(expected, actual);
    }
    @Test //канал ---
    void chPrev() {
        Radio thisRadio=new Radio();
        thisRadio.prev();
        int expected =9;
        int actual = thisRadio.getCh();;
        assertEquals(expected, actual);
    }
    @Test //канал установить
    void Setch() {
        Radio thisRadio=new Radio();
        thisRadio.setCh(8); //ср=8
        thisRadio.next();//ср++
        int expected =9;
        int actual = thisRadio.getCh();//ср=9
        assertEquals(expected, actual);
    }
}