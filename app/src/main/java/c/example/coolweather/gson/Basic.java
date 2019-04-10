package c.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 76769 on 2019/4/9.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
