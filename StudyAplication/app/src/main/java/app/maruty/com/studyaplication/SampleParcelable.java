package app.maruty.com.studyaplication;


import android.os.Parcel;
import android.os.Parcelable;

public class SampleParcelable implements Parcelable{


    public String sampleParcelableVariable = "unko";


    //コンストラクタ
    protected SampleParcelable() {

    }

    //コンストラクタ
    protected SampleParcelable(Parcel in) {
        sampleParcelableVariable = in.readString();
    }

    //Interfaceの実装
    @Override
    public int describeContents() {
        return 0;
    }

    //Interfaceの実装
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(sampleParcelableVariable);
    }

    //Interfaceの実装
    public static final Creator<SampleParcelable> CREATOR = new Creator<SampleParcelable>() {
        @Override
        public SampleParcelable createFromParcel(Parcel in) {
            return new SampleParcelable(in);
        }

        @Override
        public SampleParcelable[] newArray(int size) {
            return new SampleParcelable[size];
        }
    };
}
