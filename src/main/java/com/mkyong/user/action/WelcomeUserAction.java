package com.mkyong.user.action;

public class WelcomeUserAction{

	private String username;
    private Boolean keep;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
	 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

    public Boolean getKeep() {
        return keep;
    }

    public void setKeep(Boolean keep) {
        this.keep = keep;
    }

    // all struts logic here
	public String execute() {
        System.out.println(this.password);
        System.out.println(this.username);
        System.out.println(this.keep);
        return "SUCCESS";

	}
}