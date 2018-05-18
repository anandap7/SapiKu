package com.project.xavier.sapiku.Adapter;

/**
 * Created by a_pri on 5/18/2018.
 */

public class Peternak {
    private String mGambar, mNama, mUmur, mHarga;

    public Peternak(String mGambar, String mNama, String mUmur, String mHarga) {
        this.mGambar = mGambar;
        this.mNama = mNama;
        this.mUmur = mUmur;
        this.mHarga = mHarga;
    }

    public Peternak(String mNama, String mUmur, String mHarga) {
        this.mNama = mNama;
        this.mUmur = mUmur;
        this.mHarga = mHarga;
    }

    public String getmGambar() {
        return mGambar;
    }

    public String getmNama() {
        return mNama;
    }

    public String getmUmur() {
        return mUmur;
    }

    public String getmHarga() {
        return mHarga;
    }
}
