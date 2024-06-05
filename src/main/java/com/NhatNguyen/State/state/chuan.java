package com.NhatNguyen.State.state;

import com.NhatNguyen.State.Utils;

public class chuan implements state {

    @Override
    public void onCalling() {
        System.out.printf("OnCalling: [\n");
        Utils.rung();
        Utils.phátÂmThanh(80, 3);
        System.out.printf("]\n");
    }

    @Override
    public void onSMSReceived() {
        System.out.println("On SMS received: [");
        Utils.phátÂmThanh(60, 1);
        System.out.println("]");
    }

    @Override
    public void onSystemNotification() {
        System.out.println("On System notification: [");
        Utils.phátÂmThanh(50, 1);
        System.out.println("]");
    }
}
