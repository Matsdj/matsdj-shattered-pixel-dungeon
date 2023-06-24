# Matsdj's Shattered Pixel Dungeon

A Roguelike RPG, with randomly generated levels, items, enemies, and traps! Based on the [source code of Shattered Pixel Dungeon](https://github.com/00-Evan/shattered-pixel-dungeon).

This is just my own version of shattered pixel dungeon where I make changes I feel like.

# Finished changes:
##Rings
Ring of accuracy is very uninterresting to level up with scrolls so it could get crit at higher levels or increase minimum damage of your weapons.
New ring of accuracy effects:
accuracy increase of 1 + .5 * levelofring (at level 10 this would give you a 96% change to hit most things I think)
minimum damage of weapons would have guarenteed max damage at level 8 giving you 12.5% increase in minimum damage at every level
chance. Beyond level 8 it is a 12.5% increase in total damage

##Artifacts
Ethereal Chains now cripple enemies just like the Guard enemy to make the pulling of enemies better

Horn of plenty applies well fed when you exceed full hunger to make using it at max stacks more usefull

Master Thieves Armband makes them vulnerable instead of cripple to differentiate from Ethereal chains.

Talisman of Foresight now provides/improves mind vision like the tier 2 skill from the Huntress, it goes up to 5 tiles of mind vision at level 10. You also gain 10% increased evasion per level

##Talents
-

##Wands
Wand of light always blinds from level 3 onwards (3-lvl in 5 chance of failing)

##Enemies
Enemies no longer stop dropping loot if you are too high level. (this used to be if you're 2 above max level of enemy)
Enemies now always drop 1-Maxlevel gold. (Maxlevel being the level after which they will give diminishing amounts of xp) (Rat.maxlvl = 5, Bat.maxlvl = 15)
Alternate versions of mobs now happen 5 times more often
	Armored statue happens 1 in 3 from 1 in 10

Rats have a 20% chance to drop meat
Crabs have a 40% chance to drop meat
Snake has a 50% chance to drop a seed
Gnoll is guarenteed to drop either gold or meat
swarm of flies no longer has a hp potion cap of 5
Shamans now have a 10% chance to drop a wand instead of 3%
	Purple Shamans (20% of shamans) have a 50% chance to drop a wand
DM201 has a 50% chance to drop something instead of 12.5%
Slimes, Skeletons, Guards, Bats, Shamans, DM200, Warlocks and Golems no longer have decreasing chances to drop something

##Crafting/Consumables
-

##Other
Instead of gaining no xp when to high level get: xp / (1+excessLevel)
Level Cap is 100
Blacksmith now works aditive with upgrades, meaning a level 2 weapon + level 2 weapon = level 4
And the Blacksmith can do unlimited upgrades
10 extra inventory slots

# Future Changes:
##Rings
Ring of Elements is also very uninteresting in my opinion because it lacks interresting synergy with other items. having an support item that does consisten magic damage back to the user inexchange for something could be interresting. or an item that encourages taking magic damage somehow for example the unstable spellbook casts a random offensive spell (with random targets) when you take/block enough magic damage. or the Timekeeper's Hourglas gains charges from taking/blocking magic damage.

Ring of evasion is also not something I ever use for a similar reason as the ring of elements. A fix could be to make a skill that does something whenever you dodge an attack.
	Both the Cloack of shadows and the master thieves armband gain charges when you dodge.

Ring of Force is also uninterresting in my opinion it's not a terrible ring but its also not very different from just having a weapon. Not sure what to do with this one
	Knockback?
	Area damage?

Ring of Might is also uninterresting but mostly because there aren't many things that need more strength or scale very well with strength since you already have strength potions. I think this ring needs an item that requeres a lot of strength to be interresting. Maybe there are rocks lying around that are to heavy to use normally but with the ring you could throw them around. These rocks would also block movement from enemies allowing some control over the enviroment. I was also thinking of a weapon that also becomes heavier with upgrades and does increasingly larger area damage and has a chance to paralize them aswel.

Ring of Tenacity has a similar problem to ring of elements.

##Artifacts
Alchemist toolkit would be more interresting if it added new drops from enemies and grass that could be crafted into items. It also would be more usable if consumable items where more consisten/less conditional. Maybe an extra option to use the extra charge if you have a lot, like energysing the player at the cost of 10 charge.

Chalice of blood is not very interresting but very strong not sure how to fix it though.

Timekeeper's Hourglass should have the ability to revert the user to a state a few turns earlier like health and maybe position.

Unstable Spellbook should get a third option which allows you to delay the casting of the scroll at the cost of a charge.

Talisman of foresight reveales if any item has a curse on use

##Talents
Rework some talents that aren't very interresting or usefull.

##Wands
Wands that doen't feel strong to use to me:
	Wand of lightning (Enemies build up charge and get paralized at max charge)
	Wand of Disintegration (Damage buff)
Wand of frost should freeze if the enemy is chilled

##Enemies
Make enemies more different:
	like having more variety in movement speed(never being excactly the same speed as the player)
	Having dodgeble charge up attacks
	Enemies have more weaknesses, like extra damage from: Fire, Fros, etc
Elementals can drop Embers as a rare drop

##Crafting/Consumables
Some items I never craft/use these should be buffed/changed.
	I think giving a lot of the expensive ones uses instead of durations would help

##Other
Stewed Meat needs a reason to exist.

Suprise attacks shouldn't work if they are to close to you. In other words enemies have short term memory of where you were and wont be suprised if they go through a door after you

Add more quickslots

Beter positive feedback
 Enemies drop items atleast 50% of the time
 Leveling from the first few enemies

Rework some talents to make them scale into the late game
Sacrificial altar thingies should give upgraded items (apparently the code makes it seem like they are supposed to be upgraded)
	Sacrificial altars should be repeatable
more natural regen
Some secret rooms are disapointing
	More gold in gold rooms
	More stuff in rune rooms (maybe wand dust stuff)
	
Make grass regrow over time
Add Challenges
	Grind Mode: 
		Enemies scale harder (increase in strength more as you go down)
		enemies drop more food and have a chance to drop upgrade scrolls
		Dubbel drop chance?
		Shops refill after 100 turns
	More alts (50% chance for an alt version of a mob)
		
Change Challenges
	On Diet is boring
	Pharmacophobia just removes healing potions which I think is boring
	Barren land is boring as it just removes plant stuff
	Forbidden Runes sucks because upgrade scrolls are my favourite thing as progression.
	

##The big future change
Town above ground to return to and heal up

larger dungeon to explore
Dungeon will generate loot on floors you've been too over time but the floor wil remain the same
Every floor also has a safty room which will never change or spawn monsters meaning you can store things there, place structures and rest there.

Safe area and resting mechanic

New Stamina resource that is neccesairy for melee combat and throwing weapons
New Mana resource that replaces wand charges

More drops from enemies that can craft into something usefull or be imbued into equipment or items
	Crafting weaker health potions
	imbueing weapons with posion (from the snake)

Larger skill tree
	All of the different starting classes will be merged into the tree so even if you start as a mage you could get hunter skills

New active skills that are obtained in the skill tree or from finding skill books. these skills can cost mana or stamina and have cooldowns

More species difercity and more weaknesses and strategies around different species
	example spiders are always weak to fire, 
	
Generate areas with consistent counters for example a snowy area where every enemy is weak to fire damage

Weapons aren't found but made in town with materials

Interresting synergy ideas which could be equipment or skills
	A few categories:
		When you take damage
		When you deal damage with melee or ranged (on hit)
			Apply an effect (bleed, cripple, fire, frost, etc)
			Gain Mana
			Heal x amount
		When you deal magic damage
		When you heal
		When you lose all of your shield
		When you gain mana
		When you activate an artifact
	A few things that happen because of those categories
	When you run out of shield damage al enemies around you
	Excess regen becomes shield
	new Onhit effects
		apply an effect 
		gain mana
		spawn toxic gas
		etc
	Ranged weapons apply onhit to x nearby targets
	Melee weapons apply onhit to enemies within x tiles
	Poison & toxic gas Imunnity
	When you take damage you create a small amount of toxic gas
	When enemies take fire damage they ignite nearby enemies
	You're immune to fire damage and Fire no longer burns Items
	Standing in fire regens your mana.
	
	Stepping on grass heals you
	