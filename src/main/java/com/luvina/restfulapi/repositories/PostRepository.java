package com.luvina.restfulapi.repositories;

import com.luvina.restfulapi.entities.TblAreaEntity;
import com.luvina.restfulapi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<TblAreaEntity, Long> {
	
	@Query("select new com.luvina.restfulapi.entities.Post("
			+ "p.prefecture, "
			+ "p.prefectureKana, "
			+ "p.prefectureCode, "
			+ "c.code, "
			+ "c.cityKana, "
			+ "c.city, "
			+ "a.area, "
			+ "a.areaKana, "
			+ "a.multiPostArea, "
			+ "a.koazaArea, "
			+ "a.chomeArea, "
			+ "o.oldPostCode, "
			+ "post.postCode, "
			+ "post.multiArea, "
			+ "post.updateShow, "
			+ "post.changeReason) "
			+ "from TblAreaEntity a "
			+ "inner join a.tblCityEntity c "
			+ "inner join c.tblPrefectureEntity p "
			+ "inner join a.tblOldPostEntity o "
			+ "inner join a.tblPostEntity post "
			+ "where post.postCode = :postCode")
	List<Post> searchByPostCodeRepository(@Param("postCode") String postCode);
}
