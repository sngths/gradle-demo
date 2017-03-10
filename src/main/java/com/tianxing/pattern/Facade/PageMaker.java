package com.tianxing.pattern.Facade;

/**
 * Created by tianxing on 2017/3/9.
 *
 */
public class PageMaker {
    private PageMaker(){}


    public static void makeWelcomePage(String mailaddr){
        String username = DataBase.getUserName();
        HtmlWriter writer = new HtmlWriter();
        writer.title("welcome to " + username + "'s page!");
        writer.paragraph(username + " 欢迎来到" + username + "的主页");
        writer.paragraph("等你的邮件");
        writer.mailto(mailaddr, username);
        writer.close();
    }

}
