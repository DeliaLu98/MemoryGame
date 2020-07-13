package com.snatik.matches.model;

import com.snatik.matches.themes.Theme;

/**
 * instanta jocului curent
 */
public class Game {

	/**
	 * configuratia board-ului
	 */
	public BoardConfiguration boardConfiguration;

	/**
	 * aranjamentul board-ului
	 */
	public BoardArrangment boardArrangment;

	/**
	 *tema selectata
	 */
	public Theme theme;

	public GameState gameState;

}
