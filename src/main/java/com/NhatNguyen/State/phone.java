package com.NhatNguyen.State;

import com.NhatNguyen.State.state.state;

public class phone {
    private state state;

    public void onCalling() {
        this.state.onCalling();
    }

    public void onSMSReceived() {
        this.state.onSMSReceived();
    }

    public void onSystemNotification() {
        this.state.onSystemNotification();
    }

    public void setState(state state) {
        System.out.println("Using " + state.getClass().toString() + "state" );
        this.state = state;
    }
}
