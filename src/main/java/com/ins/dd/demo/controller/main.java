package com.ins.dd.demo.controller;

import com.ins.dd.demo.httpRequest.HttpRequest;

public class main {
    public static void main(String args[]) {
        //发送 GET 请求
        String url = "https://www.okex.com/api/v1/kline.do?symbol=ltc_btc&type=1min&size=1";
        String s= HttpRequest.sendGet(url, "symbol=ltc_btc");
        System.err.println(s);

//        //发送 POST 请求
//        String sr=HttpRequest.sendPost("http://localhost:6144/Home/RequestPostString", "key=123&v=456");
//        System.out.println(sr);
    }
}
