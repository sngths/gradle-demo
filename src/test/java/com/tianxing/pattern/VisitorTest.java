package com.tianxing.pattern;

import com.tianxing.pattern.visitor.Directory;
import com.tianxing.pattern.visitor.File;
import com.tianxing.pattern.visitor.ListVisitor;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/9.
 * 访问者模式
 */
public class VisitorTest {

    @Test
    public void test() {
        System.out.println("Making root entries...");

        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.accept(new ListVisitor());

        System.out.println("");
        System.out.println("Making user entries...");
        Directory user1 = new Directory("user1");
        Directory user2 = new Directory("user2");
        Directory user3 = new Directory("user3");
        usrDir.add(user1);
        usrDir.add(user2);
        usrDir.add(user3);
        user1.add(new File("file1", 100));
        user1.add(new File("file2", 200));
        user2.add(new File("file3", 300));
        user3.add(new File("file4", 400));
        user3.add(new File("file5", 500));
        rootDir.accept(new ListVisitor());
    }
}
