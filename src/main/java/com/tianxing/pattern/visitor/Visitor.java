package com.tianxing.pattern.visitor;

/**
 * Created by tianxing on 2017/3/9.
 * 访问者  从数据结构中取得数据并完成数据处理逻辑
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);

}
