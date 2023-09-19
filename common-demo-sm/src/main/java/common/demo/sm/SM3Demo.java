package common.demo.sm;

import cn.hutool.crypto.SmUtil;
import cn.hutool.crypto.digest.SM3;
import lombok.extern.slf4j.Slf4j;

/**
 * SM3示例<br/>
 * SM3为摘要加密算法，类似md5
 */
@Slf4j
public class SM3Demo {

    public static void main(String[] args) {
        String src = "人是为了活着本身而活着，而不是为了活着之外的任何事物而活着。";
        SM3 sm3 = SmUtil.sm3();
        String digestHex = sm3.digestHex(src);
        log.info("SM3加密后数据: {}", digestHex);
    }

}
