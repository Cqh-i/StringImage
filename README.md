# JavaFX 图像转字符串图画
 #### 思路
 根据每个坐标像素的RGB值不一样设置不同的字符。颜色深的像素(RGB值越小), 设置越粗的字符。当然了，受字符缩小的影响（字符一般是长方形的），且每个字符不一定是方块的，转换成字符串图画会被拉伸且很大。所以原图片不要太大(可以适当纵向压缩)，太大屏幕都装不下了，为了使效果更好，图片的颜色层次分明是最好的。
 #### 效果图
 <p align="center">
   <img src="https://raw.githubusercontent.com/Cqh-i/StringImage/master/DemoImage/DemoImage.gif"  width="742" height="492">
 </p>
<p align="left">
   <img src="https://github.com/Cqh-i/StringImage/blob/master/DemoImage/3.png"  width="124" height="248">
   <img src="https://github.com/Cqh-i/StringImage/blob/master/DemoImage/1.png"  width="124" height="248">
   <img src="https://github.com/Cqh-i/StringImage/blob/master/DemoImage/2.png"  width="124" height="248">
</p>
 Ps:字符串图画的文件我是用Notepad++打开的，记事本打开格式怪怪的而且也不能把字体缩到很小。这个小玩意实现并不难，给自己找点乐趣罢了，(*^▽^*)，(づ￣3￣)づ╭❤～。

