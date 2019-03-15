package com.zhaosw.pattern.singleton.lazy;

/**懒汉式单例
 * 性能最优
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class LazyInnerClass {
    //构造私有，但可以通过反射
    private LazyInnerClass(){
        if(LazyHolder.LAZY!=null){
            throw new RuntimeException("不允许多实例");
        }
    }

    public static LazyInnerClass getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClass LAZY=new LazyInnerClass();
    }
}
