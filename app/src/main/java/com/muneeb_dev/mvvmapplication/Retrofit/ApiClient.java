package com.muneeb_dev.mvvmapplication.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

//    public static String BASE_URL ="https://jsonplaceholder.typicode.com/";
    public static String BASE_URL ="http://cablefor.wwwmi3-ls7.a2hosted.com/dev/postquamv3/";

    private static Retrofit retrofit ;

    public static Retrofit getClient() {
        if (retrofit==null) {


//
//            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
////            File httpCacheDirectory = new File(activity.getCacheDir(), "http-cache");
//            int cacheSize = 10 * 1024 * 1024; // 10 MiB
////            Cache cache = new Cache(httpCacheDirectory, cacheSize);
//
//            OkHttpClient client = new OkHttpClient.Builder()
//                    .readTimeout(2, TimeUnit.MINUTES)
//                    .writeTimeout(2,TimeUnit.MINUTES)
//                    .connectTimeout(2, TimeUnit.MINUTES)
////                    .addNetworkInterceptor(new CacheInterceptor()).cache(cache)
//                    .addInterceptor(loggingInterceptor)
//                    .build();
//
//
////            client.addNetworkInterceptor(new CacheInterceptor())
////                    .cache(cache);
////            client.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();

//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .client(client)
//                    .callbackExecutor(Executors.newSingleThreadExecutor())
//                    .addConverterFactory(GsonConverterFactory.create(gson))
//                    .build();


 retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
//                    .callbackExecutor(Executors.newSingleThreadExecutor())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
