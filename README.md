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

Artifacts that gain charges from the heros exp also gain a charge every 100 turns
	Thieves armband, Ethereal Chains, Horn of plenty, Alchemist Toolkit
##Talents
-

##Wands
Wand of light always blinds from level 3 onwards (3-lvl in 5 chance of failing)

##Enemies
Enemies no longer stop dropping loot if you are too high level. (this used to be if you're 2 above max level of enemy)
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
Scroll of Divination now identifies 4 items when it can't identify items in your inventory

##Other
Instead of gaining no xp when to high level get: xp / (1+excessLevel)
Level Cap is 100
Blacksmith now works aditive with upgrades, meaning a level 2 weapon + level 2 weapon = level 4
And the Blacksmith can do unlimited upgrades
22 extra inventory slots

# Future Changes:

##Rings
Ring of Elements is also very uninteresting in my opinion because it lacks interresting synergy with other items. having an support item that does consisten magic damage back to the user inexchange for something could be interresting. or an item that encourages taking magic damage somehow for example the unstable spellbook casts a random offensive spell (with random targets) when you take/block enough magic damage. or the Timekeeper's Hourglass gains charges from taking/blocking magic damage.

Ring of evasion is also not something I ever use for a similar reason as the ring of elements. A fix could be to make a skill that does something whenever you dodge an attack.
	Both the Cloack of shadows and the master thieves armband gain charges when you dodge.

Ring of Force is also uninterresting in my opinion it's not a terrible ring but its also not very different from just having a weapon. Not sure what to do with this one
	Knockback?
	Area damage?

Ring of Might is also uninterresting but mostly because there aren't many things that need more strength or scale very well with strength since you already have strength potions. I think this ring needs an item that requeres a lot of strength to be interresting. Maybe there are rocks lying around that are to heavy to use normally but with the ring you could throw them around. These rocks would also block movement from enemies allowing some control over the enviroment. I was also thinking of a weapon that also becomes heavier with upgrades and does increasingly larger area damage and has a chance to paralize them aswel.

Ring of Tenacity has a similar problem to ring of elements.

##Artifacts
Alchemist toolkit
	would be more interresting if it added new drops from enemies and grass that could be crafted into items.
	Maybe an extra option to use the extra charge if you have a lot
		like energysing the player at the cost of 10 charge. 
		Or fabricating a random potion or scroll

Chalice of blood is not very interresting but very strong not sure how to fix it though.

Timekeeper's Hourglass should have the ability to revert the user to a state a few turns earlier like health and maybe position.

Unstable Spellbook should get a third option which allows you to delay the casting of the scroll at the cost of a charge.

Talisman of foresight reveales if any item has a curse on use

New artifact that can repair throwing weapons and more?

##Talents
Rework some talents that aren't very interresting or usefull.
Replace a boring talent with an enemy drop chance for class specific drops
	Warrior: Armor, Scoll of rage
	Mage: Wands, Arcane Resin
	Rogue: Potions of invisibilty, Artifacts, rings, Runes
	Huntress: Throwing weapons, repair material, seeds
	Duelist: Weapons

##Wands
Wands that doen't feel strong to use to me:
	Wand of lightning (Enemies build up charge and get paralized at max charge)
	Wand of Disintegration (Damage buff)
Wand of frost should freeze if the enemy is chilled

Wand of frost can be used on self do the following: OnFire->Neutral->Cold->Frozen
Wand of fireblast can be used on self do the following: Cold->Neutral->OnFire
These new abilities would allow for harsher enviroments that are constantly cold/hot.
	This would need a new inbetween effect called hot.
	
Mage wand does additive upgrades
Mage wands trigers enchantments with spells

##Weapons & Armor
Crossbow should increase throwing dart accuracy


##Enemies
Make enemies more different:
	like having more variety in movement speed(never being excactly the same speed as the player)
	Having dodgeble charge up attacks
	Enemies have more weaknesses, like extra damage from: Fire, Fros, etc
Elementals can drop Embers as a rare drop

##Crafting/Consumables
Some items I never craft/use these should be buffed/changed.
	I think giving a lot of the expensive ones uses instead of durations would help
New recipy to turn a seed into its potion form for 8 energy
New recipy to turn the stones into their scroll versions for 8 energy

Some specific anti debuff items:
	Cure for posion (new drop from spider?)

Potion of healing is so strong that it makes every other potion feel mostly irrelevant (this extra problematic because I removed the drop cap)
	Probably divide the healing by 2 or 4
	
The ability to create traps that don't activate when you walk over them
	Similar to seeds but they can't be thrown and can trigger multiple times

##Other
Adding 10 inventory slots kinda broke landscape mode

Stewed Meat needs a reason to exist.

Suprise attacks shouldn't work if they are to close to you. In other words enemies have short term memory of where you were and wont be suprised if they go through a door after you

Add more quickslots
Add more slots for rings and Artifacts

Beter positive feedback
 Enemies drop items atleast 50% of the time
 Leveling from the first few enemies

Rework some talents to make them scale into the late game
	Wizard can sense if something is cursed
Sacrificial altar thingies should give upgraded items (apparently the code makes it seem like they are supposed to be upgraded)
more natural regen

Some secret rooms are disapointing
	More gold in gold rooms
	More stuff in rune rooms (maybe wand dust stuff)
		guarenteed enchant rune
	
Add Challenges
	Grind Mode:
		Start with a ring of wealth
		Enemies scale harder (increase in strength more as you go down)
		enemies drop more food and have a chance to drop upgrade scrolls
		Dubbel drop chance?
		Shops refill after 500 turns
		Make grass regrow over time (1/20 chance per turn) (1/100 chance to turn to a random plant)
		Make well's refill
		Sacrificial altars should be repeatable
	Wimpy Mage:
		PROS:
			Permenant artifact recharging & energy recharing
			Start with Book
			Start with a random wand
		CON:
			Can't get strength
	Pasifist?
		PROS:
			All damage dealt to you gets reflected an equal amount back
			Start with ring of Elements & a Ring of Tenacity
		CONS:
			Can't target enemies with anything that does direct damage.
			So no weapons and throwing weapons. Some wands are still allowed
	One with nature:
		PROS:
			Start with nature boots
				They charge 10x as fast
			Start with a wand of overgrowth
			enemies take 50% of their health as damage when moving through tall grass and 10% when walking over grass
			Summon those vine enemies that fight for you. (maybe with wand of overgrowth)
			Heal 1 hp per turn while in tall grass
			All throwing weapons get converted into throwing darts
			Fire doesn't spread from grass to grass only from enemy to grass and from grass to enemy
			Crossbow only requires 12 strength
			All enchants are blooming, Camoflouge or overgrowth
		CONS:
			Only gloves and the Crossbow can be equiped
			Blind outside of grass
			Can't gain strength above 12
			Overgrowth can be obtained from regular enchants
	FIRE:
		PROS:	
			Starting equipment has fire enchants
			Enchantements are always the fire ones
			Start with wand of fireblast
				Gains a charge every 10-(wand level) turns
			Start with lvl 5 ring of arcana
			Heal 1hp for every enemy that is on fire per turn
			Fire Elementals become your ally
			When an enemy is killed it has a 1% chance to summon a fire elemental
			Slowly regain hunger in fire
		CONS:
			Upgrade scrolls can only be used and the fireblast wand
			Rapidly lose hunger away from fire
			Can't get strength
	FROST:
	Lightning:
		PROS:
			Wand of lightning paralizes enemies (wandlvl/enemy.maxlvl)
				Gains a charge every 3 turns
			Start with a +2 ring of haste
			Immune to lightning damage
			Always get shocking enchant
		CONS:
			Can't gain strength
	ONE PUNCH:
		PROS:
			start with ring of Force
			Ring of Force lvl = your level
			Permenant haste
			Punches have elastic and apply blindness
		CONS:
			can only equip gloves
			Can't use scrolls of upgrade
	Alchemist:
		Start with Alchemist toolkit
		Start with whip and can only use whip
		Positive Potion effects never run out
		...
	Rocks:
		PROS:
			Start with 1 unbreakable rock
			Start with lvl 5 Ring of accuracy
			Rock returns immediatly after being thrown
		CONS:
			Can't use weapons or wands
			Can only upgrade rocks
	Ninja/Samurai:
		PROS:
			More stealth
		CONS:
			Only ninja weapons and no heavy armor
	Vampire:
		PROS:
			lvl 15 ring of arcana
			All enchants give Vampire
		CONS:
			Can't wear heavy armor
			Not enchantments on armor
	Curses:
		All equipment has +2
		Every kill 
			gives a random non cursed item a curse
			has a 1% chance to upgrade a cursed equiped item
			has a 5% chance to drop a remove curse scroll
		Identify on pickup
		Wraiths are your friend
		
Change Challenges
	On Diet is boring
	Pharmacophobia just removes healing potions which I think is boring
	Barren land is boring as it just removes plant stuff
	Forbidden Runes sucks because upgrade scrolls are my favourite thing as progression.

##Triggers and Effects
Rework lvl 5+ rings to have triggers which trigger all equiped lvl 10 artifact effects
Triggers
Ring of Accuracy: Triggers when you hit something with ranged or melee
		Arcana: Triggers when an enchantment is activated
		Elementals: Triggers when you take magic/effect damage
		Energy: Triggers when you use a wand or artifact
		Evasion: Triggers when you dodge an attack
		Force: Triggers when you melee attack trigger again twice if the attack took longer then a turn
		Furor: Triggers every two melee attacks
		Haste: Triggers when you move 10 tiles
		Might: Triggers when losing health
		Sharpshooting: Triggers on ranged attack
		Tenacity: Triggers on being hit with a physical damage
		Wealth(S): Triggers thrice on Gold pickup
Effects (If no enemy target is given and the effect does require one it will pick a random enemy within a radius of 3)
	Alchemist's Toolkit: 10% chance to gain a basic Potion, Seed, Scroll or 5 energy (this excludes Upgrade and strength)
	Chalice of blood: Deal (HeroLvl/2) damage to Enemy and Heal self for 10% of the damage dealt
	Cloack of shadows: Blinds enemies within a 2 tile radius for 2 turns and makes them vulnerable for 2 turn
	Dried Rose: gain (MaxHealth*.02) as shield
	Ethereal Chains: Cripple enemies + 20% chance to gain a charge on Ethereal Chains
	Horn of plenty: Have a 20% chance to gain a charge and apply bleed to enemies (no charge is gained without enemy)
	Master Thieves Armband: Open Locked chests and doors within a radius of 2 and increase drop chance of enemy by 50% (stacking)
	Footwear of Nature: 20% chance to apply plant effect. (positive plant effect on allies and negative plant effects on enemies)
	Talisman of Foresight: Reveal Traps in a radius of 1 around you and the enemy and have a 50% chance to identify an Item in your inventory
	Timekeepers Hourglass: Gain a charge on a random wand or artifact that doesn't have all charges (charge = 10% on some artifacts)
	Unstable Spellbook: 5% chance to obtain a random scroll or 20% to gain 1 charge

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
	