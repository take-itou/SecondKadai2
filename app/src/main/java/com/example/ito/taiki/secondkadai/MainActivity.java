package com.example.ito.taiki.secondkadai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("taiki ito", 20, "車");

    human.say();
            Log.d("javatest", "の名前は" + this.name + "です。");
            Log.d("javatest", "私の年齢は" + this.age + "歳です。");
        human.think();
        Log.d("javatest", "私は" + this.hobby + "について考える。");

    }
}
