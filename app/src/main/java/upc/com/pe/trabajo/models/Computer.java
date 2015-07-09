package upc.com.pe.trabajo.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by william on 21/05/15.
 */
public class Computer{

    private int computerId;
    private String computerName;
    private String computerSerie;
    private String computerDescription;

    public Computer(){
        computerId = 0;
        computerName = "computer";
        computerSerie = "0";
        computerDescription = "no existe descripcion";
    }

    public String getcomputerName() {
        return computerName;
    }

    public void setcomputerName(String computerName) {
        this.computerName = computerName;
    }

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getComputerSerie() {
        return computerSerie;
    }

    public void setComputerSerie(String computerSerie) {
        this.computerSerie = computerSerie;
    }

    public String getComputerDescription() {
        return computerDescription;
    }

    public void setComputerDescription(String computerDescription) {
        this.computerDescription = computerDescription;
    }
}
