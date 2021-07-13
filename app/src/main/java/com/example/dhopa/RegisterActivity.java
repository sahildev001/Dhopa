package com.example.dhopa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class RegisterActivity extends AppCompatActivity {
    Switch termsSwitch;
    TextView haveAnAccount;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        termsSwitch = findViewById(R.id.swichTerms);
        haveAnAccount = findViewById(R.id.haveAnAccount);
        register = findViewById(R.id.btnRegister);

        String switchText = "I accept the Dhopa Terms of use & \n Privacy Policy.";
        SpannableString ss = new SpannableString(switchText);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ss.setSpan(underlineSpan,19,51, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        termsSwitch.setText(ss);

        String Click = "Have an account? Sign In";
        SpannableString ss2 = new SpannableString(Click);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss2.setSpan(boldSpan, 17,24,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(RegisterActivity.this,LogIn.class);
                startActivity(intent);

            }
        };
        ss2.setSpan(clickableSpan,17,24,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        haveAnAccount.setText(ss2);
        haveAnAccount.setMovementMethod(LinkMovementMethod.getInstance());
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,VerificationActivity.class);
                startActivity(intent);
            }
        });
    }
}