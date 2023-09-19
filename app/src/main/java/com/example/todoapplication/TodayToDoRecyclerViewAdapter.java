package com.example.todoapplication;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class TodayToDoRecyclerViewAdapter extends RecyclerView.Adapter<TodayToDoRecyclerViewAdapter.TodayToDoItem>
{
    private ArrayList<String> m_listData = new ArrayList<String>();

    public static class TodayToDoItem extends RecyclerView.ViewHolder
    {
        private TextView m_Text;
        public TodayToDoItem(View itemView)
        {
            super(itemView);
            m_Text = itemView.findViewById(R.id.TestText);
//            m_Text = itemView.findViewById(android.R.id.text1);
        }

        public void SetText(String strTitle)
        {
            m_Text.setText(strTitle);
        }
    }

    public TodayToDoRecyclerViewAdapter(ArrayList<String> listData)
    {
        m_listData.clear();
        m_listData = listData;
    }

    @NonNull
    @Override
    public TodayToDoItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_item_layout, parent, false);
        return new TodayToDoItem(itemView);
//        // 새로운 뷰를 만들기 위한 LayoutInflater를 얻습니다.
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//
//        // item_layout.xml 파일을 inflate하여 레이아웃을 만듭니다.
//        View itemView = inflater.inflate(R.layout.simple_item_layout, parent, false);
//
//        // ViewHolder를 생성하고 해당 ViewHolder를 반환합니다.
//        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TodayToDoItem holder, int position)
    {
        String strItemText = m_listData.get(position);
        holder.SetText(strItemText);
    }

    @Override
    public int getItemCount()
    {
        return m_listData.size();
    }
}
