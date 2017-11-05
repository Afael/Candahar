package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * ProSitePrice generated by hbm2java
 */
@Entity
@Table(name="ProSitePrice"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class ProSitePrice  implements java.io.Serializable {


     private String proSitePriceId;
     private ProSiteInstalled proSiteInstalled;
     private String priceTypeId;
     private BigDecimal firstPrice;
     private BigDecimal secondPrice;
     private Boolean isExists;
     private Integer createdBy;
     private Date createdDate;
     private Integer modifiedBy;
     private Date modifiedDate;

    public ProSitePrice() {
    }

	
    public ProSitePrice(String proSitePriceId, ProSiteInstalled proSiteInstalled) {
        this.proSitePriceId = proSitePriceId;
        this.proSiteInstalled = proSiteInstalled;
    }
    public ProSitePrice(String proSitePriceId, ProSiteInstalled proSiteInstalled, String priceTypeId, BigDecimal firstPrice, BigDecimal secondPrice, Boolean isExists, Integer createdBy, Date createdDate, Integer modifiedBy, Date modifiedDate) {
       this.proSitePriceId = proSitePriceId;
       this.proSiteInstalled = proSiteInstalled;
       this.priceTypeId = priceTypeId;
       this.firstPrice = firstPrice;
       this.secondPrice = secondPrice;
       this.isExists = isExists;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
    }
   
     @Id 

    
    @Column(name="ProSitePriceId", unique=true, nullable=false, length=45)
    public String getProSitePriceId() {
        return this.proSitePriceId;
    }
    
    public void setProSitePriceId(String proSitePriceId) {
        this.proSitePriceId = proSitePriceId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SiteInstalledId", nullable=false)
    public ProSiteInstalled getProSiteInstalled() {
        return this.proSiteInstalled;
    }
    
    public void setProSiteInstalled(ProSiteInstalled proSiteInstalled) {
        this.proSiteInstalled = proSiteInstalled;
    }

    
    @Column(name="PriceTypeId", length=40)
    public String getPriceTypeId() {
        return this.priceTypeId;
    }
    
    public void setPriceTypeId(String priceTypeId) {
        this.priceTypeId = priceTypeId;
    }

    
    @Column(name="FirstPrice", scale=4)
    public BigDecimal getFirstPrice() {
        return this.firstPrice;
    }
    
    public void setFirstPrice(BigDecimal firstPrice) {
        this.firstPrice = firstPrice;
    }

    
    @Column(name="SecondPrice", scale=4)
    public BigDecimal getSecondPrice() {
        return this.secondPrice;
    }
    
    public void setSecondPrice(BigDecimal secondPrice) {
        this.secondPrice = secondPrice;
    }

    
    @Column(name="IsExists")
    public Boolean getIsExists() {
        return this.isExists;
    }
    
    public void setIsExists(Boolean isExists) {
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

    
    @Column(name="ModifiedBy")
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
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

