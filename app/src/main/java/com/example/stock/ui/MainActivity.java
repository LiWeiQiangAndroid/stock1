package com.example.stock.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.stock.R;
import com.example.stock.bean.Stock;
import com.example.stock.util.HttpUtil;


import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_data)
    TextView tvData;

    @Bind(R.id.tv_datas)
    TextView tvDatas;

    @Bind(R.id.today)
    TextView today;
    @Bind(R.id.yestodEnd)
    TextView yestodEnd;
    @Bind(R.id.Max)
    TextView Max;
    @Bind(R.id.Min)
    TextView Min;
    @Bind(R.id.buyOne)
    TextView buyOne;
    @Bind(R.id.buyTwo)
    TextView buyTwo;
    @Bind(R.id.buyThree)
    TextView buyThree;
    @Bind(R.id.buyFour)
    TextView buyFour;
    @Bind(R.id.buyFive)
    TextView buyFive;


    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getStock("sh600229");
    }

    private void getStock(String code) {
        //发起网络访问请求

        HttpUtil.getNews(this, code, new HttpUtil.OnGetNewsListener() {
            @Override
            public void OnSuccess(Stock stock) {

                Log.d(TAG, "OnSuccess: " + stock.getResult().toString());

                tvData.setText("股票名称：" + stock.getResult().get(0).getData().getName()+"  现价："+stock.getResult().get(0).getData().getNowPri());
                Log.d(TAG, "OnSuccess: "+stock.getResult().get(0).getData().getName());
                Log.d(TAG, "OnSuccess: "+stock.getResult().get(0).getData().getNowPri());
                //今天开盘价
                today.setText(stock.getResult().get(0).getData().getTodayStartPri());
                //昨天收盘价
                yestodEnd.setText(stock.getResult().get(0).getData().getYestodEndPri());
                Max.setText(stock.getResult().get(0).getData().getTodayMax());
                Min.setText(stock.getResult().get(0).getData().getTodayMin());
                //买一
                buyOne.setText(stock.getResult().get(0).getData().getBuyOnePri());
                buyTwo.setText(stock.getResult().get(0).getData().getBuyTwoPri());
                buyThree.setText(stock.getResult().get(0).getData().getBuyThreePri());
                buyFour.setText(stock.getResult().get(0).getData().getBuyFourPri());
                buyFive.setText(stock.getResult().get(0).getData().getBuyFivePri());

            }
        });

    }
}
