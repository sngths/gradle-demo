package com.tianxing.pattern;

import com.tianxing.pattern.iterator.Book;
import com.tianxing.pattern.iterator.BookShelf;
import com.tianxing.pattern.iterator.Iterator;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/8.
 * 迭代器模式测试
 */
public class IteratorTest {

    @Test
    public void test(){
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("book1"));
        bookShelf.appendBook(new Book("book2"));
        bookShelf.appendBook(new Book("book3"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNest()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
