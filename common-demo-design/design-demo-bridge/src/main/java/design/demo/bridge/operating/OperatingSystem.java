package design.demo.bridge.operating;

import design.demo.bridge.video.VideoFile;

/**
 * 操作系统类<br/>
 * 抽象化角色
 */
public abstract class OperatingSystem {

    protected final VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);

}
