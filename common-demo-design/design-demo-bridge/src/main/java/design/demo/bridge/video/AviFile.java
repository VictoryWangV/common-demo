package design.demo.bridge.video;

/**
 * AVI格式的视频文件<br/>
 * 具体的实现化角色
 */
public class AviFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("AVI格式的视频文件: " + fileName);
    }
}
