package com.spmakings.headlines.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.spmakings.headlines.R;
import com.spmakings.headlines.helper.onAdapterScrollListener;
import com.spmakings.headlines.models.NewsModel;

import java.util.LinkedList;


/**
 * Created by Saikat Pakira on 9/26/2016.
 */

public class MainFeedsAdapters extends RecyclerView.Adapter<MainFeedsAdapters.ViewHolder> {

    private Context context = null;
    private LinkedList<NewsModel> mainData = null;
    private LayoutInflater inflater = null;
    private onAdapterScrollListener callback = null;

    public MainFeedsAdapters(final Context context, final LinkedList<NewsModel> mainData) {
        super();
        this.context = context;
        this.mainData = mainData;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.items_feeds, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        try {
            Glide.with(context)
                    .load(mainData.get(position).getImageURL()).centerCrop()
                    .into(holder.mainFeedImage);
            Glide.with(context)
                    .load(mainData.get(position).getChannelURL()).fitCenter()
                    .into(holder.channelImage);


            holder.title.setText(mainData.get(position).getTitle());
            holder.description.setText(mainData.get(position).getMessage());


            if (position == 0) {
                callback.onScrollStart();
            } else if (position > (mainData.size() - 3)) {
                callback.onScrollEnd();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return mainData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView mainFeedImage, channelImage;
        private TextView title, description, otherinfo;
        private View mainView;

        public ViewHolder(View itemView) {
            super(itemView);

            mainView = itemView;
            mainFeedImage = (ImageView) itemView.findViewById(R.id.main_nes_image);
            channelImage = (ImageView) itemView.findViewById(R.id.chanel_img);

            title = (TextView) itemView.findViewById(R.id.title_news);
            description = (TextView) itemView.findViewById(R.id.news_desc);
            otherinfo = (TextView) itemView.findViewById(R.id.news_other_info);

        }
    }


    public void addMoreData(final LinkedList<NewsModel> addedData_) {
        int currentCount = mainData.size() - 1;
        mainData.addAll(addedData_);
        notifyItemRangeInserted(currentCount, addedData_.size());
    }

    public void addOnScrollListener(onAdapterScrollListener callback) {
        this.callback = callback;
    }



    /*
    * View view = LayoutInflater.from(mContext).inflate(R.layout.items_general_image, null);
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, rowHight));
    * */



}
