package com.example.administrator.test;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
public class Fragment1 extends Fragment{

    private ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_1, container, false);
        listView = (ListView)view.findViewById(R.id.list_1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.MainActivityStatic,
                R.layout.support_simple_spinner_dropdown_item,new String[]{"1","2","3","4","5"});
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Fragment3 fragment3 = new Fragment3();
                    getFragmentManager().beginTransaction().replace(R.id.content_main, fragment3).commit();
                }
            }
        });

        return view;
    }
}
