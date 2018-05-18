package com.project.xavier.sapiku;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import com.project.xavier.sapiku.Adapter.Peternak;
import com.project.xavier.sapiku.Adapter.PeternakAdapter;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private TextView mTextMessage;
    private List<Peternak> mPeternak = new ArrayList<>();
    private RecyclerView recyclerView;
    private PeternakAdapter peternakAdapter;
    private Peternak peternak;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.list:
                    return true;
                case R.id.near:
                    return true;
                case R.id.filter:
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
        setContentView(R.layout.activity_home);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        recyclerView = findViewById(R.id.content_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        mPeternak.add(new Peternak("PT. Sembarang", "50 Tahun", "Rp.1000000"));
        mPeternak.add(new Peternak("PT. Sembarang", "50 Tahun", "Rp.1000000"));

        peternakAdapter = new PeternakAdapter(this, mPeternak);
        recyclerView.setAdapter(peternakAdapter);
        peternakAdapter.notifyDataSetChanged();
    }

}
