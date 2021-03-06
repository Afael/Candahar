package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SyCompany generated by hbm2java
 */
@Entity
@Table(name="SyCompany"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class SyCompany  implements java.io.Serializable {


     private String companyId;
     private String parentId;
     private String companyName;
     private String companyTagline;
     private String companyAddress;
     private String companyCountryId;
     private String companyStateId;
     private String companyCityId;
     private String companyZip;
     private String companyRegister;
     private String companyTaxId;
     private String companyEmail;
     private String companyWebsite;
     private String companyPhone;
     private String companyFax;
     private String companyRemark;
     private String companyAs;
     private Boolean isDelete;
     private Date createdDate;
     private String createdBy;
     private Date modifiedDate;
     private String modifiedBy;
     private Set loMaterialInbounds = new HashSet(0);

    public SyCompany() {
    }

	
    public SyCompany(String companyId) {
        this.companyId = companyId;
    }
    public SyCompany(String companyId, String parentId, String companyName, String companyTagline, String companyAddress, String companyCountryId, String companyStateId, String companyCityId, String companyZip, String companyRegister, String companyTaxId, String companyEmail, String companyWebsite, String companyPhone, String companyFax, String companyRemark, String companyAs, Boolean isDelete, Date createdDate, String createdBy, Date modifiedDate, String modifiedBy, Set loMaterialInbounds) {
       this.companyId = companyId;
       this.parentId = parentId;
       this.companyName = companyName;
       this.companyTagline = companyTagline;
       this.companyAddress = companyAddress;
       this.companyCountryId = companyCountryId;
       this.companyStateId = companyStateId;
       this.companyCityId = companyCityId;
       this.companyZip = companyZip;
       this.companyRegister = companyRegister;
       this.companyTaxId = companyTaxId;
       this.companyEmail = companyEmail;
       this.companyWebsite = companyWebsite;
       this.companyPhone = companyPhone;
       this.companyFax = companyFax;
       this.companyRemark = companyRemark;
       this.companyAs = companyAs;
       this.isDelete = isDelete;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.modifiedDate = modifiedDate;
       this.modifiedBy = modifiedBy;
       this.loMaterialInbounds = loMaterialInbounds;
    }
   
     @Id 

    
    @Column(name="CompanyId", unique=true, nullable=false, length=15)
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    
    @Column(name="ParentId", length=15)
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    
    @Column(name="CompanyName", length=200)
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    @Column(name="CompanyTagline", length=200)
    public String getCompanyTagline() {
        return this.companyTagline;
    }
    
    public void setCompanyTagline(String companyTagline) {
        this.companyTagline = companyTagline;
    }

    
    @Column(name="CompanyAddress", length=250)
    public String getCompanyAddress() {
        return this.companyAddress;
    }
    
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    
    @Column(name="CompanyCountryId", length=6)
    public String getCompanyCountryId() {
        return this.companyCountryId;
    }
    
    public void setCompanyCountryId(String companyCountryId) {
        this.companyCountryId = companyCountryId;
    }

    
    @Column(name="CompanyStateId", length=10)
    public String getCompanyStateId() {
        return this.companyStateId;
    }
    
    public void setCompanyStateId(String companyStateId) {
        this.companyStateId = companyStateId;
    }

    
    @Column(name="CompanyCityId", length=16)
    public String getCompanyCityId() {
        return this.companyCityId;
    }
    
    public void setCompanyCityId(String companyCityId) {
        this.companyCityId = companyCityId;
    }

    
    @Column(name="CompanyZip", length=5)
    public String getCompanyZip() {
        return this.companyZip;
    }
    
    public void setCompanyZip(String companyZip) {
        this.companyZip = companyZip;
    }

    
    @Column(name="CompanyRegister", length=40)
    public String getCompanyRegister() {
        return this.companyRegister;
    }
    
    public void setCompanyRegister(String companyRegister) {
        this.companyRegister = companyRegister;
    }

    
    @Column(name="CompanyTaxId", length=40)
    public String getCompanyTaxId() {
        return this.companyTaxId;
    }
    
    public void setCompanyTaxId(String companyTaxId) {
        this.companyTaxId = companyTaxId;
    }

    
    @Column(name="CompanyEmail", length=100)
    public String getCompanyEmail() {
        return this.companyEmail;
    }
    
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    
    @Column(name="CompanyWebsite", length=200)
    public String getCompanyWebsite() {
        return this.companyWebsite;
    }
    
    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    
    @Column(name="CompanyPhone", length=200)
    public String getCompanyPhone() {
        return this.companyPhone;
    }
    
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    
    @Column(name="CompanyFax", length=200)
    public String getCompanyFax() {
        return this.companyFax;
    }
    
    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    
    @Column(name="CompanyRemark", length=40)
    public String getCompanyRemark() {
        return this.companyRemark;
    }
    
    public void setCompanyRemark(String companyRemark) {
        this.companyRemark = companyRemark;
    }

    
    @Column(name="CompanyAs", length=40)
    public String getCompanyAs() {
        return this.companyAs;
    }
    
    public void setCompanyAs(String companyAs) {
        this.companyAs = companyAs;
    }

    
    @Column(name="IsDelete")
    public Boolean getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreatedDate", length=23)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    @Column(name="CreatedBy", length=20)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ModifiedDate", length=23)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    @Column(name="ModifiedBy", length=20)
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="syCompany")
    public Set getLoMaterialInbounds() {
        return this.loMaterialInbounds;
    }
    
    public void setLoMaterialInbounds(Set loMaterialInbounds) {
        this.loMaterialInbounds = loMaterialInbounds;
    }




}


