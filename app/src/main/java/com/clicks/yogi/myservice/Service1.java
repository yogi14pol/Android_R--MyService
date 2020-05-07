package com.clicks.yogi.myservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class Service1 extends Service {

    MediaPlayer mp;

    public Service1() {
        // Empty Constructor...
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"Service Created", Toast.LENGTH_SHORT).show();
        mp = MediaPlayer.create(this,R.raw.sherlock);
        mp.setLooping(false);
        mp.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //return super.onStartCommand(intent, flags, startId);
        Toast.makeText(this, "Service is Running", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        mp.stop();
        Toast.makeText(this,"Service Destroyed", Toast.LENGTH_SHORT).show();
    }
}