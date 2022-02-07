package ru.netology;

public class Radio {
    //поля
    private int currentvolume = 0;
    private int ch = 0;
    private  int chmax;
    // придел по звуку
    private  int volumemax;

    public Radio() {
        this.chmax=10-1;
        this.volumemax=10;
    }

    public Radio(int cmax){
        this.chmax=cmax-1;
        this.volumemax=100;
    }

    public Radio(int cmax, int volmax)
    {
        this.chmax=cmax-1;
        this.volumemax=volmax;
    }
    //увеличение громкости
    public void increasevolume() {

        if (currentvolume < volumemax) {
            currentvolume++;
        } else {
            currentvolume = volumemax;
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
        if (ch > this.chmax) {
            ch = 0;
        }
    }

    //канал -
    public void prev() {
        ch--;
        if (ch < 0) {
            ch = this.chmax;
        }

    }

    //установить канал
    public void setch(int ch) {
        if (ch >= 0) {
            if (ch <= this.chmax) {
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
 public  int getChmax()
 {
     return this.chmax;
 }
 public void setChmax(int cmax)
 {
   this.chmax=cmax;
 }
    public int getcurrentvolume() {
        return currentvolume;
    }

    public void setcurrentvolume(int currentvolume) {
        if (currentvolume >= 0) {
            if (currentvolume <= volumemax) {
                this.currentvolume = currentvolume;
            } else {
                this.currentvolume = 0;
            }
        } else {
            this.currentvolume = 0;
        }

    }
}



