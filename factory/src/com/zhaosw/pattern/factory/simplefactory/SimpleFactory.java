package com.zhaosw.pattern.factory.simplefactory;

import com.zhaosw.pattern.factory.ICourse;

/**小作坊式的工厂模式
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class SimpleFactory {
    /*public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("c".equals(name)){
            return new CCourse();
        }else{
            return null;
        }

    }*/

    /*public ICourse create(String classname){

        try {
            if(!(classname==null && "".equals(classname))){
                return (ICourse) Class.forName(classname).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    public ICourse create(Class clazz){
        try {
            if (null != clazz) {
                return (ICourse) clazz.newInstance();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
