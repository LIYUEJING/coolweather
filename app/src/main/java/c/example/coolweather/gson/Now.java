package c.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 76769 on 2019/4/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
