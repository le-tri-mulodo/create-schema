/**
 * 
 */
package com.mulodo.miniblog.pojo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author TriLe
 *
 */
@Entity
@Table(name = "_comment")
public class Comment extends Status {

    @ManyToOne
    @JoinColumn(name = "partner_id", referencedColumnName = "id")
    private Status partner;

    /**
     * @return the partner
     */
    public Status getPartner() {
	return partner;
    }

    /**
     * @param partner
     *            the partner to set
     */
    public void setPartner(Status partner) {
	this.partner = partner;
    }

}
