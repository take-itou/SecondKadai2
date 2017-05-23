package com.example.ito.taiki.secondkadai;


import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「私の名前は〜〜です。年は〜〜歳です。」");
    }
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「私は〜〜について考える。");
    }
}


