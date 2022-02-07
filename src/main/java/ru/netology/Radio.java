package ru.netology;

public class Radio {
    //поля
    private int currentvolume = 0;
    private int ch = 0;


    //увеличение громкости
    public void increasevolume() {

        if (currentvolume < 10) {
            currentvolume++;
        } else {
            currentvolume = 10;
        }
    }

    //уменьшение громкости
    public void decreasevolume() {
        if (this.currentvolume == 0) {
            return;
        } else {
            this.currentvolume--;
        }

    }

    //канал +
    public void next() {

        ch++;
        if (ch > 9) {
            ch = 0;
        }
    }

    //канал -
    public void prev() {
        ch--;
        if (ch < 0) {
            ch = 9;
        }

    }

    //установить канал
    public void setch(int ch) {
        if (ch >= 0) {
            if (ch <=9) {
                this.ch = ch;
            } else {
                this.ch = 0;
            }
        } else {
            this.ch = 0;
        }
    }

    public int getch() {
        return this.ch;
    }

    public int getcurrentvolume() {
        return currentvolume;
    }

    public void setcurrentvolume(int currentvolume) {
        if (currentvolume >= 0) {
            if (currentvolume <= 10) {
                this.currentvolume = currentvolume;
            } else {
                this.currentvolume = 0;
            }
        } else {
            this.currentvolume = 0;
        }


    }
}



