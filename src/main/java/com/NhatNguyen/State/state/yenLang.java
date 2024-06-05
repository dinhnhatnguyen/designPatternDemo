package com.NhatNguyen.State.state;

import com.NhatNguyen.State.Utils;

public class yenLang implements state{
    @Override
    public void onCalling() {
        System.out.printf("OnCalling: [\n");
        Utils.rung();
        System.out.printf("]\n");
    }

    @Override
    public void onSMSReceived() {
        System.out.println("On SMS received: [");
        System.out.println("]");
    }

    @Override
    public void onSystemNotification() {
        System.out.println("On System notification: [");
        System.out.println("]");
    }
}
