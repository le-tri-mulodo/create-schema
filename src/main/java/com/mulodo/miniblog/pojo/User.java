/**
 * 
 */
package com.mulodo.miniblog.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author TriLe
 *
 */
@Entity
@Table(name = "_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name", length = 64)
    private String userName;

    @Column(name = "first_name", length = 64)
    private String firstName;

    @Column(name = "last_name", length = 64)
    private String lastName;

    // use SHA-256 to hash pass
    @Column(name = "pass_hash", length = 64)
    private String passHash;

    // Origin password
    // private String passWord;

    @OneToMany(mappedBy = "user")
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<Like> likes;

     @OneToMany(mappedBy = "user")
     @Cascade(CascadeType.SAVE_UPDATE)
     private Set<Status> statuses;

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
     * @return the userName
     */
    public String getUserName() {
	return userName;
    }

    /**
     * @param userName
     *            the userName to set
     */
    public void setUserName(String userName) {
	this.userName = userName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
	return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    // /**
    // * @return the passHash
    // */
    // public String getPassHash() {
    // return passHash;
    // }

    /**
     * @param passHash
     *            the passHash to set
     */
    public void setPassHash(String passHash) {
	this.passHash = passHash;
    }

    // /**
    // * @return the passWord
    // */
    // public String getPassWord() {
    // return passWord;
    // }

    /**
     * @param passWord
     *            the passWord to set
     */
    public void setPassWord(String passWord) {
	// Reset hash password
	passHash = hashSHA(passWord);
    }

    public boolean isMatchPass(String org) {
	// TODO: Add hash compare
	return true;
    }

    private String hashSHA(String ip) {
	return ip;
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

    /**
     * @return the statuses
     */
    public Set<Status> getStatuses() {
	return statuses;
    }

    /**
     * @param statuses
     *            the statuses to set
     */
    public void setStatuses(Set<Status> statuses) {
	this.statuses = statuses;
    }
}
