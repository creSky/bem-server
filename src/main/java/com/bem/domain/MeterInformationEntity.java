/**
 * Author : czy
 * Date : 2019年7月8日 下午4:10:35
 * Title : com.riozenc.billing.webapp.domain.MeterDomain.java
 *
**/
package com.bem.domain;

import java.util.List;

public class MeterInformationEntity  extends AppMeterInfo{

    //前台展示
    private String showName1;
    private String showName2;
    private String showName3;
    private String showName4;
	private String parent;
    private List<TransformerInfoEntity> transformerInfos;
	public String getShowName1() {
		return showName1;
	}

	public void setShowName1(String showName1) {
		this.showName1 = showName1;
	}

	public String getShowName2() {
		return showName2;
	}

	public void setShowName2(String showName2) {
		this.showName2 = showName2;
	}

	public String getShowName3() {
		return showName3;
	}

	public void setShowName3(String showName3) {
		this.showName3 = showName3;
	}

	public String getShowName4() {
		return showName4;
	}

	public void setShowName4(String showName4) {
		this.showName4 = showName4;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public List<TransformerInfoEntity> getTransformerInfos() {
		return transformerInfos;
	}

	public void setTransformerInfos(List<TransformerInfoEntity> transformerInfos) {
		this.transformerInfos = transformerInfos;
	}
}
