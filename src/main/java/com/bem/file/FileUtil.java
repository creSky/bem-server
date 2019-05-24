package com.bem.file;

import com.bem.domain.AppFile;
import com.bem.util.PropertiesUtil;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class FileUtil {
    /**
     * 文件上传类
     * 文件会自动绑定到MultipartFile中
     *
     * @param request 获取请求信息
     * @param file    上传的文件
     * @return 上传成功或失败结果
     * @throws IOException
     * @throws IllegalStateException
     */
    public static AppFile upload(HttpServletRequest request,
                                MultipartFile file) throws IllegalStateException, IOException {
        // 测试MultipartFile接口的各个方法
        System.out.println("文件类型ContentType=" + file.getContentType());
        System.out.println("文件组件名称Name=" + file.getName());
        System.out.println("文件原名称OriginalFileName=" + file.getOriginalFilename());
        System.out.println("文件大小Size=" + file.getSize() / 1024 / 1024 + "MB");

        // 如果文件不为空，写入上传路径，进行文件上传
        if (!file.isEmpty()) {

            // 构建上传文件的存放路径
            String path = request.getServletContext().getRealPath("")+PropertiesUtil.getValue("fileFoler");
            System.out.println("path = " + path);

            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
            String filename = file.getOriginalFilename();
            File filepath = new File(path, filename);

            // 判断路径是否存在，不存在则新创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            // 将上传文件保存到目标文件目录
            file.transferTo(new File(path + File.separator + getFileNameNew()));
            System.out.println("文件路径=" + path + File.separator + getFileNameNew());

            //返回文件实体
            AppFile appFile=new AppFile();
            appFile.setFileName(filename);
            appFile.setFilePath(path);
            //appFile.setSaveName(getFileNameNew());
            //appFile.setFileSize(file.getSize() / 1024);
            appFile.setUploadDate(new Date());
            return appFile;
        } else {
            return null;
        }
    }

    /**
     * 文件下载
     *
     * @param response
     * @param filename
     * @param path
     */
    public static void download(HttpServletResponse response, String filename, String path) {
        if (filename != null) {
            FileInputStream is = null;
            BufferedInputStream bs = null;
            OutputStream os = null;
            try {
                File file = new File(path);
                if (file.exists()) {
                    //设置Headers
                    response.setHeader("Content-Type", "application/octet-stream");
                    //设置下载的文件的名称-该方式已解决中文乱码问题
                    response.setHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes("gb2312"), "iso8859-1"));
                    is = new FileInputStream(file);
                    bs = new BufferedInputStream(is);
                    os = response.getOutputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len = bs.read(buffer)) != -1) {
                        os.write(buffer, 0, len);
                    }
                } else {
                    System.out.println("下载的文件不存在");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                    if (bs != null) {
                        bs.close();
                    }
                    if (os != null) {
                        os.flush();
                        os.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 重新命名文件
     * 毫秒数+随机数
     * @return
     */
    public static String getFileNameNew() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return fmt.format(new Date())+"_"+UUID.randomUUID().toString();
    }

}
