# webrtc-denoise
基于webrtc的音频降噪与增益模块

功能是对音频的字节流做降噪和增益处理，返回处理后的字节流。可用于实时语音处理。

这个是基于 https://github.com/sws1011/webrtc 的项目修改的版本，为了自己使用方便在这建个仓库自用，有其他需求或者需要源码的请转到原项目

主要改动是：
 1.增加了降噪模块初始化时降噪强度参数
 2.增加了增益模块初始化时增益模式参数
 3.打成了so库包，方便安卓使用
