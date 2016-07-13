package com.zizo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by CarlJohnson on 2016/4/12.
 */
@Repository
public interface DefaultRepository extends JpaRepository<Object, Integer> {
}
