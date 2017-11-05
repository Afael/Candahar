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
 * LogMaterialType generated by hbm2java
 */
@Entity
@Table(name="LogMaterialType"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class LogMaterialType  implements java.io.Serializable {


     private String logMaterialTypeId;
     private LogMaterialGroup logMaterialGroup;
     private String iscalaStockCode;
     private String materialTypeName;
     private String isExists;
     private Integer createdBy;
     private Date createdDate;
     private Set logInbounds = new HashSet(0);

    public LogMaterialType() {
    }

	
    public LogMaterialType(String logMaterialTypeId, LogMaterialGroup logMaterialGroup) {
        this.logMaterialTypeId = logMaterialTypeId;
        this.logMaterialGroup = logMaterialGroup;
    }
    public LogMaterialType(String logMaterialTypeId, LogMaterialGroup logMaterialGroup, String iscalaStockCode, String materialTypeName, String isExists, Integer createdBy, Date createdDate, Set logInbounds) {
       this.logMaterialTypeId = logMaterialTypeId;
       this.logMaterialGroup = logMaterialGroup;
       this.iscalaStockCode = iscalaStockCode;
       this.materialTypeName = materialTypeName;
       this.isExists = isExists;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.logInbounds = logInbounds;
    }
   
     @Id 

    
    @Column(name="LogMaterialTypeId", unique=true, nullable=false, length=40)
    public String getLogMaterialTypeId() {
        return this.logMaterialTypeId;
    }
    
    public void setLogMaterialTypeId(String logMaterialTypeId) {
        this.logMaterialTypeId = logMaterialTypeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LogMaterialGroupId", nullable=false)
    public LogMaterialGroup getLogMaterialGroup() {
        return this.logMaterialGroup;
    }
    
    public void setLogMaterialGroup(LogMaterialGroup logMaterialGroup) {
        this.logMaterialGroup = logMaterialGroup;
    }

    
    @Column(name="iScalaStockCode", length=10)
    public String getIscalaStockCode() {
        return this.iscalaStockCode;
    }
    
    public void setIscalaStockCode(String iscalaStockCode) {
        this.iscalaStockCode = iscalaStockCode;
    }

    
    @Column(name="MaterialTypeName", length=100)
    public String getMaterialTypeName() {
        return this.materialTypeName;
    }
    
    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName;
    }

    
    @Column(name="IsExists", length=40)
    public String getIsExists() {
        return this.isExists;
    }
    
    public void setIsExists(String isExists) {
        this.isExists = isExists;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="logMaterialType")
    public Set getLogInbounds() {
        return this.logInbounds;
    }
    
    public void setLogInbounds(Set logInbounds) {
        this.logInbounds = logInbounds;
    }




}

