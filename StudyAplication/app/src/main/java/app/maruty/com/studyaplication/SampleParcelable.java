package app.maruty.com.studyaplication;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class SampleParcelable implements Parcelable{


    public String sampleParcelableVariable = "";
    public List<Hoge>sampleParcelableList = new ArrayList<>();


    //コンストラクタ
    protected SampleParcelable() {

    }

    //コンストラクタ
    protected SampleParcelable(String name, int age, String msg) {
        this.sampleParcelableVariable = msg;
        sampleParcelableList.add(new Hoge(name,age));
        sampleParcelableList.add(new Hoge(name,age+ 1));

    }

    //コンストラクタ
    protected SampleParcelable(Parcel in) {

        sampleParcelableVariable = in.readString();
        sampleParcelableList = in.createTypedArrayList(Hoge.CREATOR);

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
        dest.writeTypedList(sampleParcelableList);
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
