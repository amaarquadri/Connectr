package com.gmail.amaarquadri.beast.connectr.ui;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.google.android.gms.location.FusedLocationProviderClient;

/**
 * Created by amaar on 2018-01-27.
 */

public class UpdateLocationService extends Service {
    //private FusedLocationProviderClient mFusedLocationClient

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }



    private Location getLocation() {
        return null;
    }
}
