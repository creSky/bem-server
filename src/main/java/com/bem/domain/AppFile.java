package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_FILE")
public class AppFile {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单id
     */
    @Column(name = "APP_ID")
    private Long appId;

    /**
     * 环节id
     */
    @Column(name = "TASK_ID")
    private String taskId;

    /**
     * 文件路径
     */
    @Column(name = "FILE_PATH")
    private String filePath;

    /**
     * 文件名
     */
    @Column(name = "FILE_NAME")
    private String fileName;

    /**
     * 上传日期
     */
    @Column(name = "UPLOAD_DATE")
    private Date uploadDate;

    /**
     * 上传人
     */
    @Column(name = "UPLOAD_MAN_ID")
    private String uploadManId;

    /**
     *  文件类型
     */
    @Column(name = "FILE_TYPE")
    private String fileType;

    /**
     * 获取主键id
     *
     * @return ID - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取工作单id
     *
     * @return APP_ID - 工作单id
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置工作单id
     *
     * @param appId 工作单id
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取环节id
     *
     * @return TASK_ID - 环节id
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置环节id
     *
     * @param taskId 环节id
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * 获取文件路径
     *
     * @return FILE_PATH - 文件路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置文件路径
     *
     * @param filePath 文件路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * 获取文件名
     *
     * @return FILE_NAME - 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名
     *
     * @param fileName 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 获取上传日期
     *
     * @return UPLOAD_DATE - 上传日期
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * 设置上传日期
     *
     * @param uploadDate 上传日期
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * 获取上传人
     *
     * @return UPLOAD_MAN_ID - 上传人
     */
    public String getUploadManId() {
        return uploadManId;
    }

    /**
     * 设置上传人
     *
     * @param uploadManId 上传人
     */
    public void setUploadManId(String uploadManId) {
        this.uploadManId = uploadManId == null ? null : uploadManId.trim();
    }

    /**
     * 获取 文件类型
     *
     * @return FILE_TYPE -  文件类型
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 设置 文件类型
     *
     * @param fileType  文件类型
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }
}