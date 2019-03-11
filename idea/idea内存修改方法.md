#idea JVM内存设置
小伙伴们经常会发现，在开发的时候，经常遇到内存被占满，导致异常卡顿，有时候提示内存溢出，这时可以通过设置xmx来改善。
不过切记最好不要超过内存的1/4  
打开 IDEA 安装目录，看到有一个 bin 目录，其中有两个 vmoptions 文件，需针对不同的JDK进行配置：  

32 位：idea.exe.vmoptions  
64 位：idea64.exe.vmoptions  

-Xms1024m  
-Xmx1024m  
-XX:MaxPermSize=512m  
-XX:ReservedCodeCacheSize=225m  
-XX:+UseConcMarkSweepGC  
-XX:SoftRefLRUPolicyMSPerMB=50  
-ea  
-Dsun.io.useCanonCaches=false  
-Djava.net.preferIPv4Stack=true
#设置JVM内存的参数有四个：
-Xms   Java Heap初始值，Server端JVM最好将-Xms和-Xmx设为相同值，开发测试机JVM可以保留默认值；
　　　　用它来设置程序初始化的时候内存栈的大小，增加这个值的话你的程序的启动性能会得到提高。不过同样有前面的限制，以及受到xmx的限制。  
-Xmx   Java Heap最大值，默认值为物理内存的1/4，最佳设值应该视物理内存大小及计算机内其他内存开销而定；
　　　　用来设置你的应用程序能够使用的最大内存数（看好，这是你的应用程序，不是整个jvm）,如果你的程序要花很大内存的话，那就需要修改缺省的设置。  
-Xmn   Java Heap Young区大小，不熟悉最好保留默认值。  
-Xss   每个线程的Stack大小，不熟悉最好保留默认值。  
-XX：PermSize 永久区的大小。  
-XX:+UseParNewGC 使用并行收集算法。  