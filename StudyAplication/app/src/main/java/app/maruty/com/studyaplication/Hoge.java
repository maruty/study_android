package app.maruty.com.studyaplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 01008973 on 2017/01/20.
 */
public class Hoge implements Parcelable{
    public String member;
    public int age;

    Hoge(){

    }

    public Hoge(String name, int age) {
        this.member = name;
        this.age = age;
    }

    protected Hoge(Parcel in) {
        member = in.readString();
        age = in.readInt();
    }

    public static final Creator<Hoge> CREATOR = new Creator<Hoge>() {
        @Override
        public Hoge createFromParcel(Parcel in) {
            return new Hoge(in);
        }

        @Override
        public Hoge[] newArray(int size) {
            return new Hoge[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(member);
        dest.writeInt(age);
    }
}

