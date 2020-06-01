package com.luvina.restfulapi.controllers;

import com.luvina.restfulapi.entities.Post;
import com.luvina.restfulapi.entities.Prefecture;
import com.luvina.restfulapi.repositories.PostRepository;
import com.luvina.restfulapi.repositories.PrefectureRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SearchControllerTest {
	
	@InjectMocks
	private SearchController searchController;
	
	@Mock
	private PostRepository postRepository;
	
	@Mock
	private PrefectureRepository prefectureRepository;

	@Captor
	ArgumentCaptor<String> stringArgumentCaptor;
	
	
	@Before
	public void setUp() {
		List<Post> postList = new ArrayList<Post>();
		postList.add(new Post("北海道", "ｶｲﾄﾞｳ", "01", "01102", "ｻｯﾎﾟﾛｼｷﾀｸ", "札幌市北区",
				"北二十条西（２～１０丁目）", "ｷﾀ20ｼﾞｮｳﾆｼ(2-10ﾁｮｳﾒ)", 1, 0, 1, "001", "0010020",
				0, 0, 0));
		postList.add(new Post("北海道", "ﾎｯｶｲﾄﾞｳ", "01", "01102", "ｻｯﾎﾟﾛｼｷﾀｸ", "札幌市北区",
				"北十三条西（１～４丁目）", "ｷﾀ13ｼﾞｮｳﾆｼ(1-4ﾁｮｳﾒ)", 1, 0, 1, "001", "0010013",
				0, 0, 0));
		when(postRepository.searchByPostCodeRepository("0010020")).thenReturn(postList);
		
		List<Prefecture> prefectureList = new ArrayList<Prefecture>();
		prefectureList.add(new Prefecture("10201", "前橋市", "ﾏｴﾊﾞｼｼ", "群馬県", "ｸﾞﾝﾏｹﾝ", "10"));
		prefectureList.add(new Prefecture("10202", "高崎市", "ﾀｶｻｷｼ", "群馬県", "ｸﾞﾝﾏｹﾝ", "10"));
		prefectureList.add(new Prefecture("10464", "佐波郡玉村町", "ｻﾜｸﾞﾝﾀﾏﾑﾗﾏﾁ", "群馬県", "ｸﾞﾝﾏｹﾝ", "10"));
		when(prefectureRepository.searchByPrefectureCodeRepository("10")).thenReturn(prefectureList);
	}
	
	@Test
	public void findByPostCodeTest() {
		assertEquals(200, searchController.searchByPostCode("0010020").getStatusCodeValue());
		assertEquals(2, searchController.searchByPostCode("0010020").getBody().getData().size());
		verify(postRepository, times(2)).searchByPostCodeRepository("0010020");
		verify(postRepository, times(2)).searchByPostCodeRepository(stringArgumentCaptor.capture());
	}
	
	@Test
	public void findByPrefectureCodeTest() {
		assertEquals(3, searchController.searchByPrefectureCode("10").getBody().getData().size());
		assertEquals(200, searchController.searchByPrefectureCode("10").getStatusCodeValue());
		verify(prefectureRepository, times(2)).searchByPrefectureCodeRepository("10");
		verify(prefectureRepository, times(2)).searchByPrefectureCodeRepository(stringArgumentCaptor.capture());
	}
}
