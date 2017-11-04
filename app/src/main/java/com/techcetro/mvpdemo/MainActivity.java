package com.techcetro.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainMVP.view {
    private Button toastClick;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
        toastClick = (Button) findViewById(R.id.toastClick);
        toastClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.clickedToastButton();
            }
        });
    }

    @Override
    public void displayToastMessage(User user) {
        Toast.makeText(this, "Hello there " + user.getName(), Toast.LENGTH_SHORT).show();
    }
}
