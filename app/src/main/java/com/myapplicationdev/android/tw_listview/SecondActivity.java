package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Modules> modules, moduleByYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = findViewById(R.id.lvModules);
        tvYear = findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        modules = new ArrayList<Modules>();
        modules.add(new Modules("Year 2", "C208", "prog"));
        modules.add(new Modules("Year 2", "C200", "nonprog"));
        modules.add(new Modules("Year 2", "C346", "prog"));

        aa = new ModuleAdapter(this, R.layout.secondrow, moduleByYear);
        lv.setAdapter(aa);

    }

}
