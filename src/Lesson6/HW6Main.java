package Lesson6;

import okhttp3.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HW6Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();
        String responseBody;
        try (Response response = client.newCall(getWeather("190000")).execute()) {
            responseBody = response.body() != null ? response.body().string() : "0";
        }
        System.out.println(responseBody);
    }

    public static Request getWeather(String postCode) {
        String apiKey = "3X1p7320ePjXvllDmokQ4nd63pt4GQpk";
        return new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/" + postCode + "?apikey=" + apiKey + "&language=en-us&details=false&metric=true")
                .build();
    }
}
