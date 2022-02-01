package ru.netology;

public class Radio {
    //поля
    private int currentVolume=0;
    private int ch=0;

    //увеличение громкости
    public void increaseVolume() {
        if (currentVolume==10)
            currentVolume=currentVolume;
        else
        if (currentVolume < 10) {
             currentVolume++;
        }
    }
    //уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume==0)
            currentVolume=currentVolume;
        else
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
    //канал +
    public void next ()
    {

        ch++;
        if (ch > 9)
            ch = 0;
    }
    //канал -
    public void prev ()
    {
        ch--;
        if (ch < 0)
            ch = 9;
    }
    //установить канал
    public void setCh(int ch) {
        //0..9
        if ((ch>=0)&&(ch<=9))
        this.ch = ch;
        else
            this.ch=0;
    }

    public int getCh() {
        return ch;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if ((currentVolume>=0)&&(currentVolume<=10))
        this.currentVolume = currentVolume;
        else
            this.currentVolume=0;
    }
}



