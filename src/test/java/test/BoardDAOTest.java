package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.gondr.dao.BoardDAO;
import net.gondr.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/**/root-context.xml"})
public class BoardDAOTest {
	@Autowired
	private BoardDAO dao;
	
	@Test
	public void createBoard() {
		BoardVO board = new BoardVO();
		board.setContent("글 내용입니다. 테스트용 내용");
		board.setTitle("글 제목입니다. 테스트용");
		board.setWriter("gondr");
		dao.write(board);
	}
}
