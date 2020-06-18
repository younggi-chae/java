package mvc.view.board;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import mvc.board.BoardDTO;
import mvc.board.BoardService;
import mvc.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	// �۵��
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardDTO dto) {

		System.out.println("�� ��� ó��");

		boardService.insertBoard(dto);
		return "getBoardList.do";
	}
 
	// �ۼ���
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardDTO dto) {
		
		boardService.updateBoard(dto);
		return "getBoardList.do";
	}

	// �ۻ���
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardDTO dto) {

		System.out.println("�� ���� ó��");
		boardService.deleteBoard(dto);
		return "getBoardList.do";
	}

	// �� �� ��ȸ
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardDTO dto, Model model) {

		System.out.println("�� �� ��ȸ ó��");
		
		model.addAttribute("board", boardService.getBoard(dto));
		return "getBoard.jsp";
		
	}

	// �� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardDTO dto, Model model) {
		
		//Null Check
		if(dto.getSearchCondition() == null) dto.setSearchCondition("TITLE");
		if(dto.getSearchKeyword() == null) dto.setSearchKeyword("");
		//�� ���� ����
		model.addAttribute("boardList", boardService.getBoardList(dto));
		return "getBoardList.jsp";
	}
	
	//�˻� ���� ��� ����
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����", "TITLE");
		conditionMap.put("����", "CONTENT");
		return conditionMap;
	}
}