package com.example.yueding.baseadapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Animal> mData = null;
    private Context mContext;
    private AnimalAdapter mAdapter = null;
    private ListView animalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        animalList = (ListView) findViewById(R.id.animal_list);
        mData = new LinkedList<Animal>();
        mData.add(new Animal("Dog:","Are you a dog?",R.drawable.dog));
        mData.add(new Animal("Fish:","Are you a fish?",R.drawable.fish));
        mData.add(new Animal("Dragon Fly:","Are you a dragon fly?",R.drawable.dragon_fly));
        mData.add(new Animal("Turtle:","Are you a turtle?",R.drawable.turtle));
        mAdapter = new AnimalAdapter((LinkedList<Animal>) mData,mContext);
        animalList.setAdapter(mAdapter);
        animalList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this,"Dog",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this,"Fish",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"Dragon Fly",Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this,"Turtle",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
