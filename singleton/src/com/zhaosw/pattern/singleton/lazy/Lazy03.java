package com.zhaosw.pattern.singleton.lazy;

/**懒汉式单例
 * 内部类实现
 *
 * Created by zhaoshuwang on 2019-03-14 0014.
 */
public class Lazy03 {
    private boolean flag = false;
    private Lazy03(){
        synchronized (Lazy03.class){
            if(flag == false){
                flag=!flag;
            }else{
                throw new RuntimeException("单例已初始化");
            }
        }
    };

    public static final Lazy03 getInstance(){
        return lazy.LAZY;
    }


    //内部类
    private static class lazy{
        private static final Lazy03 LAZY=new Lazy03();
    }


}
