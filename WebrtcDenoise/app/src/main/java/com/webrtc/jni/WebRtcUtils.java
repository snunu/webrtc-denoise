package com.webrtc.jni;

/**
 * Created by shiwenshui 2018/4/20 17:40
 */
public class WebRtcUtils {

    static {
        System.loadLibrary("WebRtcDeNoise");
    }

    public static native void webRtcNsInit(int freq,int mode);
    public static native short[] webRtcNsProcess(int sampleRate, int len, short[] proData);
    public static native short[] webRtcNsProcess32k(int len, short[] proData);
    public static native int webRtcNsFree();

    public static native void webRtcAgcInit(long minVolume, long maxVolume, long freq,int mode);
    public static native void webRtcAgcProcess(short[] srcData, short[] desData, int srcLen);
    public static native void webRtcAgcProcess32k(short[] srcData, short[] desData, int srcLen);
    public static native void webRtcAgcFree();
}
