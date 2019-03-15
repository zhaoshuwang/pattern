package com.zhaosw.pattern.prototype.deep;

import com.zhaosw.pattern.singleton.seriable.Seriable;

import java.io.*;
import java.util.Date;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class SunWuKong extends Monkey implements Serializable,Cloneable {

    public JinGuBang jinGuBang;
    public SunWuKong(){
        this.jinGuBang=new JinGuBang();
        this.birthday=new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {

        try {
            //内存中完成操作，对象读写是通过字节码直接操作
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            //完整的新对象
            SunWuKong copy=(SunWuKong)ois.readObject();
            copy.birthday = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();

        }
        return null;

    }


}
