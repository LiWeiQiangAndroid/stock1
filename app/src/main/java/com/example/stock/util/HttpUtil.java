package com.example.stock.util;

/**
 * 作者：LiWeiQiang on 2016/4/24 23:15
 * 邮箱：lwqldsyzx@126.com
 */

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.stock.bean.Stock;
import com.google.gson.Gson;

/**
 * @author LWQ
 * created at 2016/4/24 23:17
 * 网络访问工具类
 */
public class HttpUtil {
    //创建一个Volley的访问队列
    public  static RequestQueue queue;
    public  static String key="a79f48201b0cc2b63a1d000cfd2f5f65";
    private static final String TAG = "tedu";

    public static  void getNews(final Context context,String code,final  OnGetNewsListener listener){

        //判断有没有队列
        if (queue==null){
            //如果没有队列，就创建请求队列
            queue= Volley.newRequestQueue(context);
        }
        //2创建网络请求
        //对指定的关键字进行UTF-8换吗
        //try-catch快捷键alt+shift+z
//            String wordname= URLEncoder.encode(word,"UTF-8");
        //利用转码后的关键字，拼接URL
        String url="http://web.juhe.cn:8080/finance/stock/hs?gid="+code+"&key="+key;
        final StringRequest request=new StringRequest(url, new Listener<String>(){
            @Override
            public void onResponse(String result) {
                //TODO 网络访问成功后，会调用该方法
                //onResponse方法是在主线程上调用的
                Log.d("TAG", result);
                //使用Gson，将result转为MyWeather对象
                Gson gson = new Gson();
                Stock stock=gson.fromJson(result,Stock.class);
                Log.d(TAG, "onResponse: "+stock.getResult().toString());
                listener.OnSuccess(stock);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                //网络访问失败后，会调用该方法
                //onErrorResponse是在主线程上调用的
                Toast.makeText(context, "网络繁忙，稍后重试", Toast.LENGTH_SHORT).show();
            }
        });
        //3)需要把网络访问请求对象放入队列中
        queue.add(request);

    }

    public interface OnGetNewsListener{
        void OnSuccess(Stock stock);
    }
}
