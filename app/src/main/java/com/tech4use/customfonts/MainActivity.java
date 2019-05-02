package com.tech4use.customfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6;
    Typeface f1, f2, f3, f4, f5, f6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding all the ids
        findids();

        //selecting all the fonts
        setTypeFace();

        //setting the fonts
        t1.setTypeface(f1);
        t2.setTypeface(f2);
        t3.setTypeface(f3);
        t4.setTypeface(f4);
        t5.setTypeface(f5);
        t6.setTypeface(f6);

    }

    //finding all the ids here
    public void findids() {

        t1 = (TextView)findViewById(R.id.text1);
        t2 = (TextView)findViewById(R.id.text2);
        t3 = (TextView)findViewById(R.id.text3);
        t4 = (TextView)findViewById(R.id.text4);
        t5 = (TextView)findViewById(R.id.text5);
        t6 = (TextView)findViewById(R.id.text6);
    }

    public void setTypeFace() {

        //selecting all the fonts
        f1 = Typeface.createFromAsset(getAssets(), "fonts/Xefus.ttf");
        f2 = Typeface.createFromAsset(getAssets(), "fonts/Seasrn.ttf");
        f3 = Typeface.createFromAsset(getAssets(), "fonts/Hearts BRK.ttf");
        f4 = Typeface.createFromAsset(getAssets(), "fonts/GreatVibes.otf");
        f5 = Typeface.createFromAsset(getAssets(), "fonts/Hang the DJ.ttf");
        f6 = Typeface.createFromAsset(getAssets(), "fonts/XLR8.ttf");

    }

}
