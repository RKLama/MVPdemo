package com.techcetro.mvpdemo;

/**
 * Created by RK LAMA on 10/12/2017.
 */

public interface MainMVP {
    interface view {
        void displayToastMessage(User user);
    }

    interface presenter {
        void clickedToastButton();
    }
}
