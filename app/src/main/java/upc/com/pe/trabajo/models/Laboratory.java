package upc.com.pe.trabajo.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by william on 21/05/15.
 */
public class Laboratory{

    private String laboratoryName;
    private int laboratoryId;
    private int laboratoryCapacity;

    public Laboratory(){

        laboratoryName="laboratory";
        laboratoryId=0;
        laboratoryCapacity=0;

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

    public int getLaboratoryCapacity() {
        return laboratoryCapacity;
    }

    public void setLaboratoryCapacity(int laboratoryCapacity) {
        this.laboratoryCapacity = laboratoryCapacity;
    }
}
