package com.itheima.emptyview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    private LoadingPage mLoadingPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoadingPage = (LoadingPage) findViewById(R.id.loading_page);
        mLoadingPage.setOnClickListener(this);
        mLoadingPage.setOnLoadingPageClickListener(new LoadingPage.onLoadingPageClickListener() {
            @Override
            public void onLoadingPageClick(View v) {
                System.out.println(v.toString());
            }
        });

        mLoadingPage.showEmpty();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
