package com.cxytiandi.sharding.po;

/**
 * @author guanzhisong
 * @date 2020-10-28 19:24:54
 */
public class RegionConfig implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Integer id;

    /**
     * 区域code码
     */
    private String regionCode;

    /**
     * 区域名
     */
    private String regionName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }
}