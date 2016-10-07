package com.spmakings.headlines;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;

import com.spmakings.headlines.adapters.CategoryListAdapter;
import com.spmakings.headlines.helper.DataManagement;


public class CategorySelectionActivity extends AppCompatActivity {


    private RecyclerView catagoryList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //=======================================
        catagoryList = (RecyclerView) findViewById(R.id.catlist);
        catagoryList.setHasFixedSize(true);
        catagoryList.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        //=======================================
        DataManagement dManager = new DataManagement();
        dManager.initAllData();
        catagoryList.setAdapter(new CategoryListAdapter(CategorySelectionActivity.this, dManager.getAllData(), getScreenWidth()));
    }


    //==========Getting screen resolution

    public float getScreenWidth() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }

}
