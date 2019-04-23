package com.bem.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：zjd
 * @date ：Created in 2019/3/1 10:06
 * @modified By：
 * 现场勘查树
 *
 */
public class SiteSurveyTree {
    private String title;
    private boolean expand;
    private String id;
    private String loadChangeSign;
    private String sn;
    private String pId;
    private String siteSurveyType;
    private List<SiteSurveyTree> children;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoadChangeSign() {
        return loadChangeSign;
    }

    public void setLoadChangeSign(String loadChangeSign) {
        this.loadChangeSign = loadChangeSign;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public List<SiteSurveyTree> getChildren() {
            return children;
    }

    public void setChildren(List<SiteSurveyTree> children) {
        if(null==this.children){
            this.children=new ArrayList<>();
        }
        this.children.addAll(children);
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getSiteSurveyType() {
        return siteSurveyType;
    }

    public void setSiteSurveyType(String siteSurveyType) {
        this.siteSurveyType = siteSurveyType;
    }

}
