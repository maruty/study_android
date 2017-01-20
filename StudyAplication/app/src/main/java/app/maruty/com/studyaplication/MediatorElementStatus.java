package app.maruty.com.studyaplication;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 01008973 on 2017/01/12.
 * @author yy
 */
public class MediatorElementStatus extends EditText {
    public MediatorElementStatus(Context context) {
        super(context);
    }

    public MediatorElementStatus(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MediatorElementStatus(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }




    //Constructor


    public void setStatus(boolean visible) {
        if(visible){
            this.setEnabled(true);
            this.setFocusableInTouchMode(true);
            this.setFocusable(true);
            this.setBackgroundColor(Color.RED);

        }else{
            this.setEnabled(false);
            this.setFocusable(false);
            this.setBackgroundColor(Color.GRAY);
        }
        /*
            userIdEditText.setEnabled(true);
            userIdEditText.setFocusableInTouchMode(true);
            userIdEditText.setFocusable(true);
            userIdEditText.setBackgroundColor(Color.RED);

        }else{
            userIdEditText.setEnabled(false);
            userIdEditText.setFocusable(false);
            userIdEditText.setBackgroundColor(Color.GRAY);
         */

    }

    public void setStatusButton(boolean visible){
        if(visible){
            this.setEnabled(true);
            this.setFocusable(true);
            this.setFocusableInTouchMode(true);
            this.setBackgroundColor(Color.RED);
        }else{
            this.setEnabled(false);
            this.setBackgroundColor(Color.GRAY);
        }
    }



}
