package design.demo.bridge.operating;

import design.demo.bridge.video.VideoFile;

public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("在Mac平台播放");
        videoFile.decode(fileName);
    }
}
