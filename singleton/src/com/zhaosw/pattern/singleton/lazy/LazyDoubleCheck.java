package com.zhaosw.pattern.singleton.lazy;

/**懒汉式单例
 * 双重检查锁
 *
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class LazyDoubleCheck {
    private static LazyDoubleCheck lazyDoubleCheck=null;
    private LazyDoubleCheck(){}

    public static LazyDoubleCheck getInstance(){
        if(lazyDoubleCheck == null){
            synchronized (LazyDoubleCheck.class){
                if(lazyDoubleCheck == null){
                    lazyDoubleCheck=new LazyDoubleCheck();
                }
            }
        }
        return lazyDoubleCheck;
    }
}
