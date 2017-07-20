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
package quests.Q00079_SagaOfTheAdventurer;

import quests.SagasSuperClass;

/**
 * @author Emperorc
 */
public class Q00079_SagaOfTheAdventurer extends SagasSuperClass
{
	public static String qn1 = "Q00079_SagaOfTheAdventurer";
	public static int qnu = 79;
	public static String qna = "Saga of the Adventurer";
	
	public Q00079_SagaOfTheAdventurer()
	{
		super(qnu, qn1, qna);
		NPC = new int[]
		{
			8603,
			8584,
			8579,
			8615,
			8619,
			8646,
			8647,
			8651,
			8654,
			8655,
			8658,
			8616
		};
		Items = new int[]
		{
			7080,
			7516,
			7081,
			7494,
			7277,
			7308,
			7339,
			7370,
			7401,
			7432,
			7102,
			0
		};
		Mob = new int[]
		{
			5299,
			5228,
			5302
		};
		qn = qn1;
		classid = new int[]
		{
			93
		};
		prevclass = new int[]
		{
			0x08
		};
		X = new int[]
		{
			119518,
			181205,
			181215
		};
		Y = new int[]
		{
			-28658,
			36676,
			36676
		};
		Z = new int[]
		{
			-3811,
			-4816,
			-4812
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
		new Q00079_SagaOfTheAdventurer();
	}
}