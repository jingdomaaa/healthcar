package com.nit.healthcar.carmonitor.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nit.healthcar.carmonitor.MyAdapter;
import com.nit.healthcar.carmonitor.R;

import java.util.ArrayList;
import java.util.List;


public class PartOneFragment extends Fragment {

    private MyAdapter adapter;

    private List<String> mDataList ;

    private RecyclerView mRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);
        mDataList = new ArrayList<>();
        for (int i=0;i<5;i++){
            mDataList.add(i+"月"+i+"日");
        }
        Log.w(mDataList.get(1),"yyf");
        adapter = new MyAdapter(mDataList);
        RecyclerView recyclerView = view.findViewById(R.id.myRecycle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
//    /**
//     * 初始化recyclerView
//     */
//    private void initView() {
//        //找到这个Listview
//        mRecyclerView =  findViewById(R.id.myRecycle);
//        //设置线性管理器
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//    }

//
//    /**
//     * 初始化recyclerView数据
//     */
//    private void initData() {
//
//
//    }
//    /**
//     * 初始化
//     */
//    private void initView(View view) {
//        //找到这个Listview
//        mRecyclerView = view.findViewById(R.id.myRecycle);
//        //设置线性管理器
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
//    }
//    /**
//     * 初始化数据
//     */
//    private void initData() {
//
//        mDataList = new ArrayList<>();
//        for (int i=0;i<5;i++){
//            mDataList.add(i+"月"+i+"日");
//        }
//        /*
//        设置适配器
//         */
//        adapter = new MyAdapter(mDataList);
//        mRecyclerView.setAdapter(adapter);
//    }

}
