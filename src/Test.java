import java.io.File;

/**
 * 测试bmp、png、txt三种格式文件的压缩
 * 
 * @author Mean
 */
public class Test {
    public static void main(String[] args) {
        File in = new File("source/test.bmp");
        File out = new File("source/test2.bmp");
        File out2 = new File("source/test3.bmp");
        Compress.compress(in, out);
        Compress.decompress(out, out2);
        in = new File("source/test.png");
        out = new File("source/test2.png");
        out2 = new File("source/test3.png");
        Compress.compress(in, out);
        Compress.decompress(out, out2);
        in = new File("source/test.txt");
        out = new File("source/test2.txt");
        out2 = new File("source/test3.txt");
        Compress.compress(in, out);
        Compress.decompress(out, out2);
    }
}
