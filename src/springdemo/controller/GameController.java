package springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@RequestMapping("/list")
	public String listGames(Model theModel) {
		return "list-games";
	}

}
