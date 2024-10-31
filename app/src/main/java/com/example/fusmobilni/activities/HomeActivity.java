package com.example.fusmobilni.activities;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fusmobilni.R;
import com.example.fusmobilni.databinding.ActivityHomeBinding;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding _binding;
    private AppBarConfiguration _appBarConfiguration;
    private DrawerLayout _drawer;
    private NavigationView _navigationView;
    private NavController _navController;
    private Toolbar _toolbar;
    private ActionBar _actionBar;
    private ActionBarDrawerToggle _actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        _binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(_binding.getRoot());

        _drawer = _binding.drawerLayout;
        _navigationView = _binding.navView;
        _toolbar = _binding.activityHomeBase.topAppBar;

        _actionBar = getSupportActionBar();

        if (_actionBar != null) {
            _actionBar.setDisplayHomeAsUpEnabled(false);
            _actionBar.setHomeAsUpIndicator(R.drawable.ic_hamburger);
            _actionBar.setHomeButtonEnabled(false);
        }
        _actionBarDrawerToggle = new ActionBarDrawerToggle(this, _drawer, _toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        _drawer.addDrawerListener(_actionBarDrawerToggle);
        _actionBarDrawerToggle.syncState();


    }
}