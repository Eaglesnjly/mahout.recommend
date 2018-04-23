package com.springmvc.demo.service;

import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.ssl.SslContextFactory;

/**
 * Created by yehao on 2018/3/23.
 */
public class TestServlet {

    //仅仅为了测试servlet for jetty
    public static void main(String[] args) {
        ServletHolder holder = new ServletHolder();
        SslContextFactory factory  = new SslContextFactory();
        HttpConfiguration configuration = new HttpConfiguration();
    }
}
