/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package quests.Q00095_SagaOfTheHellKnight;

import quests.SagasSuperClass;

/**
 * @author Emperorc
 */
public class Q00095_SagaOfTheHellKnight extends SagasSuperClass
{
	public static String qn1 = "Q00095_SagaOfTheHellKnight";
	public static int qnu = 95;
	public static String qna = "Saga of the Hell Knight";
	
	public Q00095_SagaOfTheHellKnight()
	{
		super(qnu, qn1, qna);
		NPC = new int[]
		{
			8582,
			8623,
			8297,
			8297,
			8599,
			8646,
			8647,
			8653,
			8654,
			8655,
			8656,
			8297
		};
		Items = new int[]
		{
			7080,
			7532,
			7081,
			7510,
			7293,
			7324,
			7355,
			7386,
			7417,
			7448,
			7086,
			0
		};
		Mob = new int[]
		{
			5258,
			5244,
			5263
		};
		qn = qn1;
		classid = new int[]
		{
			91
		};
		prevclass = new int[]
		{
			0x06
		};
		X = new int[]
		{
			164650,
			47391,
			47429
		};
		Y = new int[]
		{
			-74121,
			-56929,
			-56923
		};
		Z = new int[]
		{
			-2871,
			-2370,
			-2383
		};
		Text = new String[]
		{
			"PLAYERNAME! Pursued to here! However, I jumped out of the Banshouren boundaries! You look at the giant as the sign of power!",
			"... Oh ... good! So it was ... let's begin!",
			"I do not have the patience ..! I have been a giant force ...! Cough chatter ah ah ah!",
			"Paying homage to those who disrupt the orderly will be PLAYERNAME's death!",
			"Now, my soul freed from the shackles of the millennium, Halixia, to the back side I come ...",
			"Why do you interfere others' battles?",
			"This is a waste of time.. Say goodbye...!",
			"...That is the enemy",
			"...Goodness! PLAYERNAME you are still looking?",
			"PLAYERNAME ... Not just to whom the victory. Only personnel involved in the fighting are eligible to share in the victory.",
			"Your sword is not an ornament. Don't you think, PLAYERNAME?",
			"Goodness! I no longer sense a battle there now.",
			"let...",
			"Only engaged in the battle to bar their choice. Perhaps you should regret.",
			"The human nation was foolish to try and fight a giant's strength.",
			"Must...Retreat... Too...Strong.",
			"PLAYERNAME. Defeat...by...retaining...and...Mo...Hacker",
			"....! Fight...Defeat...It...Fight...Defeat...It..."
		};
		registerNPCs();
	}
	
	public static void main(String[] args)
	{
		new Q00095_SagaOfTheHellKnight();
	}
}