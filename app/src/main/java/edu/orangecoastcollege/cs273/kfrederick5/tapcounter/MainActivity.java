package edu.orangecoastcollege.cs273.kfrederick5.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public class Counter
    {
        private int mCount;

        public Counter()
        {
            mCount =0;
        }

    }



}
