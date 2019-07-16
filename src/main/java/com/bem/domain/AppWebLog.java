package com.bem.domain;

import javax.persistence.*;

@Table(name = "APP_WEB_LOG")
public class AppWebLog {
    @Column(name = "ID")
    private String id;

    @Column(name = "RECEIVE_JSON")
    private String receiveJson;

    @Column(name = "TEMPLATE_ID")
    private String templateId;

    @Column(name = "OUT_JSON")
    private String outJson;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return RECEIVE_JSON
     */
    public String getReceiveJson() {
        return receiveJson;
    }

    /**
     * @param receiveJson
     */
    public void setReceiveJson(String receiveJson) {
        this.receiveJson = receiveJson == null ? null : receiveJson.trim();
    }

    /**
     * @return TEMPLATE_ID
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    /**
     * @return OUT_JSON
     */
    public String getOutJson() {
        return outJson;
    }

    /**
     * @param outJson
     */
    public void setOutJson(String outJson) {
        this.outJson = outJson == null ? null : outJson.trim();
    }
}