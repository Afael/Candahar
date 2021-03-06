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
 * LoMaterialType generated by hbm2java
 */
@Entity
@Table(name="LoMaterialType"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class LoMaterialType  implements java.io.Serializable {


     private String materialTypeId;
     private LoMaterialGroup loMaterialGroup;
     private String iscalaStockCode;
     private String materialTypeName;
     private Boolean isRequiredEmbossed;
     private String isExists;
     private String createdBy;
     private Date createdDate;
     private Set loDeliveryRequests = new HashSet(0);
     private Set oldTransactionDetails = new HashSet(0);
     private Set loDeliveryNotes = new HashSet(0);
     private Set loMaterialInbounds = new HashSet(0);

    public LoMaterialType() {
    }

	
    public LoMaterialType(String materialTypeId, LoMaterialGroup loMaterialGroup) {
        this.materialTypeId = materialTypeId;
        this.loMaterialGroup = loMaterialGroup;
    }
    public LoMaterialType(String materialTypeId, LoMaterialGroup loMaterialGroup, String iscalaStockCode, String materialTypeName, Boolean isRequiredEmbossed, String isExists, String createdBy, Date createdDate, Set loDeliveryRequests, Set oldTransactionDetails, Set loDeliveryNotes, Set loMaterialInbounds) {
       this.materialTypeId = materialTypeId;
       this.loMaterialGroup = loMaterialGroup;
       this.iscalaStockCode = iscalaStockCode;
       this.materialTypeName = materialTypeName;
       this.isRequiredEmbossed = isRequiredEmbossed;
       this.isExists = isExists;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.loDeliveryRequests = loDeliveryRequests;
       this.oldTransactionDetails = oldTransactionDetails;
       this.loDeliveryNotes = loDeliveryNotes;
       this.loMaterialInbounds = loMaterialInbounds;
    }
   
     @Id 

    
    @Column(name="MaterialTypeId", unique=true, nullable=false, length=40)
    public String getMaterialTypeId() {
        return this.materialTypeId;
    }
    
    public void setMaterialTypeId(String materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaterialGroupId", nullable=false)
    public LoMaterialGroup getLoMaterialGroup() {
        return this.loMaterialGroup;
    }
    
    public void setLoMaterialGroup(LoMaterialGroup loMaterialGroup) {
        this.loMaterialGroup = loMaterialGroup;
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

    
    @Column(name="IsRequiredEmbossed")
    public Boolean getIsRequiredEmbossed() {
        return this.isRequiredEmbossed;
    }
    
    public void setIsRequiredEmbossed(Boolean isRequiredEmbossed) {
        this.isRequiredEmbossed = isRequiredEmbossed;
    }

    
    @Column(name="IsExists", length=40)
    public String getIsExists() {
        return this.isExists;
    }
    
    public void setIsExists(String isExists) {
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="loMaterialType")
    public Set getLoDeliveryRequests() {
        return this.loDeliveryRequests;
    }
    
    public void setLoDeliveryRequests(Set loDeliveryRequests) {
        this.loDeliveryRequests = loDeliveryRequests;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loMaterialType")
    public Set getOldTransactionDetails() {
        return this.oldTransactionDetails;
    }
    
    public void setOldTransactionDetails(Set oldTransactionDetails) {
        this.oldTransactionDetails = oldTransactionDetails;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loMaterialType")
    public Set getLoDeliveryNotes() {
        return this.loDeliveryNotes;
    }
    
    public void setLoDeliveryNotes(Set loDeliveryNotes) {
        this.loDeliveryNotes = loDeliveryNotes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loMaterialType")
    public Set getLoMaterialInbounds() {
        return this.loMaterialInbounds;
    }
    
    public void setLoMaterialInbounds(Set loMaterialInbounds) {
        this.loMaterialInbounds = loMaterialInbounds;
    }




}


