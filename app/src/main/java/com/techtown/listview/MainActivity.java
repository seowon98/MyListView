package com.techtown.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

    SingerAdapter adapter = new SingerAdapter();
        adapter.addItem(new Singeritem("소녀시대","010-1000-1100"));
        adapter.addItem(new Singeritem("소녀","010-1000-1100"));
        adapter.addItem(new Singeritem("얼시대","010-1035-1100"));
        adapter.addItem(new Singeritem("포미닛","010-1350-2430"));
        adapter.addItem(new Singeritem("시스타","010-1078-1670"));
        adapter.addItem(new Singeritem("투애니원","010-1500-156"));
    listView.setAdapter(adapter);

    }
    //SingerAdapter
    class SingerAdapter extends BaseAdapter {

        ArrayList<Singeritem> items = new ArrayList<Singeritem>();

        @Override
        public int getCount() {
            return items.size(); //배열갯수 반환
        }

        public void addItem (Singeritem item){
            items.add(item);
        }
        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override//리스트 속 각 아이템들이 보여지는 뷰 --> 그 뷰는 부분 화면 --> 화면 정의는 xml파일과 자바 소스 파일 하나로 구성
        public View getView(int position, View convertView, ViewGroup parent) {
            SingerItemView view = new SingerItemView(getApplicationContext());

            Singeritem item = items.get(position);
            view.setName(item.getName());
            view.setMobile(item.getMobile());

            return null;
        }
    }
}
