package BaiThucHanh_Tuan2_HuongDoiTuong;
import java.util.Scanner;

public class Television {
    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private boolean powerOn= false;
    private int channel= 2;
    public static int volume= 20;

    public String getManufacturer() {
        return MANUFACTURER;
    }

    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public int getVolume() {
        return volume;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
// t?o constructor ?? lát vào main kh?i t?o ??i t??ng
    public Television(String MANUFACTURER, int SCREEN_SIZE) {
        this.MANUFACTURER=MANUFACTURER;
        this.SCREEN_SIZE= SCREEN_SIZE;
    }

    public void power(){
        if(!powerOn)
            powerOn=!powerOn;
        else
            powerOn=!powerOn;
        System.out.println(powerOn);
    }

    public void increaseVolume(){
        volume++;
//        System.out.println("Increase Volume is: "+volume);
    }

    public void decreaseVolume(){
        volume--;
    }
}