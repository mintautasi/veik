package com.example.pirmasdublis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.pirmasdublis.R.color.pink;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    public void onBtnChangeTextClick(View view) {
        this.tvMain.setText("Text was changed");
       // this.tvMain.setTextColor(pink);
        tvMain.setTextColor(this.getResources().getColor(R.color.pink));
    }
}
