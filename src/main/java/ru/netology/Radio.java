package ru.netology;

public class Radio {
    //поля
    private int currentVolume = 0;
    private int channel = 0;
    private int channelMax;
    // придел по звуку
    private int volumeMax;


    ///пустой
    public Radio() {
        this.channelMax = 10 - 1;
        this.volumeMax = 10;
    }

    // конструктор с максимальным каналом
    public Radio(int maxChannel) {
        if (maxChannel >= 1) {
            this.channelMax = maxChannel - 1;
        } else {
            this.channelMax = 0;
        }
        this.volumeMax = 100;

    }

    // конструктор с максимальным каналом и  звуком
    public Radio(int maxChannel, int maxVolume) {
        if (maxChannel >= 1) {
            this.channelMax = maxChannel;
        } else {
            this.channelMax = 0;
        }
        if (maxVolume >= 2) {
            this.volumeMax = maxVolume;
        } else {
            this.volumeMax = 2;
        }
    }

    //увеличение громкости
    public void incVolume() {

        if (currentVolume < volumeMax) {
            currentVolume++;
        } else {
            currentVolume = volumeMax;
        }
    }

    //уменьшение громкости
    public void decVolume() {
        if (this.currentVolume == 0) {
            return;
        } else {
            this.currentVolume--;
        }

    }

    //канал +
    public void next() {

        channel++;
        if (channel > this.channelMax) {
            channel = 0;
        }
    }

    //канал -
    public void prev() {
        channel--;
        if (channel < 0) {
            channel = this.channelMax;
        }

    }

    //установить канал
    public void setChannel(int channel) {
        if (channel >= 0) {
            if (channel <= this.channelMax) {
                this.channel = channel;
            } else {
                this.channel = 0;
            }
        } else {
            this.channel = 0;
        }
    }

    public int getChannel() {
        return this.channel;
    }

    public int getChannelMax() {
        return this.channelMax;
    }

    public void setChannelMax(int maxChannel) {
        if (maxChannel >= 2) {
            this.channelMax = maxChannel - 1;
        } else {
            this.channelMax = 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volumeCurrent) {
        if (volumeCurrent >= 0) {
            if (volumeCurrent <= volumeMax) {
                this.currentVolume = volumeCurrent;
            } else {
                this.currentVolume = 0;
            }
        } else {
            this.currentVolume = 0;
        }

    }
}
