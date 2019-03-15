package com.zhaosw.pattern.singleton.register;

/**枚举式单例
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public enum  EnumSingleton {
    INSTANCE;
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
