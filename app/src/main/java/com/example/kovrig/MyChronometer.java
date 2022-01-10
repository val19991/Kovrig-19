package com.example.kovrig;

import static android.content.ContentValues.TAG;

import android.os.CountDownTimer;
import android.util.Log;

import androidx.constraintlayout.widget.StateSet;

public class MyChronometer extends CountDownTimer {


    private String s;

    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public MyChronometer(long millisInFuture, long countDownInterval, String s) {
        super(millisInFuture, countDownInterval);
        this.s=s;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        //Log.d(TAG, "seconds remaining: " + millisUntilFinished / 1000);
        Log.d(StateSet.TAG, "trece " + this.s);
    }

    @Override
    public void onFinish() {
        //Log.d(TAG, "done!");
        Log.d(StateSet.TAG, "done " + this.s);
    }

}
