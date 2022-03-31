package springdemo.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springdemo.entity.BoardGame;

@Repository
public class BoardGameDAOImpl implements BoardGameDAO {
	
	// inject the session factory 
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<BoardGame> getBoardGames() {
		
		// get the current hibernate session 
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query 
		Query<BoardGame> theQuery = currentSession.createQuery("from BoardGame", BoardGame.class);
		
		// execute query and get result list
		List<BoardGame> games = theQuery.getResultList();
		
		// return the results
		return games;
	}
}
