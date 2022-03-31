package springdemo.dao;

import java.util.List;

import springdemo.entity.BoardGame;

public interface BoardGameDAO {
	
	public List<BoardGame> getBoardGames();
		
}
