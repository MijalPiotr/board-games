package springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springdemo.dao.BoardGameDAO;
import springdemo.entity.BoardGame;

@Controller
@RequestMapping("/game")
public class GameController {
	
	// inject the boardgame dao
	@Autowired
	private BoardGameDAO boardGameDAO;
	
	@RequestMapping("/list")
	public String listGames(Model theModel) {
		
		// get boardgames for the dao
		List<BoardGame> theBoardGames = boardGameDAO.getBoardGames();
		
		// add the boardgames to the model
		theModel.addAttribute("boardGames", theBoardGames);
		
		return "list-games";
	}

}
