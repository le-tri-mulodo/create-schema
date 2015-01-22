/**
 * 
 */
package com.mulodo.miniblog.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mulodo.miniblog.dao.LikeDAO;
import com.mulodo.miniblog.pojo.Like;

/**
 * @author TriLe
 *
 */
@Repository
public class LikeDAOImpl extends GenericDAOImpl<Like> implements LikeDAO {

    public List<Like> list() {
	return list("Like");
    }

}
