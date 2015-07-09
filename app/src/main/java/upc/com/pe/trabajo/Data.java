package upc.com.pe.trabajo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by william on 21/05/15.
 */
public class Data implements Parcelable{

    String laboratories[][] = new String[10][5];

    public void data(){
        for(int i=0; i<10; i++){
            for(int j=0; j<5; j++){
                laboratories[i][j]="L"+i+"C"+j;
            }
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
