package com.tianxing.pattern.Facade;

/**
 * Created by tianxing on 2017/3/10.
 */
public class HtmlWriter {
    private StringBuilder builder = new StringBuilder();

    //输出标题
    public void title(String title){
        builder.append("<html>\n");
        builder.append("<head>\n");
        builder.append("<title>" + title + "</title>");
        builder.append("</head>");
        builder.append("<body>\n");
        builder.append("<h1>" +title + "</h1>\n");
    }


    //输出段落
    public void paragraph(String msg){
        builder.append("<p>" + msg +"</p>\n");
    }

    //输出超链接
    public void link(String href, String caption){
        builder.append("<a href=\"" + href + "\">" + caption + "</a>\n");
    }

    //输出邮件地址
    public void mailto(String mailaddr, String username){
        link("mailto:"+ mailaddr, username);
    }

    //结束输出
    public void close(){
        builder.append("</body>\n");
        builder.append("</html>\n");
        System.out.println(builder.toString());
    }
}
