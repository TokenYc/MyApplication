package net.archeryc.myapplication.behavior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.zhy.base.adapter.ViewHolder;
import com.zhy.base.adapter.recyclerview.CommonAdapter;

import net.archeryc.myapplication.MyItemDecoration;
import net.archeryc.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class BehaviorActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private List<String> mDatas = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);
        recyclerView=findViewById(R.id.rv_behavior);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new MyItemDecoration(this,50));
        for (int i = 0; i < 50; i++)
        {
            mDatas.add("yc" + " -> " + i);
        }
        recyclerView.setAdapter(new CommonAdapter<String>(this,R.layout.item_simple,mDatas) {
            @Override
            public void convert(ViewHolder holder, String o) {
                holder.setText(R.id.tv_content, o);
            }
        });
    }
}
