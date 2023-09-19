package com.example.todoapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private int HitCount = 0;

    private RecyclerView.LayoutManager m_LayoutManager;
    private RecyclerView m_TodayTodo;
    private TodayToDoRecyclerViewAdapter m_TempAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listTempString = new ArrayList<String>();
        listTempString.clear();
        listTempString.add("약먹기");
        listTempString.add("출근하기");
        listTempString.add("농땡이 피우기");
        listTempString.add("찬우파티하기");
        listTempString.add("점심먹기");
        listTempString.add("졸기");
        listTempString.add("수면실 다녀오기");
        listTempString.add("보드게임하기");
        listTempString.add("이직 정보 알아보기");
        listTempString.add("몰래 다른 게임 하기");
        listTempString.add("사원들이랑 티타임 가지기");
        listTempString.add("찬우 흑역사 복기하기");
        listTempString.add("릴레이 소설 쓰기");
        listTempString.add("주변 놀릴 친구 물색하기");
        listTempString.add("찬우 전여친 목록 복습하기");
        listTempString.add("유찬우 사생활 관련 기사 작성하기");
        listTempString.add("일하는 상상 하기");
        listTempString.add("피카츄 배구");
        listTempString.add("지뢰찾기");
        listTempString.add("찬우한테 카톡으로 시비걸기");
        listTempString.add("퇴근하기");
        listTempString.add("저녁먹기");
        listTempString.add("꿀잠자기");

        m_TodayTodo = findViewById(R.id.TodayToDoList);
        m_TempAdapter = new TodayToDoRecyclerViewAdapter(listTempString);
        m_LayoutManager = new LinearLayoutManager(this);
        m_TodayTodo.setLayoutManager(m_LayoutManager);
        m_TodayTodo.setAdapter(m_TempAdapter);

//        Button HitMeButton = findViewById(R.id.TestButton);
//        if(HitMeButton == null)
//            return;
//
//        HitMeButton.setOnClickListener(CustomCallBack -> { HitTheButton(); });
    }

//    private void HitTheButton()
//    {
//        HitCount = HitCount + 1;
//
//        TextView TestText = findViewById(R.id.DisplayText);
//        if(TestText == null)
//            return;
//
//        TestText.setText("클릭 한 횟수 : " + HitCount);
//    }
}