package com.project.xavier.sapiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.project.xavier.sapiku.AdapterPeternak.mHistory;
import com.project.xavier.sapiku.AdapterPeternak.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private TextView mTextMessage, id_sapi;
    private List<mHistory> mMPeternak = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter adapter;
    private mHistory mPeternak;
    private Button go_detail;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent = null;
            switch (item.getItemId()) {
                case R.id.list:
                    intent = new Intent(getApplicationContext(), Home.class);
                    startActivity(intent);
                    return true;
                case R.id.near:

                    return true;
                case R.id.filter:
                    intent = new Intent(getApplicationContext(), Filter.class);
                    startActivity(intent);
                    return true;
                case R.id.history:
                    return true;
                case R.id.profile:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_home);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        recyclerView = findViewById(R.id.content_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        mMPeternak.add(new mHistory("34few3q4","PT. Sembarang", "50 Tahun", "Rp.1000000"));
        mMPeternak.add(new mHistory("3q4mdpwf","PT. ngarambes", "10 Tahun", "Rp.5000000"));

        adapter = new Adapter(this, mMPeternak);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

}
