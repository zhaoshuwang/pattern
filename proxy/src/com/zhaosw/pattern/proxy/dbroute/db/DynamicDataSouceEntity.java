package com.zhaosw.pattern.proxy.dbroute.db;

/** 动态切换数据源实体
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class DynamicDataSouceEntity {
    public static final String DEFAULT_DATASOURCE=null;
    private final static ThreadLocal<String> local=new ThreadLocal<>();
    private DynamicDataSouceEntity(){}

    public static String get(){
        return local.get();
    }

    //dataSource DB_XXXX
    public static void set(String dataSource){
        local.set(dataSource);
    }

    public static void set(int year){
        local.set("DB_"+year);
    }

    //重置
    public static void restore(){
        local.set(DEFAULT_DATASOURCE);
    }
}
