package com.lhf.test;

public class Test1 {

    /**
     * -Xmx20m  -Xms5m -XX:+PrintCommandLineFlags   -XX:+UseSerialGC    -XX:+PrintGCDetails
     * @param args
     */
    public static void main(String[] args){
        System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
        System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
        System.out.println("total memory:"+Runtime.getRuntime().totalMemory());

        byte[] b1 = new byte[1024*1024];
        System.out.println("分配了1M内存");
        System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
        System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
        System.out.println("total memory:"+Runtime.getRuntime().totalMemory());


        byte[] b2 = new byte[4*1024*1024];
        System.out.println("分配了4M内存");
        System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
        System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
        System.out.println("total memory:"+Runtime.getRuntime().totalMemory());


        int a = 34234234;
        int b = 435345234;
        System.out.println("结果为："+(b-a)/1024);
    }

}
