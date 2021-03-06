package com.nowmagnate.seeker_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nowmagnate.seeker_ui.util.GradientStatusBar;

public class EarnCoins extends AppCompatActivity {

    private CardView doTaskCard;
    private ImageView toolbarBack;
    private TextView toolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn_coins);

        doTaskCard = findViewById(R.id.do_task_card);
        toolbarBack = findViewById(R.id.back);
        toolbarTitle = findViewById(R.id.title);

        GradientStatusBar.setStatusBarGradiant(this);

        toolbarTitle.setText("EARN COINS");
        toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        doTaskCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doTaskCard.setClickable(false);
                startActivity(new Intent(EarnCoins.this,Task.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        doTaskCard.setClickable(true);
    }
}
