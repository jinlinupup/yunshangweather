package com.hentaier.happybirthday.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/7/3.
 */

public class Now {
    @SerializedName("tmp")
    public String temperture;

    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
