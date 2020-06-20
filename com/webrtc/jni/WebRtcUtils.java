package com.webrtc.jni;

/**
 * 基于webRtc的降噪封装
 */
public class WebRtcUtils {

    static {
        System.loadLibrary("WebRtcDeNoise");
    }

    /**
     * 初始化降噪模块
     * @param freq 采样率 8000hz,16000hz等
     * @param mode 降噪模式： 0,1,2,3,10,30,50,100，降噪强度由弱到强
     *
     */
    public static native void webRtcNsInit(int freq,int mode);

    /**
     * 处理 8k,16k采样率的音频降噪
     * @param sampleRate 采样率
     * @param len
     * @param proData
     * @return
     */
    public static native short[] webRtcNsProcess(int sampleRate, int len, short[] proData);
    public static native short[] webRtcNsProcess32k(int len, short[] proData);
    public static native int webRtcNsFree();

    /**
     * 初始化增益模块
     * @param minVolume 最小音量
     * @param maxVolume 最大音量
     * @param freq  采样率
     * @param mode  增益模式 0,1,2,3
     *              0: 无改变模式
     *              1: 模拟信号自适应模式
     *              2: 数字信号自适应模式
     *              3: 固定数字信号模式
     */
    public static native void webRtcAgcInit(long minVolume, long maxVolume, long freq,int mode);
    public static native void webRtcAgcProcess(short[] srcData, short[] desData, int srcLen);
    public static native void webRtcAgcProcess32k(short[] srcData, short[] desData, int srcLen);
    public static native void webRtcAgcFree();
}
