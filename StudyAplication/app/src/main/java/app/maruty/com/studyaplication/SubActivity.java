package app.maruty.com.studyaplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
            Bundle or Intent
            Intentの内部にBundleを保持
         */


        String number ="";
        SampleParcelable sampleParcelable = new SampleParcelable();
        TextView textView = (TextView) findViewById(R.id.text);

        textView.setText("SubActivity");
        //IntentでもらうパターンBundleから取り出すやり方
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();

        if(extras.containsKey("data")){

            //Intentから
            number = intent.getStringExtra("data");
            textView.setText(textView.getText() + number);

        }
        if(extras.containsKey("parcelable")){
            //Bundleから
            sampleParcelable = (SampleParcelable) extras.getParcelable("parcelable");

            TextView textView01 = (TextView)findViewById(R.id.text01);
            textView01.setText(sampleParcelable.sampleParcelableVariable);

        }

    }
}
