package com.example.latihanrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Siswa implements Parcelable {
    private String nama;
    private String noAbsen;
    private int avatarResId;
    private String alamat;
    private String nisn;

    // Constructor
    public Siswa(String nama, String noAbsen, int avatarResId, String alamat, String nisn) {
        this.nama = nama;
        this.noAbsen = noAbsen;
        this.avatarResId = avatarResId;
        this.alamat = alamat;
        this.nisn = nisn;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getNoAbsen() {
        return noAbsen;
    }

    public int getAvatarResId() {
        return avatarResId;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNisn() {
        return nisn;
    }

    // Parcelable Implementation
    protected Siswa(Parcel in) {
        nama = in.readString();
        noAbsen = in.readString();
        avatarResId = in.readInt();
        alamat = in.readString();
        nisn = in.readString();
    }

    public static final Creator<Siswa> CREATOR = new Creator<Siswa>() {
        @Override
        public Siswa createFromParcel(Parcel in) {
            return new Siswa(in);
        }

        @Override
        public Siswa[] newArray(int size) {
            return new Siswa[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(noAbsen);
        dest.writeInt(avatarResId);
        dest.writeString(alamat);
        dest.writeString(nisn);
    }
}
