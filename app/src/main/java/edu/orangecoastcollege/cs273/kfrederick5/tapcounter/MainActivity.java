package edu.orangecoastcollege.cs273.kfrederick5.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button tapButton;
    private TextView countText;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tapButton = (Button) findViewById(R.id.tapButton);
        countText = (TextView) findViewById(R.id.countText);

        //Define listener for countText onTextChange
        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                countText.setText(Integer.toString(count));
            }
        });
    }
}
