package com.techtown.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

//뷰를 정의할 때는 디폴트 생성자가 2개!!
public class SingerItemView extends LinearLayout {
    TextView textview1;
    TextView textview2;
    ImageView imageview;
    public SingerItemView(Context context) {
        super(context);

        init(context);
    }

    public SingerItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }
    //메모리 객체화 = 인플레이터 --> xml파일 인플래이션
    private void init(Context context){
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);  //--> 서비스 상속화->인플레이터 객체 리턴
     //단말에서 기본적으로 실행하는 서비스 : 시스템 서비스
        inflater.inflate(R.layout.singer_item,this,true);

       textview1= (TextView) findViewById(R.id.textview1);
       textview2= (TextView) findViewById(R.id.textview2);
       imageview = (ImageView) findViewById(R.id.imageview);
}

public void setName(String name){
        textview1.setText(name);
}
    public void setMobile(String mobile){
        textview2.setText(mobile);
    }
public void setImage(int reId){
        imageview.setImageResource(reId);
}
}
