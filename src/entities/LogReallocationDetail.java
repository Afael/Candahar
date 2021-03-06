package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LogReallocationDetail generated by hbm2java
 */
@Entity
@Table(name="LogReallocationDetail"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class LogReallocationDetail  implements java.io.Serializable {


     private String logReallocationDetailId;
     private String logReallocationId;
     private String orgLogDeliveryNoteDetailId;
     private String orgLogDeliveryRequestDetailId;
     private String orgLogMaterialTaggingDetailId;
     private String slboqid;
     private String materialSerialNumber;
     private String parentSerialNumber;
     private String regionId;
     private String areaId;
     private String siteId;
     private String taggingStatusId;
     private Integer createdBy;
     private Date createdDate;

    public LogReallocationDetail() {
    }

	
    public LogReallocationDetail(String logReallocationDetailId, String logReallocationId, String slboqid, String materialSerialNumber) {
        this.logReallocationDetailId = logReallocationDetailId;
        this.logReallocationId = logReallocationId;
        this.slboqid = slboqid;
        this.materialSerialNumber = materialSerialNumber;
    }
    public LogReallocationDetail(String logReallocationDetailId, String logReallocationId, String orgLogDeliveryNoteDetailId, String orgLogDeliveryRequestDetailId, String orgLogMaterialTaggingDetailId, String slboqid, String materialSerialNumber, String parentSerialNumber, String regionId, String areaId, String siteId, String taggingStatusId, Integer createdBy, Date createdDate) {
       this.logReallocationDetailId = logReallocationDetailId;
       this.logReallocationId = logReallocationId;
       this.orgLogDeliveryNoteDetailId = orgLogDeliveryNoteDetailId;
       this.orgLogDeliveryRequestDetailId = orgLogDeliveryRequestDetailId;
       this.orgLogMaterialTaggingDetailId = orgLogMaterialTaggingDetailId;
       this.slboqid = slboqid;
       this.materialSerialNumber = materialSerialNumber;
       this.parentSerialNumber = parentSerialNumber;
       this.regionId = regionId;
       this.areaId = areaId;
       this.siteId = siteId;
       this.taggingStatusId = taggingStatusId;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
    }
   
     @Id 

    
    @Column(name="LogReallocationDetailId", unique=true, nullable=false, length=36)
    public String getLogReallocationDetailId() {
        return this.logReallocationDetailId;
    }
    
    public void setLogReallocationDetailId(String logReallocationDetailId) {
        this.logReallocationDetailId = logReallocationDetailId;
    }

    
    @Column(name="LogReallocationId", nullable=false, length=30)
    public String getLogReallocationId() {
        return this.logReallocationId;
    }
    
    public void setLogReallocationId(String logReallocationId) {
        this.logReallocationId = logReallocationId;
    }

    
    @Column(name="OrgLogDeliveryNoteDetailId", length=36)
    public String getOrgLogDeliveryNoteDetailId() {
        return this.orgLogDeliveryNoteDetailId;
    }
    
    public void setOrgLogDeliveryNoteDetailId(String orgLogDeliveryNoteDetailId) {
        this.orgLogDeliveryNoteDetailId = orgLogDeliveryNoteDetailId;
    }

    
    @Column(name="OrgLogDeliveryRequestDetailId", length=36)
    public String getOrgLogDeliveryRequestDetailId() {
        return this.orgLogDeliveryRequestDetailId;
    }
    
    public void setOrgLogDeliveryRequestDetailId(String orgLogDeliveryRequestDetailId) {
        this.orgLogDeliveryRequestDetailId = orgLogDeliveryRequestDetailId;
    }

    
    @Column(name="OrgLogMaterialTaggingDetailId", length=36)
    public String getOrgLogMaterialTaggingDetailId() {
        return this.orgLogMaterialTaggingDetailId;
    }
    
    public void setOrgLogMaterialTaggingDetailId(String orgLogMaterialTaggingDetailId) {
        this.orgLogMaterialTaggingDetailId = orgLogMaterialTaggingDetailId;
    }

    
    @Column(name="SLBOQId", nullable=false, length=36)
    public String getSlboqid() {
        return this.slboqid;
    }
    
    public void setSlboqid(String slboqid) {
        this.slboqid = slboqid;
    }

    
    @Column(name="MaterialSerialNumber", nullable=false, length=40)
    public String getMaterialSerialNumber() {
        return this.materialSerialNumber;
    }
    
    public void setMaterialSerialNumber(String materialSerialNumber) {
        this.materialSerialNumber = materialSerialNumber;
    }

    
    @Column(name="ParentSerialNumber", length=40)
    public String getParentSerialNumber() {
        return this.parentSerialNumber;
    }
    
    public void setParentSerialNumber(String parentSerialNumber) {
        this.parentSerialNumber = parentSerialNumber;
    }

    
    @Column(name="RegionId", length=40)
    public String getRegionId() {
        return this.regionId;
    }
    
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    
    @Column(name="AreaId", length=40)
    public String getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    
    @Column(name="SiteId", length=40)
    public String getSiteId() {
        return this.siteId;
    }
    
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    
    @Column(name="TaggingStatusId", length=40)
    public String getTaggingStatusId() {
        return this.taggingStatusId;
    }
    
    public void setTaggingStatusId(String taggingStatusId) {
        this.taggingStatusId = taggingStatusId;
    }

    
    @Column(name="CreatedBy")
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreatedDate", length=23)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }




}


