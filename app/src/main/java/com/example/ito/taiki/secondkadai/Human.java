package com.example.ito.taiki.secondkadai;


import android.util.Log;

class Human extends Animal implements Thinkable {
    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", "の名前は" + this.name + "です。");
        Log.d("javatest", "私の年齢は" + this.age + "歳です。");
    }
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
}


