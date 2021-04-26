package com.enkorona.quafoo.entity.domain;


import java.time.LocalDateTime;

public class QuafooBaseDomain {
    /**
     * 雪花算法生成的ID
     */
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人ID
     */
    private Long updateUserId;

    @Override
    public String toString() {
        return "QuafooBaseDomain{" +
                "id='" + id + '\'' +
                ", version=" + version +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", updateTime=" + updateTime +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }
}
