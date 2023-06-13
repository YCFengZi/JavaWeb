package net.zjitc.servlet.file;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

/**
 * @Author：YCFengZi
 * @Date：2023/6/13 9:53
 */
@WebServlet(name = "file", value = "/file")
public class file extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        PrintWriter writer = response.getWriter();
        try {
            List<FileItem> itemList = upload.parseRequest(request);
            for (FileItem item : itemList) {
                if (item.isFormField()) { //普通文件
                    String fieldName = item.getFieldName();
                    String string = item.getString("UTF-8");
                    String uuid = UUID.randomUUID().toString();
                    uuid = uuid.replace("-","");
                    writer.write(fieldName+" : "+uuid+" : "+string+"<br>");
                } else { //文件
                    String name = item.getName(); //文件名
                    String uuid = UUID.randomUUID().toString();
                    uuid = uuid.replace("-","");
                    UUID.randomUUID().toString().replace("-","");
//                    File file = new File("F:\\JavaWeb\\Web2203\\src\\main\\webapp\\file",name);
                    File file = new File(this.getServletContext().getRealPath("/uploads"),name+"-"+uuid);
                    item.write(file);
                    writer.write("文件已保存");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
