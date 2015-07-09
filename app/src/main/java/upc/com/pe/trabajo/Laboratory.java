package upc.com.pe.trabajo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by william on 21/05/15.
 */
public class Laboratory implements Parcelable{

    //-------- datos de bd
    private String laboratoryName;
    private int laboratoryId;
    //--------

    Computer computers[];
    private int computersQuantity;

    public Laboratory(){

        //--bd
        laboratoryName="laboratory";
        laboratoryId=1;
        //--

        computersQuantity=20;
        //creating computers
        computers = new Computer[computersQuantity];
        for(int i=0; i<computersQuantity; i++){
            computers[i]=new Computer();
            computers[i].setcomputerName(computers[i].getcomputerName()+" "+i);
            computers[i].setRamMemory("Kingstom 8gb");
            computers[i].setProcessor("intel");
            computers[i].setHardDisk("toshiba 2TB");
            computers[i].setNetworkCard("DLink");
            computers[i].setMotherboard("intel s780");
            computers[i].setVideoAdapter("NVIDIA 4GB");
            computers[i].setCdDrives("CD Reader");
            computers[i].setSoundDevice("Atheros");
            computers[i].setKeyboard("Logitech K587");
            computers[i].setMouse("Logitech M352");
            computers[i].setPrinter("HP P850");
            computers[i].setMonitor("HP M750");
        }
    }

    public Laboratory(Parcel in){
        //--bd
        laboratoryName="laboratory";
        laboratoryId=1;
        //--
        computersQuantity=20;
        computers = new Computer[computersQuantity];
        readFromParcel(in);
    }

    public String getLaboratoryName() {
        return laboratoryName;
    }

    public void setLaboratoryName(String laboratoryName) {
        this.laboratoryName = laboratoryName;
    }

    public int getLaboratoryId() {
        return laboratoryId;
    }

    public void setLaboratoryId(int laboratoryId) {
        this.laboratoryId = laboratoryId;
    }

    public int getComputersQuantity() {
        return computersQuantity;
    }

    public void setComputersQuantity(int computersQuantity) {
        this.computersQuantity = computersQuantity;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public Computer getComputerInPosition(int position){
        if(position>0 && position<computersQuantity)
            return computers[position];
        else
            return null;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        //--bd
        dest.writeString(laboratoryName);
        dest.writeInt(laboratoryId);
        //--

        dest.writeTypedArray(computers, flags);
    }

    private void readFromParcel(Parcel in) {

        //--bd
        laboratoryName = in.readString();
        laboratoryId = in.readInt();
        //--

        in.readTypedArray(computers, CREATORCOMPUTER);
        for(int i=0; i<computersQuantity; i++){
            computers[i]=new Computer();
            computers[i].setcomputerName(computers[i].getcomputerName()+" "+i);
        }
    }

    public static final Parcelable.Creator<Laboratory> CREATOR= new Parcelable.Creator<Laboratory>() {
        public Laboratory createFromParcel(Parcel in) {
            return new Laboratory(in);
        }

        public Laboratory[] newArray(int size) {
            return new Laboratory[size];
        }
    };

    public Parcelable.Creator<Computer> CREATORCOMPUTER= new Parcelable.Creator<Computer>() {
        public Computer createFromParcel(Parcel in) {
            return new Computer(in);
        }

        public Computer[] newArray(int size) {
            return new Computer[size];
        }
    };


}
