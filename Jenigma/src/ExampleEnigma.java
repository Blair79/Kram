/*
 *  Copyright 2003-2008 Tom Castle (tc33.org)
 *  Licensed under GNU General Public License
 *  
 *  This file is part of JEnigma.
 * 
 *  JEnigma is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  JEnigma is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with JEnigma.  If not, see <http://www.gnu.org/licenses/>.
 */

import components.Plugboard;
import components.Reflector;
import components.Rotor;

/**
 * This version of the Enigma isn't really suitable for any serious use however 
 * it may have some demonstration use to get started quickly.
 */
public class ExampleEnigma extends Enigma {

	private final static Rotor[] rotors = new Rotor[]{Rotor.ROTOR_I, Rotor.ROTOR_II, Rotor.ROTOR_III};
	private final static Reflector reflector = Reflector.REFLECTOR_B;
	
	/**
	 * This constructor creates a JEnigma machine using Rotors I, II and III, 
	 * an empty plugboard and reflector B. The char parameters are the starting 
	 * positions for the rotors - essentially the key.
	 * @param pos1 A char 'A' to 'Z' which gives the starting position of the first rotor.
	 * @param pos2 A char 'A' to 'Z' which gives the starting position of the second rotor.
	 * @param pos3 A char 'A' to 'Z' which gives the starting position of the third rotor.
	 */
	public ExampleEnigma(char pos1, char pos2, char pos3) {
		super(rotors, new char[]{pos1, pos2, pos3}, new Plugboard(), reflector);
	}
	
	/**
	 * Use this constructor if you don't even care what the rotor settings are.
	 */
	public ExampleEnigma() {
		super(rotors, new char[]{'A', 'A', 'A'}, new Plugboard(), reflector);
	}


}
