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
 * TmModule generated by hbm2java
 */
@Entity
@Table(name="TmModule"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class TmModule  implements java.io.Serializable {


     private String idModule;
     private String parentModule;
     private String moduleDesc;
     private String moduleRef;
     private String url;
     private String moduleUrl;
     private Integer ordering;
     private char existence;
     private String moduleIcons;
     private Date createdDate;
     private String createdBy;
     private Date modifyDate;
     private String modifyBy;

    public TmModule() {
    }

	
    public TmModule(String idModule, String moduleDesc, String moduleRef, char existence) {
        this.idModule = idModule;
        this.moduleDesc = moduleDesc;
        this.moduleRef = moduleRef;
        this.existence = existence;
    }
    public TmModule(String idModule, String parentModule, String moduleDesc, String moduleRef, String url, String moduleUrl, Integer ordering, char existence, String moduleIcons, Date createdDate, String createdBy, Date modifyDate, String modifyBy) {
       this.idModule = idModule;
       this.parentModule = parentModule;
       this.moduleDesc = moduleDesc;
       this.moduleRef = moduleRef;
       this.url = url;
       this.moduleUrl = moduleUrl;
       this.ordering = ordering;
       this.existence = existence;
       this.moduleIcons = moduleIcons;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.modifyDate = modifyDate;
       this.modifyBy = modifyBy;
    }
   
     @Id 

    
    @Column(name="id_module", unique=true, nullable=false, length=5)
    public String getIdModule() {
        return this.idModule;
    }
    
    public void setIdModule(String idModule) {
        this.idModule = idModule;
    }

    
    @Column(name="parent_module", length=5)
    public String getParentModule() {
        return this.parentModule;
    }
    
    public void setParentModule(String parentModule) {
        this.parentModule = parentModule;
    }

    
    @Column(name="module_Desc", nullable=false, length=50)
    public String getModuleDesc() {
        return this.moduleDesc;
    }
    
    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

    
    @Column(name="module_ref", nullable=false, length=10)
    public String getModuleRef() {
        return this.moduleRef;
    }
    
    public void setModuleRef(String moduleRef) {
        this.moduleRef = moduleRef;
    }

    
    @Column(name="url", length=100)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    
    @Column(name="module_url", length=200)
    public String getModuleUrl() {
        return this.moduleUrl;
    }
    
    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    
    @Column(name="ordering")
    public Integer getOrdering() {
        return this.ordering;
    }
    
    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    
    @Column(name="existence", nullable=false, length=1)
    public char getExistence() {
        return this.existence;
    }
    
    public void setExistence(char existence) {
        this.existence = existence;
    }

    
    @Column(name="module_icons", length=100)
    public String getModuleIcons() {
        return this.moduleIcons;
    }
    
    public void setModuleIcons(String moduleIcons) {
        this.moduleIcons = moduleIcons;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_date", length=16)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    @Column(name="created_by", length=10)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modify_date", length=16)
    public Date getModifyDate() {
        return this.modifyDate;
    }
    
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    
    @Column(name="modify_by", length=10)
    public String getModifyBy() {
        return this.modifyBy;
    }
    
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }




}


