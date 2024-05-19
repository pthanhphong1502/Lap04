package com.example.lap04;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private ImageView ivUitLogo;
    private Button btnFadeInXml, btnFadeInCode, btnFadeOutXml, btnFadeOutCode;
    private Button btnBlinkXml, btnBlinkCode, btnZoomInXml, btnZoomInCode;
    private Button btnZoomOutXml, btnZoomOutCode, btnRotateXml, btnRotateCode;
    private Button btnMoveXml, btnMoveCode, btnSlideUpXml, btnSlideUpCode;
    private Button btnBounceXml, btnBounceCode, btnCombineXml, btnCombineCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivUitLogo = findViewById(R.id.ivUitLogo);

        ivUitLogo.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NewActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        btnFadeInXml = findViewById(R.id.btnFadeInXml);
        btnFadeInCode = findViewById(R.id.btnFadeInCode);
        btnFadeOutXml = findViewById(R.id.btnFadeOutXml);
        btnFadeOutCode = findViewById(R.id.btnFadeOutCode);
        btnBlinkXml = findViewById(R.id.btnBlinkXml);
        btnBlinkCode = findViewById(R.id.btnBlinkCode);
        btnZoomInXml = findViewById(R.id.btnZoomInXml);
        btnZoomInCode = findViewById(R.id.btnZoomInCode);
        btnZoomOutXml = findViewById(R.id.btnZoomOutXml);
        btnZoomOutCode = findViewById(R.id.btnZoomOutCode);
        btnRotateXml = findViewById(R.id.btnRotateXml);
        btnRotateCode = findViewById(R.id.btnRotateCode);
        btnMoveXml = findViewById(R.id.btnMoveXml);
        btnMoveCode = findViewById(R.id.btnMoveCode);
        btnSlideUpXml = findViewById(R.id.btnSlideUpXml);
        btnSlideUpCode = findViewById(R.id.btnSlideUpCode);
        btnBounceXml = findViewById(R.id.btnBounceXml);
        btnBounceCode = findViewById(R.id.btnBounceCode);
        btnCombineXml = findViewById(R.id.btnCombineXml);
        btnCombineCode = findViewById(R.id.btnCombineCode);

        btnFadeInXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_fade_in);
            ivUitLogo.startAnimation(animation);
        });

        btnFadeInCode.setOnClickListener(v -> {
            AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
            animation.setDuration(1000);
            ivUitLogo.startAnimation(animation);
        });

        btnFadeOutXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_fade_out);
            ivUitLogo.startAnimation(animation);
        });

        btnFadeOutCode.setOnClickListener(v -> {
            AlphaAnimation animation = new AlphaAnimation(1.0f, 0.0f);
            animation.setDuration(1000);
            ivUitLogo.startAnimation(animation);
        });

        btnBlinkXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_blink);
            ivUitLogo.startAnimation(animation);
        });

        btnBlinkCode.setOnClickListener(v -> {
            AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
            animation.setDuration(300);
            animation.setRepeatCount(Animation.INFINITE);
            animation.setRepeatMode(Animation.REVERSE);
            ivUitLogo.startAnimation(animation);
        });

        btnZoomInXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_zoom_in);
            ivUitLogo.startAnimation(animation);
        });

        btnZoomInCode.setOnClickListener(v -> {
            Animation animation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setDuration(1000);
            ivUitLogo.startAnimation(animation);
        });

        btnZoomOutXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_zoom_out);
            ivUitLogo.startAnimation(animation);
        });

        btnZoomOutCode.setOnClickListener(v -> {
            Animation animation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setDuration(1000);
            ivUitLogo.startAnimation(animation);
        });

        btnRotateXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate);
            ivUitLogo.startAnimation(animation);
        });

        btnRotateCode.setOnClickListener(v -> {
            Animation animation = new RotateAnimation(0, 360,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setDuration(1000);
            ivUitLogo.startAnimation(animation);
        });

        btnMoveXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_move);
            ivUitLogo.startAnimation(animation);
        });

        btnMoveCode.setOnClickListener(v -> {
            Animation animation = new TranslateAnimation(0, 75, 0, 75);
            animation.setDuration(1000);
            ivUitLogo.startAnimation(animation);
        });

        btnSlideUpXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_slide_up);
            ivUitLogo.startAnimation(animation);
        });

        btnSlideUpCode.setOnClickListener(v -> {
            Animation animation = new TranslateAnimation(0, 0, 100, 0);
            animation.setDuration(1000);
            ivUitLogo.startAnimation(animation);
        });

        btnBounceXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_bounce);
            ivUitLogo.startAnimation(animation);
        });

        btnBounceCode.setOnClickListener(v -> {
            Animation animation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setDuration(1000);
            animation.setInterpolator(new BounceInterpolator());
            ivUitLogo.startAnimation(animation);
        });

        btnCombineXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_combine);
            ivUitLogo.startAnimation(animation);
        });

        btnCombineCode.setOnClickListener(v -> {
            AnimationSet set = new AnimationSet(true);
            Animation scale = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            scale.setDuration(1000);
            Animation alpha = new AlphaAnimation(0.0f, 1.0f);
            alpha.setDuration(1000);
            set.addAnimation(scale);
            set.addAnimation(alpha);
            ivUitLogo.startAnimation(set);
        });
    }
}
