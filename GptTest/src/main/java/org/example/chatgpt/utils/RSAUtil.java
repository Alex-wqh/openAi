package org.example.chatgpt.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用专用的加密解密工具(主要是前后端交互的场景，例如前端加密，后端解密)
 *
 * @author luoyang
 */
public class RSAUtil {
    public static String PRIVATE_KEY = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAKmCVKWDDsD6Q5SH9cZn4mzvYng+Mt+AiwdHGW6zI8+WqsxAHt6gkYPEW5gGKeTlA0L3gl6XiEJXkyeXvZvBgfKqz9/FKAlgfY+/xwAqf+d8p1Sg28ojPatxGsU4H89cLAnAOiVlo90LqBlhhXMpW42rQgbHeBPs0+vydADiuT0RAgMBAAECgYAKcN9vYXL1coTan4RFQA1bmeQmFWizSRrnLBs2LR0Z0oU7NwDfxCKqa9wbcVe/xFZu18mFM46+TWAgSnGwqBrtop4FRsUg68I7xQtH5RX9cF1vU4J8Roao2FI/Jzkm//N5HDOqdOLpA0H18mnFcmA12s4oTyDpaJVuqr1Mm6fosQJBAMNIRnEd612oeo8Q+JvQ5p2o+QNm8CYYhI984BiDcFKN/NFJxt5arV+vXSW4Ty/g3NSw2O8MdQh3BVJeEyrpMakCQQDeNpsZ9IsQeSA1EVq4yL/QZlWYC9SEtC6ahSXj7nuJgAzb3VFyAIAfM9/2H5+pJrYqChfGHEiAhbnLUpTDHaEpAkEAontDaSDs0eu5tcn4IKVLDMkoD6WZkQj7WuwbBSpvzbCoN3b8ScwGz0N47EaTVJHzC+DtTtD9m4J0Yhk2N5D5qQJBANo+K0rsoIBHVliIeN+vWqRlPX+dbtX+2R6t0q7wFKjQ+NAfp9Qdpbf/jOD/4iGRgav8SakrMhH4RKfqrWyMdzECQQCCfLHJTcUi25kkTREtxawivxVhqrO0b9/AAUB81kXrHE0cUGSVBLVNmvBcMKnfIPObYHBHnskI5WX9lmDxYR8R";

    public static String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCpglSlgw7A+kOUh/XGZ+Js72J4PjLfgIsHRxlusyPPlqrMQB7eoJGDxFuYBink5QNC94Jel4hCV5Mnl72bwYHyqs/fxSgJYH2Pv8cAKn/nfKdUoNvKIz2rcRrFOB/PXCwJwDolZaPdC6gZYYVzKVuNq0IGx3gT7NPr8nQA4rk9EQIDAQAB";

    private static Map<Integer, String> keyMap = new HashMap<Integer, String>();  //用于封装随机产生的公钥与私钥


    public static Map<Integer, String> getKeyMap() {
        return keyMap;
    }
}
