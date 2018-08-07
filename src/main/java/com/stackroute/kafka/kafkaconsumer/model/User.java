package com.stackroute.kafka.kafkaconsumer.model;

public class User {

    private String skills_userId;
    private String skills;
	public String getSkills_userId() {
		return skills_userId;
	}
	public void setSkills_userId(String skills_userId) {
		this.skills_userId = skills_userId;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public User() {
		super();
	}
	public User(String skills_userId, String skills) {
		super();
		this.skills_userId = skills_userId;
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "User [skills_userId=" + skills_userId + ", skills=" + skills + "]";
	}
}