package com.NhatNguyen.State;

import com.NhatNguyen.State.state.chuan;
import com.NhatNguyen.State.state.yenLang;

public class main {
    public static void main(String[] args) {
        phone phone = new phone();

        phone.setState(new yenLang());
        phone.onCalling();
        phone.onSMSReceived();
        phone.onSystemNotification();
    }
}
