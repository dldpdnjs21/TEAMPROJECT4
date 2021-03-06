package com.example.teamproject4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class popupActivity extends Activity {

   // TextView txtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popup_activity);

        //UI 객체생성
//        txtText = (TextView)findViewById(R.id.txtText);

        //데이터 가져오기
     //   Intent intent = getIntent();
       // String data = intent.getStringExtra("data");
       // txtText.setText(data);

        Button imageButton1 = (Button) findViewById(R.id.button5);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), play1Activity.class);
                intent.putExtra("number", 1);
                //startActivityForResult(intent, 1);
                startActivity(intent);
            }
        });
        Button imageButton2 = (Button) findViewById(R.id.button6);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), play1Activity.class);
                intent.putExtra("number", 2);
               // startActivityForResult(intent, 2);
                startActivity(intent);
            }
        });
        Button imageButton3 = (Button) findViewById(R.id.button7);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), play1Activity.class);
                intent.putExtra("number", 3);
                //startActivityForResult(intent, 3);
                startActivity(intent);
            }
        });
    }
    //확인 버튼 클릭
    public void mOnClose(View v){
        //데이터 전달하기
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        //액티비티(팝업) 닫기
        finish();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }
    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }
}
