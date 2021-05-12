package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.gondr.domain.BoardVO;
import net.gondr.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/**/root-context.xml"})
public class BoardServiceTest {
	@Autowired
	BoardService service;
	
	@Test
	public void writeBoardTest() {
		BoardVO board = new BoardVO();
		board.setTitle("이번에도 테스트");
		board.setContent("이번에도 테스트 내용입니다. 테스트 테스트");
		board.setWriter("gondr");
		service.writeArticle(board);
	}
}
