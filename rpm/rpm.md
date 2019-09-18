####  安装rpmbuild环境
    yum install rpm-build
    yum install rpm-devel
    yum install rpmdevtools

####  生成rpm运行环境：
    rpmdev-setuptree


####  进入/root/rpmbuild/SPECS/，编辑打包脚本test.spec
```
Name:           universalDataAccess  
Version:        1.1.1  
Release:        0  
Summary:        universalDataAccess  
Group:          System Environment/Daemons  
License:        GPL  
Vendor:         MySelf.com  

%description

%pre    

%preun 

%postun   

%clean 

%files
%defattr (0755,root,root,0755)
/home/universalDataAccess

%post

####  执行 rpmbuild -ba test.spec
在rpmbuild/RPMS/x86_64/目录会生成rpm打包文件

####  安装rpm包
rpm -ivh xxx.rpm

####  卸载rpm
rpm -e --nodeps xxx.rpm

####  检查rpm包安装情况
rpm -qa|grep xxx
```