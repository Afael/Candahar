package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LoDeliveryOrder generated by hbm2java
 */
@Entity
@Table(name="LoDeliveryOrder"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class LoDeliveryOrder  implements java.io.Serializable {


     private String loDeliveryOrderId;
     private LoMaterialInbound loMaterialInbound;
     private TransactionHeader transactionHeader;
     private String materialGroupId;
     private String materialTypeId;
     private Boolean isExists;
     private String createdBy;
     private Date createdDate;

    public LoDeliveryOrder() {
    }

	
    public LoDeliveryOrder(String loDeliveryOrderId, LoMaterialInbound loMaterialInbound, TransactionHeader transactionHeader, String materialGroupId, String materialTypeId) {
        this.loDeliveryOrderId = loDeliveryOrderId;
        this.loMaterialInbound = loMaterialInbound;
        this.transactionHeader = transactionHeader;
        this.materialGroupId = materialGroupId;
        this.materialTypeId = materialTypeId;
    }
    public LoDeliveryOrder(String loDeliveryOrderId, LoMaterialInbound loMaterialInbound, TransactionHeader transactionHeader, String materialGroupId, String materialTypeId, Boolean isExists, String createdBy, Date createdDate) {
       this.loDeliveryOrderId = loDeliveryOrderId;
       this.loMaterialInbound = loMaterialInbound;
       this.transactionHeader = transactionHeader;
       this.materialGroupId = materialGroupId;
       this.materialTypeId = materialTypeId;
       this.isExists = isExists;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
    }
   
     @Id 

    
    @Column(name="LoDeliveryOrderId", unique=true, nullable=false, length=40)
    public String getLoDeliveryOrderId() {
        return this.loDeliveryOrderId;
    }
    
    public void setLoDeliveryOrderId(String loDeliveryOrderId) {
        this.loDeliveryOrderId = loDeliveryOrderId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MaterialSerialNumber", nullable=false)
    public LoMaterialInbound getLoMaterialInbound() {
        return this.loMaterialInbound;
    }
    
    public void setLoMaterialInbound(LoMaterialInbound loMaterialInbound) {
        this.loMaterialInbound = loMaterialInbound;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MainFormId", nullable=false)
    public TransactionHeader getTransactionHeader() {
        return this.transactionHeader;
    }
    
    public void setTransactionHeader(TransactionHeader transactionHeader) {
        this.transactionHeader = transactionHeader;
    }

    
    @Column(name="MaterialGroupId", nullable=false, length=40)
    public String getMaterialGroupId() {
        return this.materialGroupId;
    }
    
    public void setMaterialGroupId(String materialGroupId) {
        this.materialGroupId = materialGroupId;
    }

    
    @Column(name="MaterialTypeId", nullable=false, length=40)
    public String getMaterialTypeId() {
        return this.materialTypeId;
    }
    
    public void setMaterialTypeId(String materialTypeId) {
        this.materialTypeId = materialTypeId;
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




}

