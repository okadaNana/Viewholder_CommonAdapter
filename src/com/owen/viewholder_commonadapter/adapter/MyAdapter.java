package com.owen.viewholder_commonadapter.adapter;

import java.util.List;

import android.content.Context;

import com.owen.viewholder_commonadapter.R;
import com.owen.viewholder_commonadapter.bean.LostInfo;
import com.owen.viewholder_commonadapter.utils.CommonAdapter;
import com.owen.viewholder_commonadapter.utils.ViewHolder;

public class MyAdapter extends CommonAdapter<LostInfo> {

	public MyAdapter(Context context, List<LostInfo> datas, int itemLayoutResId) {
		super(context, datas, itemLayoutResId);
	}

	@Override
	public void convert(ViewHolder viewHolder, LostInfo item) {
		viewHolder.setText(R.id.tv_title, item.getTitle())
				  .setText(R.id.tv_desc, item.getDesc())
				  .setText(R.id.tv_time, item.getTime())
				  .setText(R.id.tv_phone, item.getPhone());
	}

}
