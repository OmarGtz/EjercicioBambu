package com.ejercicios.omar.ejerciciobambu.activities;

import android.os.Bundle;
import android.os.ParcelUuid;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.ejercicios.omar.ejerciciobambu.adapters.ViewPageAdapter;
import com.ejercicios.omar.ejerciciobambu.R;

public class MainActivity extends AppCompatActivity {

    //Views
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;
    public static final int FRAGMENT_COMUNIDAD = 0;
    public static final int FRAGMENT_CALIFICADOS = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        setTabLayout();
        setViewPage();
        setListenerTabLayout(viewPager);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

    }

    //configuramos toolbar
    public void setToolbar(){
        toolbar= (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    //condiguraciones tabLayout
    public void setTabLayout(){
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_comunidad));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_calificados));
    }

    //configuramos viewPager
    public void setViewPage(){
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new ViewPageAdapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    //Listener tabLayour
    public void setListenerTabLayout(final ViewPager viewPager){
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }


    //inflamos el menu en la toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
