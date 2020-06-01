package com.luvina.restfulapi.repositories;

import com.luvina.restfulapi.entities.TblAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TblAreaRepository extends JpaRepository<TblAreaEntity, Long> {
    @Modifying
    @Transactional
    @Query(value = "delete from tbl_area where area_id = :area_id", nativeQuery = true)
    void deleteArea(@Param("area_id") int area_id);
}
