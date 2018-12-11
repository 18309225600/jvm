# jvm
用于jvm参数调优学习

Test2 配置信息：
    /**
             *
             *  -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2  -XX:+PrintGCDetail   -XX:+UseSerialGC
             *  -Xms20m -Xmx20m -Xmn7m -XX:SurvivorRatio=2  -XX:+PrintGCDetail   -XX:+UseSerialGC
             *  -Xms20m -Xmx20m -Xmn7m -XX:NewRatio=2  -XX:+PrintGCDetail   -XX:+UseSerialGC
             *
             * -XX:+HeapDumpOnOutOfMemoryError  -XX:HeapDumpPath=d:/test2.dump
             * -Xss5m   栈内存

              * -XX:PermSize=64M 方法区大小
              * -XX:MaxPermSize=64M  方法区最大大小
              * ************************************
              *  jdk1.8后，没有了方法区，改成了元数据区  Perm==>  MateData
             *
             *  -Xms20m:初始内存
             *  -Xmx20m:可扩展内存
             *  -Xmn7m:新生代内存
             *  -XX:SurvivorRatio=2    eden/from 或者 eden/to
             *  -XX:NewRatio=2          老年代/新生代
             */

Test1 配置信息：-Xmx20m  -Xms5m -XX:+PrintCommandLineFlags   -XX:+UseSerialGC    -XX:+PrintGCDetails
    日志信息：
        D:\java\jdk1.8.0_171\bin\java.exe -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:50612,suspend=y,server=n -Xmx20m -Xms5m -XX:+PrintCommandLineFlags -XX:+UseSerialGC -XX:+PrintGCDetails -javaagent:D:\java\ideaIC-2018.2.1.win\lib\rt\debugger-agent.jar=file:/C:/Users/lhf/AppData/Local/Temp/capture.props -Dfile.encoding=UTF-8 -classpath D:\java\jdk1.8.0_171\jre\lib\charsets.jar;D:\java\jdk1.8.0_171\jre\lib\deploy.jar;D:\java\jdk1.8.0_171\jre\lib\ext\access-bridge-64.jar;D:\java\jdk1.8.0_171\jre\lib\ext\cldrdata.jar;D:\java\jdk1.8.0_171\jre\lib\ext\dnsns.jar;D:\java\jdk1.8.0_171\jre\lib\ext\jaccess.jar;D:\java\jdk1.8.0_171\jre\lib\ext\jfxrt.jar;D:\java\jdk1.8.0_171\jre\lib\ext\localedata.jar;D:\java\jdk1.8.0_171\jre\lib\ext\nashorn.jar;D:\java\jdk1.8.0_171\jre\lib\ext\sunec.jar;D:\java\jdk1.8.0_171\jre\lib\ext\sunjce_provider.jar;D:\java\jdk1.8.0_171\jre\lib\ext\sunmscapi.jar;D:\java\jdk1.8.0_171\jre\lib\ext\sunpkcs11.jar;D:\java\jdk1.8.0_171\jre\lib\ext\zipfs.jar;D:\java\jdk1.8.0_171\jre\lib\javaws.jar;D:\java\jdk1.8.0_171\jre\lib\jce.jar;D:\java\jdk1.8.0_171\jre\lib\jfr.jar;D:\java\jdk1.8.0_171\jre\lib\jfxswt.jar;D:\java\jdk1.8.0_171\jre\lib\jsse.jar;D:\java\jdk1.8.0_171\jre\lib\management-agent.jar;D:\java\jdk1.8.0_171\jre\lib\plugin.jar;D:\java\jdk1.8.0_171\jre\lib\resources.jar;D:\java\jdk1.8.0_171\jre\lib\rt.jar;D:\jvm\out\production\jvm_heap;D:\java\ideaIC-2018.2.1.win\lib\idea_rt.jar com.lhf.test.Test1
        -XX:InitialHeapSize=5242880 -XX:MaxHeapSize=20971520 -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC
        Connected to the target VM, address: '127.0.0.1:50612', transport: 'socket'
        [GC (Allocation Failure) [DefNew（新生代）: 1664K->192K(1856K), 0.0025363 secs] 1664K->616K(5952K), 0.0025815 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
        max memory:20316160   最大内存
        free memory:5091096     空闲内存
        total memory:6094848    使用内存
        分配了1M内存
        max memory:20316160
        free memory:4042504
        total memory:6094848
        [GC (Allocation Failure) [DefNew: 1579K->61K(1856K), 0.0015465 secs][（老年代）Tenured: 1639K->1700K(4096K), 0.0111519 secs] 2004K->1700K(5952K), [Metaspace（元数据区，原来的perm）: 3251K->3251K(1056768K)], 0.0127612 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
        分配了4M内存
        max memory:20316160
        free memory:4387968
        total memory:10358784
        结果为：391709
        Disconnected from the target VM, address: '127.0.0.1:50612', transport: 'socket'
        Heap
         def new generation   total 1920K, used 51K [0x00000000fec00000, 0x00000000fee10000, 0x00000000ff2a0000)
          eden space 1728K,   2% used [0x00000000fec00000, 0x00000000fec0ce18, 0x00000000fedb0000)
          from space 192K,   0% used [0x00000000fedb0000, 0x00000000fedb0000, 0x00000000fede0000)
          to   space 192K,   0% used [0x00000000fede0000, 0x00000000fede0000, 0x00000000fee10000)
         tenured generation   total 8196K, used 5796K [0x00000000ff2a0000, 0x00000000ffaa1000, 0x0000000100000000)
           the space 8196K,  70% used [0x00000000ff2a0000, 0x00000000ff8493f8, 0x00000000ff849400, 0x00000000ffaa1000)
         Metaspace       used 3258K, capacity 4568K, committed 4864K, reserved 1056768K
          class space    used 346K, capacity 392K, committed 512K, reserved 1048576K

        Process finished with exit code 0
