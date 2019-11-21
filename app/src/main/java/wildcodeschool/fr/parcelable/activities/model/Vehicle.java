package wildcodeschool.fr.parcelable.activities.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle implements Parcelable {

    private String marque;
    private String km;

    public Vehicle(String marque, String km) {
        this.marque = marque;
        this.km = km;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public static Creator<Vehicle> getCREATOR() {
        return CREATOR;
    }

    protected Vehicle(Parcel in) {
        marque = in.readString();
        km = in.readString();
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(marque);
        dest.writeString(km);
    }
}