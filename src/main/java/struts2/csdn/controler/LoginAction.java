package struts2.csdn.controler;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

    //两个属性名跟Login.jsp的form属性的name一样；这样struts2框架就会自动复制。
    private String username;
    private String pwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String execute() throws Exception {
        String forword=null;
        if(username.equals("Hitvz")&&pwd.equals("123456")){
            forword=ActionSupport.SUCCESS;
        }else{
            forword=ActionSupport.INPUT;
        }
        return forword;
    }
}
