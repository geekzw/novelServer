package com.gzw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by gzw on 2017/4/1.
 */
public class FileUtil {

    public static String getFileContent(String filePath) {
        File file = new File(filePath);
        byte[] buf = new byte[1024];
        FileInputStream fis = null;
        StringBuffer sb = new StringBuffer();
        if (!file.exists() || file.isDirectory())
            return "";
        else {
            try {
                fis = new FileInputStream(file);
                while ((fis.read(buf)) != -1) {
                    sb.append(new String(buf));
                    buf = new byte[1024];//重新生成，避免和上次读取的数据重复
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
