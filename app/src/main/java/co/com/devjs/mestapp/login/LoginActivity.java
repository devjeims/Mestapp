package co.com.devjs.mestapp.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import co.com.devjs.mestapp.ChatActivity;
import co.com.devjs.mestapp.ChatListActivity;
import co.com.devjs.mestapp.R;
import co.com.devjs.mestapp.chat.ChatListFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void goToSingup(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        this.startActivity(intent);
        finish();
    }
    public void goToChatList(View view){
        Intent intent = new Intent(this, ChatListActivity.class);
        this.startActivity(intent);
        finish();
    }

}