package com.data.annotation;

/**
 * Created with IntelliJ IDEA
 * CountSum
 *
 * @author dk
 * @date 2017/1/16 17:13
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 代码条数统计
 * @author user
 */
public class CountSum{

    /**
     * 正则表达式主要是匹配多行注释
     */
    private static Pattern pattern = Pattern.compile("/\\*([\\s|\\S])+?\\*/");

    // 基本文件目录
    private File baseDir;
    // 拥有的文件列表
    private List<String> fileList = new ArrayList<String>();
    // 文件数量
    private int fileCount = 0;
    // 代码行数
    private int lineCount = 0;
    // 匹配表达式
    private String matchRegex = "[a-zA-Z0-9_-]*.java";

    public CountSum(File baseDir) {
        this.baseDir = baseDir;
    }

    public CountSum(File baseDir, String matchRegex) {
        this.baseDir = baseDir;
        this.matchRegex = matchRegex;
    }

    /**
     * 统计入口
     */
    public void count() {
        if(!baseDir.isHidden()){
            if (baseDir.isDirectory()) {
                for (File child : baseDir.listFiles()) {
                    CountSum count = new CountSum(child, matchRegex);
                    count.count();
                    fileCount += count.fileCount;
                    lineCount += count.lineCount;
                    fileList.addAll(count.fileList);
                }
            } else {
                if(baseDir.getName().matches(matchRegex)){
                    try {
                        fileList.add(baseDir.getPath());
                        fileCount ++;
                        String content = getFileContent(baseDir);
                        int line = getCodeCount(content);
                        lineCount += line;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 获取文件f中的文本内容
     *
     * @param f
     * @return
     * @throws IOException
     */
    public String getFileContent(File f) throws IOException {
        StringBuffer sb = new StringBuffer();
        FileInputStream input = new FileInputStream(f);
        byte[] b = new byte[1024];
        int count = 0;
        while ((count = input.read(b)) != -1) {
            sb.append(new String(b, 0, count));
        }
        input.close();
        return sb.toString();
    }

    /**
     * 统计文本中的代码行数 1.用正则表达式出去块注释即多行注释 2.再将字符串按照回车符分割成字符串数组 3.除去空白行或者单行注释行
     *
     * @param content
     *            输入文本
     * @return 文本中代码行数
     */
    public int getCodeCount(String content) {
        int rowCount = 0;
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll(" ");
        String ss[] = content.split("\n");
        for (String s : ss) {
            if (s.trim().length() > 0 && !s.trim().startsWith("//"))
                rowCount++;
        }
        return rowCount;
    }

    /**
     * 打印输出结果
     */
    public void print(){
        // 统计结果输出
        System.out.println(baseDir + "中所有文件:");
        for (String file : fileList) {
            System.out.println(file);
        }
        System.out.println();
        System.out.println("文件总数:" + fileCount);
        System.out.println("总代码行数" + lineCount);
    }

    public File getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(File baseDir) {
        this.baseDir = baseDir;
    }

    public List<String> getFileList() {
        return fileList;
    }

    public void setFileList(List<String> fileList) {
        this.fileList = fileList;
    }

    public int getFileCount() {
        return fileCount;
    }

    public void setFileCount(int fileCount) {
        this.fileCount = fileCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public void setLineCount(int lineCount) {
        this.lineCount = lineCount;
    }

    public String getMatchRegex() {
        return matchRegex;
    }

    public void setMatchRegex(String matchRegex) {
        this.matchRegex = matchRegex;
    }

    public static void main(String[] args) throws Exception {
//        String path = "D:\\dev\\code\\weixinEnt";
        String path = "E:\\test";
        CountSum code = new CountSum(new File(path));
        code.count();
        code.print();
    }
}
