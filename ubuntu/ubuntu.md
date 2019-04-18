##  ubuntu查看已安装软件
两种方法  
1.apt list --installed  
2.dpkg -l  

##  安装vmware后问题解决方法
1.apt-get install gcc    
2.apt-get install libcanberra*  
3.vmware-modconfig --console --install-all  

##  解决root用户部分软件启动不料的问题
1.which chromium-browser  
2.vim /usr/bin/chromium-browser  
3.输入/geteuid，输入i进入输入模式，将geteuid改成getppid  