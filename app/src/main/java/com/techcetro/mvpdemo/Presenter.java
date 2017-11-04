package com.techcetro.mvpdemo;

/**
 * Created by RK LAMA on 10/12/2017.
 */

public class Presenter implements MainMVP.presenter {

    private final MainMVP.view view;

    public Presenter(MainMVP.view view) {
        this.view = view;
    }

    @Override
    public void clickedToastButton() {
        User user = new User("Male", 25, "Bikash");
        view.displayToastMessage(user);
    }
}
