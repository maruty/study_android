package app.maruty.com.studyaplication;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by 01008973 on 2017/01/04.
 */
public class MediatorActivity extends AppCompatActivity implements View.OnClickListener{
    //Activityのライフサイクルのチェックをするために全てのライフサイクルにToastを貼ってある状態

    MediatorElementStatus passwordEditText;
    MediatorElementStatus userIdEditText;
    Button buttonOk;
    RadioGroup radioGroup;
    RadioButton radioGuest;
    RadioButton radioLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mediatr_layout);

        passwordEditText = (MediatorElementStatus)findViewById(R.id.editPassword);
        userIdEditText =  (MediatorElementStatus)findViewById(R.id.editUserId);
        buttonOk = (Button)findViewById(R.id.buttonOk);
        radioGuest = (RadioButton)findViewById(R.id.radioCheckGuest);
        radioLogin = (RadioButton)findViewById(R.id.radioCheckLogin);

        buttonOk.setOnClickListener(this);

        userIdEditText.setEnabled(false);
        userIdEditText.setFocusable(false);
        userIdEditText.setBackgroundColor(Color.GRAY);
        passwordEditText.setEnabled(false);
        passwordEditText.setFocusable(false);
        passwordEditText.setBackgroundColor(Color.GRAY);
        buttonOk.setEnabled(false);
        buttonOk.setBackgroundColor(Color.GRAY);


        //ラジオボタンの選択
       radioGroup = (RadioGroup)findViewById(R.id.RadioGroup);

        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                      @Override
                      public void onCheckedChanged(RadioGroup group, int checkedId) {
                          layoutJudgement();
                          /*
                          if(group == radioGroup){
                              switch (checkedId){
                                  case R.id.radioCheckGuest:
                                      userIdEditText.setEnabled(false);
                                      userIdEditText.setFocusable(false);
                                      userIdEditText.setBackgroundColor(Color.GRAY);
                                      passwordEditText.setEnabled(false);
                                      passwordEditText.setFocusable(false);
                                      passwordEditText.setBackgroundColor(Color.GRAY);

                                      buttonOk.setEnabled(true);
                                      buttonOk.setFocusable(true);
                                      buttonOk.setFocusableInTouchMode(true);
                                      buttonOk.setBackgroundColor(Color.RED);


                                    break;

                                  case R.id.radioCheckLogin:
                                      //Loginを押すとpasswordとOKボタンが非活性になる



                                      userIdEditText.setEnabled(true);
                                      userIdEditText.setFocusableInTouchMode(true);
                                      userIdEditText.setFocusable(true);
                                      userIdEditText.setBackgroundColor(Color.RED);

                                      if(passwordEditText.getText().length() > 0){
                                          passwordEditText.setEnabled(true);
                                          passwordEditText.setFocusable(true);
                                          passwordEditText.setFocusableInTouchMode(true);
                                          passwordEditText.setBackgroundColor(Color.RED);

                                          buttonOk.setEnabled(true);
                                          buttonOk.setFocusable(true);
                                          buttonOk.setFocusableInTouchMode(true);
                                          buttonOk.setBackgroundColor(Color.RED);



                                      }else{
                                          passwordEditText.setEnabled(false);
                                          passwordEditText.setFocusable(false);
                                          passwordEditText.setBackgroundColor(Color.GRAY);

                                          buttonOk.setEnabled(false);
                                          buttonOk.setBackgroundColor(Color.GRAY);
                                      }


                                    break;
                                  default:
                                      break;

                              }
                          }
                        */
                      }
                  });
        }


        //User名が入力されているとOKボタンが有効になる
        //入力イベントをaddTExtChabgedListenerで取得
        userIdEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //テキスト変更前

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //テキスト変更中
            }

            @Override
            public void afterTextChanged(Editable s) {
                layoutJudgement();
                /*
                if(userIdEditText.getText().length() > 0){
                    //テキスト変更後
                    passwordEditText.setEnabled(true);
                    passwordEditText.setFocusableInTouchMode(true);
                    passwordEditText.setFocusable(true);
                    passwordEditText.setBackgroundColor(Color.RED);
                    if(passwordEditText.getText().length() > 0){
                        buttonOk.setEnabled(true);
                        buttonOk.setFocusable(true);
                        buttonOk.setFocusableInTouchMode(true);
                        buttonOk.setBackgroundColor(Color.RED);
                    }

                }else{
                    passwordEditText.setEnabled(false);
                    passwordEditText.setFocusable(false);
                    passwordEditText.setBackgroundColor(Color.GRAY);

                    buttonOk.setEnabled(false);
                    buttonOk.setBackgroundColor(Color.GRAY);
                }
                */
            }

        });


        passwordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                layoutJudgement();
                /*
                if(passwordEditText.getText().length() > 0){
                    buttonOk.setEnabled(true);
                    buttonOk.setFocusable(true);
                    buttonOk.setFocusableInTouchMode(true);
                    buttonOk.setBackgroundColor(Color.RED);
                }else{
                    buttonOk.setEnabled(false);
                    buttonOk.setBackgroundColor(Color.GRAY);
                }
                */

            }
        });




        //ライフサイクル確認用
        //Toast.makeText(this.getApplicationContext(),"onCreate", Toast.LENGTH_SHORT).show();

        //各種ボタンのオブジェクト
        /*
        Button button1 = (Button)findViewById(R.id.button01);
        Button button2 = (Button)findViewById(R.id.button02);
        Button button3 = (Button)findViewById(R.id.button03);
        */
        //各種ボタンのリスナー
        /*
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        */
    }

    public void layoutJudgement() {
        /*
        passwordEditText;
        userIdEditText;
        buttonOk;
        radioGroup;
        radioGuest;
        radioLogin;
*/

        if(radioGuest.isChecked()){
            //Guestボタンにチェックがされるとユーザー名もパスワードも無効になる
            userIdEditText.setStatus(false);
            //setUserIdStatus(false);
            passwordEditText.setStatus(false);
            //setPasswordStatus(false);

            setButtonStatus(true);
        }


        if(radioLogin.isChecked()){

            String userText = userIdEditText.getText().toString();
            String userPass = passwordEditText.getText().toString();

            if((userText.isEmpty() && userPass.isEmpty()) || (userText.isEmpty() && !userPass.isEmpty())){
                userIdEditText.setStatus(true);
                //setUserIdStatus(true);

                //setPasswordStatus(false);
                passwordEditText.setStatus(false);
                setButtonStatus(false);

            }

            if((!userText.isEmpty() && !userPass.isEmpty()) ){
                //setUserIdStatus(true);
                userIdEditText.setStatus(true);

                //setPasswordStatus(true);
                passwordEditText.setStatus(true);

                setButtonStatus(true);
            }

            if(!userText.isEmpty() && userPass.isEmpty()) {
                //setUserIdStatus(true);
                userIdEditText.setStatus(true);

                passwordEditText.setStatus(true);
                //setPasswordStatus(true);

                setButtonStatus(false);
            }


        }

    }

    public void setUserIdStatus(boolean visible) {
        if(visible){
            userIdEditText.setEnabled(true);
            userIdEditText.setFocusableInTouchMode(true);
            userIdEditText.setFocusable(true);
            userIdEditText.setBackgroundColor(Color.RED);

        }else{
            userIdEditText.setEnabled(false);
            userIdEditText.setFocusable(false);
            userIdEditText.setBackgroundColor(Color.GRAY);
        }
    }

    public void setPasswordStatus(boolean visible) {
        if(visible){
            passwordEditText.setEnabled(true);
            passwordEditText.setFocusableInTouchMode(true);
            passwordEditText.setFocusable(true);
            passwordEditText.setBackgroundColor(Color.RED);

        }else{
            passwordEditText.setEnabled(false);
            passwordEditText.setFocusable(false);
            passwordEditText.setBackgroundColor(Color.GRAY);

        }
    }

    public void setButtonStatus(boolean visible) {
        if(visible){
            buttonOk.setEnabled(true);
            buttonOk.setFocusable(true);
            buttonOk.setFocusableInTouchMode(true);
            buttonOk.setBackgroundColor(Color.RED);
        }else{
            buttonOk.setEnabled(false);
            buttonOk.setBackgroundColor(Color.GRAY);
        }
    }


    public void layoutJudgement(View v, int checkId) {

    }



    public void onClick(View v){
        switch (v.getId()) {
            case R.id.buttonOk:
                Toast.makeText(v.getContext(), "OKボタンクリック",Toast.LENGTH_SHORT).show();

                break;
            default:
                break;
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        //ライフサイクル確認用
        //Toast.makeText(this.getApplicationContext(),"onStart", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onResume(){
        super.onResume();
        //ライフサイクル確認用
        //Toast.makeText(this.getApplicationContext(),"onResume", Toast.LENGTH_SHORT).show();

    }
}
