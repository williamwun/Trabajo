package upc.com.pe.trabajo.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by william on 21/05/15.
 */
public class Computer implements Parcelable{

    private String computerName, ramMemory, processor, hardDisk, networkCard, motherboard, videoAdapter, cdDrives, soundDevice, keyboard, mouse, printer, monitor;

    public Computer(){
        computerName = "computer";
        Component component = new Component();
        ramMemory = component.getRamMemory(1);
        processor = component.getProcessor(1);
        hardDisk = component.getHardDisk(1);
        networkCard = component.getNetworkCard(1);
        motherboard = component.getMotherboard(1);
        videoAdapter = component.getVideoAdapter(1);
        cdDrives = component.getCdDrives(1);
        soundDevice = component.getSoundDevice(1);
        keyboard = component.getKeyboard(1);
        mouse = component.getMouse(1);
        printer = component.getPrinter(1);
        monitor = component.getMonitor(1);
    }

    public Computer(Parcel in){
        computerName = "computer";
        Component component = new Component();
        ramMemory = component.getRamMemory(1);
        processor = component.getProcessor(1);
        hardDisk = component.getHardDisk(1);
        networkCard = component.getNetworkCard(1);
        motherboard = component.getMotherboard(1);
        videoAdapter = component.getVideoAdapter(1);
        cdDrives = component.getCdDrives(1);
        soundDevice = component.getSoundDevice(1);
        keyboard = component.getKeyboard(1);
        mouse = component.getMouse(1);
        printer = component.getPrinter(1);
        monitor = component.getMonitor(1);
        readFromParcel(in);
    }

    public String getcomputerName() {
        return computerName;
    }

    public void setcomputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getNetworkCard() {
        return networkCard;
    }

    public void setNetworkCard(String networkCard) {
        this.networkCard = networkCard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getVideoAdapter() {
        return videoAdapter;
    }

    public void setVideoAdapter(String videoAdapter) {
        this.videoAdapter = videoAdapter;
    }

    public String getCdDrives() {
        return cdDrives;
    }

    public void setCdDrives(String cdDrives) {
        this.cdDrives = cdDrives;
    }

    public String getSoundDevice() {
        return soundDevice;
    }

    public void setSoundDevice(String soundDevice) {
        this.soundDevice = soundDevice;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.computerName);
        dest.writeString(this.ramMemory);
        dest.writeString(this.processor);
        dest.writeString(this.hardDisk);
        dest.writeString(this.networkCard);
        dest.writeString(this.motherboard);
        dest.writeString(this.videoAdapter);
        dest.writeString(this.cdDrives);
        dest.writeString(this.soundDevice);
        dest.writeString(this.keyboard);
        dest.writeString(this.mouse);
        dest.writeString(this.printer);
        dest.writeString(this.monitor);
    }

    public void readFromParcel(Parcel in) {
        computerName=in.readString();
        ramMemory=in.readString();
        processor=in.readString();
        hardDisk=in.readString();
        networkCard=in.readString();
        motherboard=in.readString();
        videoAdapter=in.readString();
        cdDrives=in.readString();
        soundDevice=in.readString();
        keyboard=in.readString();
        mouse=in.readString();
        printer=in.readString();
        monitor=in.readString();
    }
    public static final Parcelable.Creator<Computer> CREATOR= new Parcelable.Creator<Computer>() {
        public Computer createFromParcel(Parcel in) {
            return new Computer(in);
        }

        public Computer[] newArray(int size) {
            return new Computer[size];
        }
    };
}
