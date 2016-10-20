package app.maruty.com.studyaplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String number = intent.getStringExtra("data");

        TextView textView = (TextView) findViewById(R.id.text);

        textView.setText("SubActivity" + number);
    }
}
