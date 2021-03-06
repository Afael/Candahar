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
 * StSite generated by hbm2java
 */
@Entity
@Table(name="StSite"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class StSite  implements java.io.Serializable {


     private String slsiteId;
     private String slprojectId;
     private String slsiteName;
     private Boolean isExists;
     private String productId;
     private String createdBy;
     private Date createdDate;
     private String modifiedBy;
     private Date modifiedDate;

    public StSite() {
    }

	
    public StSite(String slsiteId) {
        this.slsiteId = slsiteId;
    }
    public StSite(String slsiteId, String slprojectId, String slsiteName, Boolean isExists, String productId, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
       this.slsiteId = slsiteId;
       this.slprojectId = slprojectId;
       this.slsiteName = slsiteName;
       this.isExists = isExists;
       this.productId = productId;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
    }
   
     @Id 

    
    @Column(name="SLSiteId", unique=true, nullable=false, length=40)
    public String getSlsiteId() {
        return this.slsiteId;
    }
    
    public void setSlsiteId(String slsiteId) {
        this.slsiteId = slsiteId;
    }

    
    @Column(name="SLProjectId", length=40)
    public String getSlprojectId() {
        return this.slprojectId;
    }
    
    public void setSlprojectId(String slprojectId) {
        this.slprojectId = slprojectId;
    }

    
    @Column(name="SLSiteName", length=100)
    public String getSlsiteName() {
        return this.slsiteName;
    }
    
    public void setSlsiteName(String slsiteName) {
        this.slsiteName = slsiteName;
    }

    
    @Column(name="IsExists")
    public Boolean getIsExists() {
        return this.isExists;
    }
    
    public void setIsExists(Boolean isExists) {
        this.isExists = isExists;
    }

    
    @Column(name="ProductId", length=40)
    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
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




}


