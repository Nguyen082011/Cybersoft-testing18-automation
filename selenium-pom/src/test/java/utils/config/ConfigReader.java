package utils.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties=new Properties();
//    static block: chạy 1 lần duy nhất khi class được gọi lên đầu
    static {
//        lấy file trong resources =>getResourcesAsStream()
    try(InputStream in=ConfigReader.class.getResourceAsStream("/config.properties")){
        properties.load(in);
    }catch (Exception e){
        throw new RuntimeException("không đọc được congif.properties ", e);
    }
}

public static String get(String key){
        return properties.getProperty(key);
}

}
