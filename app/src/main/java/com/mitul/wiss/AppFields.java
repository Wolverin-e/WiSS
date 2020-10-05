package com.mitul.wiss;

import android.app.Activity;
import android.widget.TextView;

public class AppFields {

    public TextView ssid;
    public TextView mac;
    public TextView linkSpeed;
    public TextView frequency;
    public TextView bssid;
    public TextView signalScore;
    public TextView rssi;

    public AppFields(Activity activity){
        ssid = activity.findViewById(R.id.ssid_text);
        mac = activity.findViewById(R.id.mac_text);
        linkSpeed = activity.findViewById(R.id.linkspeed_text);
        frequency = activity.findViewById(R.id.frequency_text);
        bssid = activity.findViewById(R.id.bssid_text);
        signalScore = activity.findViewById(R.id.score_text);
        rssi = activity.findViewById(R.id.rssi_text);
    }
}
