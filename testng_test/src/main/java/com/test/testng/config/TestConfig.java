package com.test.testng.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestConfig {
    public static String loginUrl;

    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore cookieStore;
}
