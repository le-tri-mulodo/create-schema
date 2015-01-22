/**
 * 
 */
package com.mulodo.miniblog.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.ForeignKey;

/**
 * @author TriLe
 *
 */
@Entity
@Table(name = "_comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "edit_time")
    private Timestamp editTime;

    @Column(name = "content", length = 256)
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    @ForeignKey(name="fk_comments_users")
    private User user;

    @ManyToOne
    @JoinColumn(name = "partner_id", referencedColumnName = "id", nullable = false)
    @ForeignKey(name="fk_comments_posts")
    private Post partner;

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
     * @return the partner
     */
    public Post getPartner() {
	return partner;
    }

    /**
     * @param partner
     *            the partner to set
     */
    public void setPartner(Post partner) {
	this.partner = partner;
    }
}
