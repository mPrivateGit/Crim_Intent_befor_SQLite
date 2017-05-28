package com.example.aprivate.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        this(UUID.randomUUID());
    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }
    public String getmTitle() {
        return mTitle;
    }
    public void setmTitle(String title) {
        mTitle = title;
    }
    public Date getmDate() {
        mDate();
        return mDate;
    }
    public void setmDate(Date date) {
        mDate = date;
    }
    public boolean ismSolved() {
        return mSolved;
    }
    public void setmSolved(boolean solved) {
        mSolved = solved;
    }

    String mDate() {
        String p = "EE, MMM dd, yyyy";
        SimpleDateFormat s = new SimpleDateFormat(p);

        String date = s.format(mDate);
        return date;
    }
}
