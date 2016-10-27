package com.lqp.deploy.util;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

/**
 * @Package com.ec.form.util
 * @ClassName JsonUtil
 * @Description Json操作类
 * @author longqingping
 * @date 2015年4月9日
 *
 */
public class JsonUtil {

    public static JsonParser par = new JsonParser();
    private static Gson gson = new Gson();

    public static <T> String toJson(T t) {
        // String result = gson.toJson(t).replaceAll("\\\\", "");
        String result = gson.toJson(t);
        return result;
    }

    public static <T> T toObject(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

}
