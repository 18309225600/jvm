package com.lhf.test;

import java.util.Vector;

public class Test2 {

    public static void main(String[] args){
        /**
         *
         *  -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2  -XX:+PrintGCDetail   -XX:+UseSerialGC
         *  -Xms20m -Xmx20m -Xmn7m -XX:SurvivorRatio=2  -XX:+PrintGCDetail   -XX:+UseSerialGC
         *  -Xms20m -Xmx20m -Xmn7m -XX:NewRatio=2  -XX:+PrintGCDetail   -XX:+UseSerialGC
         *
         * -XX:+HeapDumpOnOutOfMemoryError  -XX:HeapDumpPath=d:/test2.dump
         *
         *  -Xms20m:初始内存
         *  -Xmx20m:可扩展内存
         *  -Xmn7m:新生代内存
         *  -XX:SurvivorRatio=2    eden/from 或者 eden/to
         *  -XX:NewRatio=2          老年代/新生代
         */

        Vector<Byte[]> v = new Vector<>();
        for (int i=0;i<10;i++){
            v.add(new Byte[1*1024*1024]);
        }
    }
}
