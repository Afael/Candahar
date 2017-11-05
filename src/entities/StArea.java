package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * StArea generated by hbm2java
 */
@Entity
@Table(name="StArea"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class StArea  implements java.io.Serializable {


     private String areaId;
     private StRegion stRegion;
     private String areaName;
     private Boolean isExists;
     private String createdBy;
     private Date createdDate;
     private String modifiedBy;
     private Date modifiedDate;
     private Set stSalesBoqs = new HashSet(0);

    public StArea() {
    }

	
    public StArea(String areaId, StRegion stRegion) {
        this.areaId = areaId;
        this.stRegion = stRegion;
    }
    public StArea(String areaId, StRegion stRegion, String areaName, Boolean isExists, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate, Set stSalesBoqs) {
       this.areaId = areaId;
       this.stRegion = stRegion;
       this.areaName = areaName;
       this.isExists = isExists;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
       this.stSalesBoqs = stSalesBoqs;
    }
   
     @Id 

    
    @Column(name="AreaId", unique=true, nullable=false, length=20)
    public String getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RegionId", nullable=false)
    public StRegion getStRegion() {
        return this.stRegion;
    }
    
    public void setStRegion(StRegion stRegion) {
        this.stRegion = stRegion;
    }

    
    @Column(name="AreaName", length=100)
    public String getAreaName() {
        return this.areaName;
    }
    
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    
    @Column(name="IsExists")
    public Boolean getIsExists() {
        return this.isExists;
    }
    
    public void setIsExists(Boolean isExists) {
        this.isExists = isExists;
    }

    
    @Column(name="CreatedBy", length=20)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
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

    
    @Column(name="ModifiedBy", length=20)
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ModifiedDate", length=23)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="stArea")
    public Set getStSalesBoqs() {
        return this.stSalesBoqs;
    }
    
    public void setStSalesBoqs(Set stSalesBoqs) {
        this.stSalesBoqs = stSalesBoqs;
    }




}

