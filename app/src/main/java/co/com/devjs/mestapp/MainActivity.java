package co.com.devjs.mestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.com.devjs.mestapp.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void meste(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        this.startActivity(intent);
    }
}