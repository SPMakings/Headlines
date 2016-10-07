package com.spmakings.headlines.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.spmakings.headlines.R;

import org.json.JSONArray;

/**
 * Created by Saikat Pakira on 9/27/2016.
 */
public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.ViewHolder> {

    private Context context = null;
    private JSONArray mainData = null;
    private LayoutInflater inflater = null;
    private int rowHight = 0;

    public CategoryListAdapter(final Context context, final JSONArray mainData, final float screenWidth) {
        super();
        this.context = context;
        this.mainData = mainData;
        inflater = LayoutInflater.from(context);
        rowHight = rowHight(screenWidth);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.items_source_cat, parent, false);
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, rowHight));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        try {
            Glide.with(context)
                    .load(mainData.getJSONObject(position).getString("source_img_url"))
                    .into(holder.mainFeedImage);


            holder.title.setText(mainData.getJSONObject(position).getString("source_name"));
            holder.otherinfo.setText(mainData.getJSONObject(position).getString("source_gener"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return mainData.length();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mainFeedImage;
        private TextView title, otherinfo;

        public ViewHolder(View itemView) {
            super(itemView);
            mainFeedImage = (ImageView) itemView.findViewById(R.id.cat_image);
            title = (TextView) itemView.findViewById(R.id.source_name);
            otherinfo = (TextView) itemView.findViewById(R.id.source_gener);
        }
    }


    public int rowHight(final float screenWidth) {
        int hight = Math.round(screenWidth / 2.5f);
        return hight;
    }
}
