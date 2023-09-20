package design.demo.bridge.operating;

import design.demo.bridge.video.VideoFile;

public class Windows extends OperatingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("在Windows平台播放");
        videoFile.decode(fileName);
    }
}
