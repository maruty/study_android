package app.maruty.com.studyaplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Activityのライフサイクルのチェックをするために全てのライフサイクルにToastを貼ってある状態



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this.getApplicationContext(),"onCreate", Toast.LENGTH_SHORT).show();
        Button button1 = (Button)findViewById(R.id.button01);
        Button button2 = (Button)findViewById(R.id.button02);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this.getApplicationContext(),"onStart", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this.getApplicationContext(),"onResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this.getApplicationContext(),"onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this.getApplicationContext(),"onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this.getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this.getApplicationContext(),"onRestart", Toast.LENGTH_SHORT).show();
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button01:
                Intent intent1 = new Intent(this , SubActivity.class);
                intent1.putExtra("data","100");
                startActivity(intent1);
                break;
            case R.id.button02:
                Uri uri = Uri.parse("http://google.com");
                Intent intent2 = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent2);

            default:
                break;
        }

    }




}
