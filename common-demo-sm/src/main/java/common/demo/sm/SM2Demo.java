package common.demo.sm;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SmUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.SM2;
import lombok.extern.slf4j.Slf4j;

/**
 * SM2示例<br/>
 * 国密2为非对称加密算法
 */
@Slf4j
public class SM2Demo {

    public static void main(String[] args) {
        String src = "可是我再也没遇到一个像福贵这样令我难忘的人了，对自己的经历如此清楚，又能如此精彩地讲述自己是如何衰老的。这样的老人在乡间实在是难以遇上，也许是困苦的生活损坏了他们的记忆，面对往事他们通常显得木讷，常常以不知所措的微笑搪塞过去。";

        // 加密
        String encrypt = encrypt(src);
        log.info("加密后密文: {}", encrypt);

        // 解密
        String decrypt = decrypt(encrypt);
        log.info("解密后数据: {}", decrypt);
        log.info("数据是否一致: {}", src.equals(decrypt));
    }

    /**
     * 对原始数据进行加密，返回加密后的数据
     * @param data 原始数据
     * @return 加密后的数据
     */
    private static String encrypt(String data) {
        // 加密公钥
        final String publicKey = "MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0DQgAERIykXLA0oDXYeiYxgfMEzKZMKLNLfOFnDIGJWnqMPDIJWhPfVCwbz2XtzmegJVkfff0KmWKa4+3ecGs/wZT9PQ==";
        // 因为数据加密时，仅需要公钥，所以不需要提供私钥。私钥仅用于解密
        SM2 sm2 = SmUtil.sm2(null, publicKey);
        // 使用公钥进行加密
        byte[] bytes = sm2.encrypt(data, KeyType.PublicKey);
        return Base64.encode(bytes);
    }

    /**
     * 对加密后的数据进行解密操作
     * @param data 加密后的数据
     * @return 解密后的数据
     */
    private static String decrypt(String data) {
        // 解密私钥
        final String privateKey = "MIGTAgEAMBMGByqGSM49AgEGCCqBHM9VAYItBHkwdwIBAQQg2A+hBEamSVoaof+F/EjooZVk+62jI515rLmww6dSk9KgCgYIKoEcz1UBgi2hRANCAAREjKRcsDSgNdh6JjGB8wTMpkwos0t84WcMgYlaeow8MglaE99ULBvPZe3OZ6AlWR99/QqZYprj7d5waz/BlP09";
        return StrUtil.utf8Str(SmUtil.sm2(privateKey, null).decrypt(Base64.decode(data), KeyType.PrivateKey));
    }

}
