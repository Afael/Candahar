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
 * OldStProject generated by hbm2java
 */
@Entity
@Table(name="Old_StProject"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class OldStProject  implements java.io.Serializable {


     private String slprojectId;
     private StCustomerPo stCustomerPo;
     private String slscopeOfWork;
     private Boolean isExists;
     private String productId;
     private String createdBy;
     private Date createdDate;

    public OldStProject() {
    }

	
    public OldStProject(String slprojectId, StCustomerPo stCustomerPo) {
        this.slprojectId = slprojectId;
        this.stCustomerPo = stCustomerPo;
    }
    public OldStProject(String slprojectId, StCustomerPo stCustomerPo, String slscopeOfWork, Boolean isExists, String productId, String createdBy, Date createdDate) {
       this.slprojectId = slprojectId;
       this.stCustomerPo = stCustomerPo;
       this.slscopeOfWork = slscopeOfWork;
       this.isExists = isExists;
       this.productId = productId;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
    }
   
     @Id 

    
    @Column(name="SLProjectId", unique=true, nullable=false, length=40)
    public String getSlprojectId() {
        return this.slprojectId;
    }
    
    public void setSlprojectId(String slprojectId) {
        this.slprojectId = slprojectId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SLPONumber", nullable=false)
    public StCustomerPo getStCustomerPo() {
        return this.stCustomerPo;
    }
    
    public void setStCustomerPo(StCustomerPo stCustomerPo) {
        this.stCustomerPo = stCustomerPo;
    }

    
    @Column(name="SLScopeOfWork", length=100)
    public String getSlscopeOfWork() {
        return this.slscopeOfWork;
    }
    
    public void setSlscopeOfWork(String slscopeOfWork) {
        this.slscopeOfWork = slscopeOfWork;
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




}


