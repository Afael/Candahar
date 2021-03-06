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
 * SyUsersLogs generated by hbm2java
 */
@Entity
@Table(name="SyUsersLogs"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class SyUsersLogs  implements java.io.Serializable {


     private String userLogsId;
     private String userId;
     private String usrFullName;
     private String loginFrom;
     private String loginTo;
     private String queryString;
     private String pageTitle;
     private String userAgent;
     private Date createdDate;

    public SyUsersLogs() {
    }

    public SyUsersLogs(String userLogsId, String userId, String usrFullName, String loginFrom, String loginTo, String queryString, String pageTitle, String userAgent, Date createdDate) {
       this.userLogsId = userLogsId;
       this.userId = userId;
       this.usrFullName = usrFullName;
       this.loginFrom = loginFrom;
       this.loginTo = loginTo;
       this.queryString = queryString;
       this.pageTitle = pageTitle;
       this.userAgent = userAgent;
       this.createdDate = createdDate;
    }
   
     @Id 

    
    @Column(name="UserLogsId", unique=true, nullable=false, length=36)
    public String getUserLogsId() {
        return this.userLogsId;
    }
    
    public void setUserLogsId(String userLogsId) {
        this.userLogsId = userLogsId;
    }

    
    @Column(name="UserId", nullable=false, length=100)
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    
    @Column(name="UsrFullName", nullable=false, length=100)
    public String getUsrFullName() {
        return this.usrFullName;
    }
    
    public void setUsrFullName(String usrFullName) {
        this.usrFullName = usrFullName;
    }

    
    @Column(name="LoginFrom", nullable=false, length=100)
    public String getLoginFrom() {
        return this.loginFrom;
    }
    
    public void setLoginFrom(String loginFrom) {
        this.loginFrom = loginFrom;
    }

    
    @Column(name="LoginTo", nullable=false, length=100)
    public String getLoginTo() {
        return this.loginTo;
    }
    
    public void setLoginTo(String loginTo) {
        this.loginTo = loginTo;
    }

    
    @Column(name="QueryString", nullable=false)
    public String getQueryString() {
        return this.queryString;
    }
    
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    
    @Column(name="PageTitle", nullable=false)
    public String getPageTitle() {
        return this.pageTitle;
    }
    
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    
    @Column(name="UserAgent", nullable=false)
    public String getUserAgent() {
        return this.userAgent;
    }
    
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreatedDate", nullable=false, length=23)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }




}


