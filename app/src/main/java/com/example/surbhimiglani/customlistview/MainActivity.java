package com.example.surbhimiglani.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods={"A","B","C","D","E"};
        ListAdapter myadapter=new CustomAdapter(this,foods);
        ListView listview=(ListView) findViewById(R.id.listview);
        listview.setAdapter(myadapter);

        listview.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                        String food=String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,food,Toast.LENGTH_LONG).show();
                    }
                }

        );
    }
}
