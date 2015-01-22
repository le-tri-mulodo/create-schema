package com.mulodo.miniblog.pojo;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "_status")
@Inheritance(strategy = InheritanceType.JOINED)
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "create_time")
    private Timestamp createTime;

    private String content;

    @Column(name = "like_num")
    private short likeNum;

    @Column(name = "comment_num")
    private short comentNum;

    @OneToMany(mappedBy = "partner")
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<Like> likes;

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
     * @return the likeNum
     */
    public short getLikeNum() {
	return likeNum;
    }

    /**
     * @param likeNum
     *            the likeNum to set
     */
    public void setLikeNum(short likeNum) {
	this.likeNum = likeNum;
    }

    /**
     * @return the comentNum
     */
    public short getComentNum() {
	return comentNum;
    }

    /**
     * @param comentNum
     *            the comentNum to set
     */
    public void setComentNum(short comentNum) {
	this.comentNum = comentNum;
    }

    /**
     * @return the likes
     */
    public Set<Like> getLikes() {
	return likes;
    }

    /**
     * @param likes
     *            the likes to set
     */
    public void setLikes(Set<Like> likes) {
	this.likes = likes;
    }

    // /**
    // * @return the user
    // */
    // public User getUser() {
    // return user;
    // }
    //
    // /**
    // * @param user
    // * the user to set
    // */
    // public void setUser(User user) {
    // this.user = user;
    // }

    // /**
    // * @return the partners
    // */
    // public Set<Comment> getPartners() {
    // return partners;
    // }
    //
    // /**
    // * @param partners
    // * the partners to set
    // */
    // public void setPartners(Set<Comment> partners) {
    // this.partners = partners;
    // }
}
