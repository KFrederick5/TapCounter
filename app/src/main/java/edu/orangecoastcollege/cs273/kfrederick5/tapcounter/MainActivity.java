package edu.orangecoastcollege.cs273.kfrederick5.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button tapButton;
    private TextView countText;

    //Associate controller with needed model
    Counter myCount = new Counter();

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
                countText.addTextChangedListener(countTextChangedListener);
            }
        });
    }

    private TextWatcher countTextChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            //Nothing
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try {
                myCount.addOne();
            }
            catch (NumberFormatException e) {
                countText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {
            //Nothing
        }
    };
}
