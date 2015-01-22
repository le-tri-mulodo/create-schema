package com.mulodo.miniblog.pojo;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "_posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "edit_time")
    private Timestamp editTime;

    @Column(name = "description", length = 50)
    private String description;

    @Column(name = "content", length = 1024)
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @Cascade(CascadeType.SAVE_UPDATE)
    private User user;

    @OneToMany(mappedBy = "partner")
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<Comment> partners;

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the createTime
     */
    public Timestamp getCreateTime() {
	return createTime;
    }

    /**
     * @param createTime
     *            the createTime to set
     */
    public void setCreateTime(Timestamp createTime) {
	this.createTime = createTime;
    }

    /**
     * @return the editTime
     */
    public Timestamp getEditTime() {
	return editTime;
    }

    /**
     * @param editTime
     *            the editTime to set
     */
    public void setEditTime(Timestamp editTime) {
	this.editTime = editTime;
    }

    /**
     * @return the description
     */
    public String getDescription() {
	return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
	this.description = description;
    }

    /**
     * @return the content
     */
    public String getContent() {
	return content;
    }

    /**
     * @param content
     *            the content to set
     */
    public void setContent(String content) {
	this.content = content;
    }

    /**
     * @return the user
     */
    public User getUser() {
	return user;
    }

    /**
     * @param user
     *            the user to set
     */
    public void setUser(User user) {
	this.user = user;
    }

    /**
     * @return the partners
     */
    public Set<Comment> getPartners() {
	return partners;
    }

    /**
     * @param partners
     *            the partners to set
     */
    public void setPartners(Set<Comment> partners) {
	this.partners = partners;
    }
}
