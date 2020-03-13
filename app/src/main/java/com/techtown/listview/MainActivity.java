package com.techtown.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
//어댑터 사용 -> 데이터 관리하는 주체, view정의, index 알아야함
//1. 리스트뷰에 들거라 각 아이템의 xml을 정의
//2. 아이템을 위한 뷰를 정의, 각 아이템을 하나의 뷰로 정의 (xml, java파일), 이 뷰는 여러개의 뷰를 담은 뷰그룹,
//이것은 부분화면!! 정의한 xml레이아웃을 인플레이션 후 설정해야 함
//3. 어댑터 정의 : 클래스 만들고 그 안에 각 아이템으로 표시할 뷰를 리턴하는 getView()메소드 정의
//4. 리스트뷰 정의 : 화면에 보여줄 리스트뷰 만들고 그 안에 데이터가 선택되었을 때 호출될 리스너 객체 정의
public class MainActivity extends AppCompatActivity {
    SingerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    ListView listView = (ListView) findViewById(R.id.listView);
    adapter = new SingerAdapter();
        adapter.addItem(new Singeritem("소녀시대","010-1000-1100",R.drawable.red));
        adapter.addItem(new Singeritem("소녀","010-1000-1100",R.drawable.red));
        adapter.addItem(new Singeritem("얼시대","010-1035-1100",R.drawable.red));
        adapter.addItem(new Singeritem("포미닛","010-1350-2430",R.drawable.red));
        adapter.addItem(new Singeritem("시스타","010-1078-1670",R.drawable.red));
        adapter.addItem(new Singeritem("투애니원","010-1500-156",R.drawable.red));
    listView.setAdapter(adapter);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Singeritem item = (Singeritem) adapter.getItem(position);
            Toast.makeText(getApplicationContext(),"선택 : "+item.getName(),Toast.LENGTH_LONG).show();
        }
    });

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
            view.setImage(item.getReId());

            return null;
        }
    }
}
