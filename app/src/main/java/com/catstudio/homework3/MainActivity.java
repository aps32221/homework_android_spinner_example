package com.catstudio.homework3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result_tv;
    private Spinner select_sp;
    private ArrayAdapter<String> mAdapter;
    private String[] city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_tv = (TextView) findViewById(R.id.result_tv);
        select_sp = (Spinner) findViewById(R.id.select_sp);

        city = new String[]{"新竹縣",
                "苗栗縣",
                "彰化縣",
                "南投縣",
                "雲林縣",
                "嘉義縣",
                "屏東縣",
                "宜蘭縣",
                "花蓮縣",
                "臺東縣",
                "澎湖縣",
                "金門縣",
                "連江縣",
                "臺北市",
                "新北市",
                "桃園市",
                "臺中市",
                "臺南市",
                "高雄市"};

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, city);

        select_sp.setAdapter(mAdapter);
        select_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                result_tv.setText(String.valueOf(position)+"   "+city[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //donothing
            }
        });

    }
}
