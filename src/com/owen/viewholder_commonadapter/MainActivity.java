package com.owen.viewholder_commonadapter;

import java.util.ArrayList;
import java.util.List;

import com.owen.viewholder_commonadapter.adapter.MyAdapter;
import com.owen.viewholder_commonadapter.bean.LostInfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView listView = null;
	private MyAdapter adapter = null;
	private List<LostInfo> datas = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		populateData();
		initView();
	}

	private void populateData() {
		datas = new ArrayList<LostInfo>();
		
		datas.add(new LostInfo("美女一只", "在操场捡到到一只萌萌哒妹子", "2015年5月28日 14:10:53", "1"));
		datas.add(new LostInfo("谁的黑色钱包", "一餐见到的，在座位上", "2015年5月28日 14:11:01", "2"));
		datas.add(new LostInfo("哆啦A梦", "哆啦A梦·伴我同行", "2015年5月28日 14:11:06", "3"));
		datas.add(new LostInfo("《高数上册》", "谁的高数书啊？", "2015年5月28日 14:11:10", "4"));
	}

	private void initView() {
		listView = (ListView) findViewById(R.id.listView);
		adapter = new MyAdapter(MainActivity.this, datas, R.layout.listview_item);
		listView.setAdapter(adapter);
	}

}
