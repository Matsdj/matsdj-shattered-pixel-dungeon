/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2023 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.items.rings;

import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;

public class RingOfAccuracy extends Ring {

	{
		icon = ItemSpriteSheet.Icons.RING_ACCURACY;
	}
	
	public String statsInfo() {
		if (isIdentified()){
			return Messages.get(this, "stats",
					new DecimalFormat("#.##").format(100f * (.5f * (soloBuffedBonus()))),
					new DecimalFormat("#.##").format(100f * (.125f * (soloBuffedBonus()))));
		} else {
			return Messages.get(this, "typical_stats",
					new DecimalFormat("#.##").format(50f),
					new DecimalFormat("#.##").format(12.5f));
		}
	}
	
	@Override
	protected RingBuff buff( ) {
		return new Accuracy();
	}
	
	public static float accuracyMultiplier( Char target ){
		return (.5f * (1 + getBuffedBonus(target, Accuracy.class)));
	}

	public static int minimumDamageIncrease( Char target, int min, int max ){
		int diff = max - min;
		return Math.round(min + diff * (.125f * getBuffedBonus(target, Accuracy.class)));
	}
	
	public class Accuracy extends RingBuff {
	}
}
