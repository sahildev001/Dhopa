package com.example.dhopa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.dhopa.Fragments.CartFragment;
import com.example.dhopa.Fragments.ChatFragment;
import com.example.dhopa.Fragments.HelpFragment;
import com.example.dhopa.Fragments.LiveTrackingFragment;
import com.example.dhopa.Fragments.MyOrderFragment;
import com.example.dhopa.Fragments.MyWalletFragment;
import com.example.dhopa.Fragments.PaymentHistoryFragment;
import com.example.dhopa.Fragments.PostcodeChooseYourOPotion;
import com.example.dhopa.Fragments.ProfileFragment;
import com.example.dhopa.Fragments.ProgressFragment;
import com.example.dhopa.Fragments.TermsFragment;
import com.example.dhopa.Fragments.FragmentHome;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout;
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle;

public class BottomNavActivity extends AppCompatActivity implements View.OnClickListener {
    private DuoDrawerLayout drawerLayout;
   Toolbar toolbar;
    BottomNavigationView navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        for (Fragment fragment : getSupportFragmentManager().getFragments()) {
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new FragmentHome()).addToBackStack(null).commit();


        drawerLayout = (DuoDrawerLayout) findViewById(R.id.drawer);
        DuoDrawerToggle drawerToggle = new DuoDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();

        View contentView = drawerLayout.getContentView();
        View menuView = drawerLayout.getMenuView();
        LinearLayout ll_Myorder = menuView.findViewById(R.id.ll_Myorder);
        LinearLayout ll_Cart = menuView.findViewById(R.id.ll_Cart);
        LinearLayout ll_Wallet = menuView.findViewById(R.id.ll_Wallet);
        LinearLayout ll_LiveTracking = menuView.findViewById(R.id.ll_LiveTracking);
        LinearLayout ll_Chat = menuView.findViewById(R.id.ll_Chat);
        LinearLayout ll_Terms = menuView.findViewById(R.id.ll_TermsConditions);
        LinearLayout ll_Help = menuView.findViewById(R.id.ll_Help);
        LinearLayout ll_PaymentHistory = menuView.findViewById(R.id.ll_PaymentHistory);
        LinearLayout ll_Logout = menuView.findViewById(R.id.ll_Logout);

        ll_Myorder.setOnClickListener(this);
        ll_Cart.setOnClickListener(this);
        ll_Wallet.setOnClickListener(this);
        ll_LiveTracking.setOnClickListener(this);
        ll_Chat.setOnClickListener(this);
        ll_Terms.setOnClickListener(this);
        ll_Help.setOnClickListener(this);
        ll_PaymentHistory.setOnClickListener(this);
        ll_Logout.setOnClickListener(this);


        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new FragmentHome()).commit();

        navigation = findViewById(R.id.BottomNevigation);
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_Myorder:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                getSupportActionBar().hide();
                navigation.setVisibility(View.GONE);

                getSupportFragmentManager().beginTransaction().replace(R.id.frame,new MyOrderFragment()).commit();
                Toast.makeText(this, "MyOrder", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ll_Cart:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,new CartFragment()).commit();
                navigation.setVisibility(View.GONE);
                getSupportActionBar().hide();

                Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ll_Wallet:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                navigation.setVisibility(View.GONE);
                getSupportActionBar().hide();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,new MyWalletFragment()).commit();

                Toast.makeText(this, "Wallet", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ll_LiveTracking:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                navigation.setVisibility(View.GONE);
                getSupportActionBar().hide();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,new LiveTrackingFragment()).commit();
                Toast.makeText(this, "LiveTracking", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_Chat:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                navigation.setVisibility(View.GONE);
                getSupportActionBar().hide();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,new ChatFragment()).commit();
                Toast.makeText(this, "Chat", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_TermsConditions:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                getSupportActionBar().hide();
                navigation.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,new TermsFragment()).commit();
                Toast.makeText(this, "TermsConditions", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_Help:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                navigation.setVisibility(View.GONE);
                getSupportActionBar().hide();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HelpFragment()).commit();
                Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_PaymentHistory:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                navigation.setVisibility(View.GONE);
                getSupportActionBar().hide();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,new PaymentHistoryFragment()).commit();
                Toast.makeText(this, "PaymentHistory", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_Logout:
                Toast.makeText(this, "Logout...", Toast.LENGTH_SHORT).show();
                break;

        }
        drawerLayout.closeDrawer();
    }
    BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){

                case R.id.Menuhome:
                    if(navigation.getVisibility()== View.GONE){
                    navigation.setVisibility(View.VISIBLE);}
                    Toast.makeText(BottomNavActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(BottomNavActivity.this,BottomNavActivity.class);
                    startActivity(in);
                    return true;


                case R.id.Menupostcode:
                    Toast.makeText(BottomNavActivity.this, "Location", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new PostcodeChooseYourOPotion()).addToBackStack(null).commit();
                        getSupportActionBar().hide();
                    if(navigation.getVisibility()== View.GONE){
                        navigation.setVisibility(View.VISIBLE);}
                        toolbar.setVisibility(View.GONE);
                    return true;
                case R.id.Menubookings:
                    Toast.makeText(BottomNavActivity.this, "Booking", Toast.LENGTH_SHORT).show();
                    if(navigation.getVisibility()== View.GONE){
                        navigation.setVisibility(View.VISIBLE);}
                    getSupportActionBar().hide();

                    return true;
                case R.id.Menuoffers:
                    Toast.makeText(BottomNavActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                    if(navigation.getVisibility()== View.GONE){
                        navigation.setVisibility(View.VISIBLE);}
                    getSupportActionBar().hide();
                    return true;
                case R.id.Menuprofile:
                    Toast.makeText(BottomNavActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                    if(navigation.getVisibility()== View.GONE){
                        navigation.setVisibility(View.VISIBLE);}
                    getSupportActionBar().hide();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,new ProfileFragment()).commit();

                    return true;


            }

            return false;

        }
    };
}