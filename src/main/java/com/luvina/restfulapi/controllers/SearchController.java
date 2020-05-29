package com.luvina.restfulapi.controllers;

import com.luvina.restfulapi.entities.DataPost;
import com.luvina.restfulapi.entities.DataPrefecture;
import com.luvina.restfulapi.entities.Post;
import com.luvina.restfulapi.entities.Prefecture;
import com.luvina.restfulapi.repositories.PostRepository;
import com.luvina.restfulapi.repositories.PrefectureRepository;
import com.luvina.restfulapi.utils.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for search function by postCode, prefectureCode
 *
 * @author vuvanhiep
 */
@RestController
@RequestMapping("post_offices")
public class SearchController {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private PrefectureRepository prefectureRepository;

	@RequestMapping(value = "post/{postCode}", method = RequestMethod.GET)
	public ResponseEntity<DataPost> searchByPostCode(@PathVariable(value = "postCode") String postCode) {
		postCode = Common.replaceString(postCode);
		if (postCode == null || Common.checkHalfSize(postCode) == false) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		List<Post> list = postRepository.searchByPostCodeRepository(postCode);
		if (list == null || list.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(new DataPost(list, "success"),HttpStatus.OK);
	}
	
	@RequestMapping(value = "prefecture/{prefectureCode}", method = RequestMethod.GET)
	public ResponseEntity<DataPrefecture> searchByPrefectureCode(
			@PathVariable(value = "prefectureCode") String prefectureCode) {
		prefectureCode = Common.replaceString(prefectureCode);
		if (prefectureCode == null || Common.checkHalfSize(prefectureCode) == false) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		List<Prefecture> list = prefectureRepository.searchByPrefectureCodeRepository(prefectureCode);
		if (list == null || list.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(new DataPrefecture(list, "success"), HttpStatus.OK);
	}
}
