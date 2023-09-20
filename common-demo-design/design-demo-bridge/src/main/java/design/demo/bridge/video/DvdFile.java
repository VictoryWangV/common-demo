package design.demo.bridge.video;

public class DvdFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("DVD格式的视频文件: " + fileName);
    }
}
