package com.luvina.restfulapi.repositories;

import com.luvina.restfulapi.entities.Prefecture;
import com.luvina.restfulapi.entities.TblCityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrefectureRepository extends JpaRepository<TblCityEntity, Long> {
    @Query("select new com.luvina.restfulapi.entities.Prefecture(" +
            "c.code, " +
            "c.city, " +
            "c.cityKana, " +
            "p.prefecture, " +
            "p.prefectureKana, " +
            "p.prefectureCode) " +
            "from TblCityEntity c " +
            "inner join c.tblPrefectureEntity p " +
            "where p.prefectureCode = :prefectureCode")
    List<Prefecture> searchByPrefectureCode(@Param("prefectureCode") String prefectureCode);
}
