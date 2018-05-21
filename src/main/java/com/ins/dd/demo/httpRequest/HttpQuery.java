package com.ins.dd.demo.httpRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class HttpQuery {
    @Autowired
    HttpClient httpClient;
    public  String getOkApiBtc(){

        //api url地址
        String url = "https://www.okex.com/api/v1/kline.do?symbol=ltc_btc&type=1min&size=1";
        //post请求
        HttpMethod method =HttpMethod.GET;
        // 封装参数，千万不要替换为Map与HashMap，否则参数无法传递
        MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
        params.add("", "");
        //发送http请求并返回结果
        return httpClient.client(url,method,params);
    }
}
