package com.data.annotation;

import java.io.File;
import java.io.FilenameFilter;

/**
 * FileName仅过滤出java源文件
 * @author hasonger
 *
 */
public class FileName implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        File file = new File(dir, name);
        if(file.getName().toLowerCase().endsWith(".java")) {
            return true;
        }
        return file.isDirectory();
    }
}
