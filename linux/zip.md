####  压缩目录
`zip -r mydata.zip mydata`  
####  压缩目录和文件
`zip -r abc123.zip abc 123.txt`  
####  循环压缩文件夹脚本(参数j可以让zip包不包含文件夹)
```
#!/bin/bash  
for file in *  
do  
    zip -rj $file.zip $file  
done
```  
####  带密码压缩
`zip -r -P123 mydata.zip mydata`  
####  解压zip包到当前目录
`unzip mydata.zip`
####  解压zip包到指定目录
`unzip mydata.zip -d mydatabak`
####  同时解压相同前缀的zip包
`unzip abc*.zip`
####  批量解压目录下的所有zip包
```
#!/bin/bash
for file in * 
do  
    unzip -P1234\!@# $file
done
```