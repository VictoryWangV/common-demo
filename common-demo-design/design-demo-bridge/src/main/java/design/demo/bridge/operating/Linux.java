package design.demo.bridge.operating;

import design.demo.bridge.video.VideoFile;

public class Linux extends OperatingSystem {

    public Linux(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("在Linux平台播放");
        videoFile.decode(fileName);
    }
}
