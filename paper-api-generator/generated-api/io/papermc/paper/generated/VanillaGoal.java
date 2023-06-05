package io.papermc.paper.generated;

import com.destroystokyo.paper.entity.RangedEntity;
import com.destroystokyo.paper.entity.ai.Goal;
import com.destroystokyo.paper.entity.ai.GoalKey;
import io.papermc.paper.entity.SchoolableFish;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.AbstractHorse;
import org.bukkit.entity.AbstractSkeleton;
import org.bukkit.entity.AbstractVillager;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Cat;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Dolphin;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Fish;
import org.bukkit.entity.Fox;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.Illager;
import org.bukkit.entity.Illusioner;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Llama;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.PufferFish;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Raider;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Shulker;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.SkeletonHorse;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spellcaster;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Strider;
import org.bukkit.entity.Tameable;
import org.bukkit.entity.Turtle;
import org.bukkit.entity.Vex;
import org.bukkit.entity.Vindicator;
import org.bukkit.entity.WanderingTrader;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({
        "unused",
        "SpellCheckingInspection"
})
@GeneratedFrom("1.19.4")
public interface VanillaGoal<T extends Mob> extends Goal<T> {
    GoalKey<RangedEntity> RANGED_ATTACK = of("ranged_attack", RangedEntity.class);

    GoalKey<RangedEntity> DROWNED_TRIDENT_ATTACK = of("drowned_trident_attack", RangedEntity.class);

    GoalKey<SchoolableFish> FOLLOW_FLOCK_LEADER = of("follow_flock_leader", SchoolableFish.class);

    GoalKey<AbstractHorse> RANDOM_STAND = of("random_stand", AbstractHorse.class);

    GoalKey<AbstractHorse> RUN_AROUND_LIKE_CRAZY = of("run_around_like_crazy", AbstractHorse.class);

    GoalKey<AbstractSkeleton> ABSTRACT_SKELETON_MELEE = of("abstract_skeleton_melee", AbstractSkeleton.class);

    GoalKey<AbstractVillager> LOOK_AT_TRADING_PLAYER = of("look_at_trading_player", AbstractVillager.class);

    GoalKey<AbstractVillager> TRADE_WITH_PLAYER = of("trade_with_player", AbstractVillager.class);

    GoalKey<Animals> BREED = of("breed", Animals.class);

    GoalKey<Animals> FOLLOW_PARENT = of("follow_parent", Animals.class);

    GoalKey<Bee> BEE_ATTACK = of("bee_attack", Bee.class);

    GoalKey<Bee> BEE_BECOME_ANGRY = of("bee_become_angry", Bee.class);

    GoalKey<Bee> BEE_ENTER_HIVE = of("bee_enter_hive", Bee.class);

    GoalKey<Bee> BEE_GO_TO_HIVE = of("bee_go_to_hive", Bee.class);

    GoalKey<Bee> BEE_GO_TO_KNOWN_FLOWER = of("bee_go_to_known_flower", Bee.class);

    GoalKey<Bee> BEE_GROW_CROP = of("bee_grow_crop", Bee.class);

    GoalKey<Bee> BEE_HURT_BY_OTHER = of("bee_hurt_by_other", Bee.class);

    GoalKey<Bee> BEE_LOCATE_HIVE = of("bee_locate_hive", Bee.class);

    GoalKey<Bee> BEE_POLLINATE = of("bee_pollinate", Bee.class);

    GoalKey<Bee> BEE_WANDER = of("bee_wander", Bee.class);

    GoalKey<Blaze> BLAZE_ATTACK = of("blaze_attack", Blaze.class);

    GoalKey<Cat> CAT_LIE_ON_BED = of("cat_lie_on_bed", Cat.class);

    GoalKey<Cat> CAT_SIT_ON_BLOCK = of("cat_sit_on_block", Cat.class);

    GoalKey<Cat> CAT_AVOID_ENTITY = of("cat_avoid_entity", Cat.class);

    GoalKey<Cat> CAT_RELAX_ON_OWNER = of("cat_relax_on_owner", Cat.class);

    GoalKey<Cat> CAT_TEMPT = of("cat_tempt", Cat.class);

    GoalKey<Creature> AVOID_ENTITY = of("avoid_entity", Creature.class);

    GoalKey<Creature> BREATH_AIR = of("breath_air", Creature.class);

    GoalKey<Creature> FLEE_SUN = of("flee_sun", Creature.class);

    GoalKey<Creature> FOLLOW_BOAT = of("follow_boat", Creature.class);

    GoalKey<Creature> GOLEM_RANDOM_STROLL_IN_VILLAGE = of("golem_random_stroll_in_village", Creature.class);

    GoalKey<Creature> MELEE_ATTACK = of("melee_attack", Creature.class);

    GoalKey<Creature> MOVE_BACK_TO_VILLAGE = of("move_back_to_village", Creature.class);

    GoalKey<Creature> MOVE_THROUGH_VILLAGE = of("move_through_village", Creature.class);

    GoalKey<Creature> MOVE_TOWARDS_RESTRICTION = of("move_towards_restriction", Creature.class);

    GoalKey<Creature> MOVE_TOWARDS = of("move_towards", Creature.class);

    GoalKey<Creature> PANIC = of("panic", Creature.class);

    GoalKey<Creature> RANDOM_STROLL = of("random_stroll", Creature.class);

    GoalKey<Creature> RANDOM_SWIMMING = of("random_swimming", Creature.class);

    GoalKey<Creature> REMOVE_BLOCK = of("remove_block", Creature.class);

    GoalKey<Creature> RESTRICT_SUN = of("restrict_sun", Creature.class);

    GoalKey<Creature> STROLL_THROUGH_VILLAGE = of("stroll_through_village", Creature.class);

    GoalKey<Creature> TEMPT = of("tempt", Creature.class);

    GoalKey<Creature> TRY_FIND_WATER = of("try_find_water", Creature.class);

    GoalKey<Creature> WATER_AVOIDING_RANDOM_FLYING = of("water_avoiding_random_flying", Creature.class);

    GoalKey<Creature> WATER_AVOIDING_RANDOM_STROLL = of("water_avoiding_random_stroll", Creature.class);

    GoalKey<Creature> HURT_BY = of("hurt_by", Creature.class);

    GoalKey<Creature> PARROT_WANDER = of("parrot_wander", Creature.class);

    GoalKey<Creature> DROWNED_GO_TO_WATER = of("drowned_go_to_water", Creature.class);

    GoalKey<Creeper> SWELL = of("swell", Creeper.class);

    GoalKey<Dolphin> DOLPHIN_JUMP = of("dolphin_jump", Dolphin.class);

    GoalKey<Dolphin> DOLPHIN_SWIM_TO_TREASURE = of("dolphin_swim_to_treasure", Dolphin.class);

    GoalKey<Dolphin> DOLPHIN_SWIM_WITH_PLAYER = of("dolphin_swim_with_player", Dolphin.class);

    GoalKey<Dolphin> PLAY_WITH_ITEMS = of("play_with_items", Dolphin.class);

    GoalKey<Drowned> DROWNED_ATTACK = of("drowned_attack", Drowned.class);

    GoalKey<Drowned> DROWNED_GO_TO_BEACH = of("drowned_go_to_beach", Drowned.class);

    GoalKey<Drowned> DROWNED_SWIM_UP = of("drowned_swim_up", Drowned.class);

    GoalKey<Enderman> ENDERMAN_FREEZE_WHEN_LOOKED_AT = of("enderman_freeze_when_looked_at", Enderman.class);

    GoalKey<Enderman> ENDERMAN_LEAVE_BLOCK = of("enderman_leave_block", Enderman.class);

    GoalKey<Enderman> ENDERMAN_LOOK_FOR_PLAYER = of("enderman_look_for_player", Enderman.class);

    GoalKey<Enderman> ENDERMAN_TAKE_BLOCK = of("enderman_take_block", Enderman.class);

    GoalKey<Evoker> EVOKER_ATTACK_SPELL = of("evoker_attack_spell", Evoker.class);

    GoalKey<Evoker> EVOKER_CASTING_SPELL = of("evoker_casting_spell", Evoker.class);

    GoalKey<Evoker> EVOKER_SUMMON_SPELL = of("evoker_summon_spell", Evoker.class);

    GoalKey<Evoker> EVOKER_WOLOLO_SPELL = of("evoker_wololo_spell", Evoker.class);

    GoalKey<Fish> FISH_SWIM = of("fish_swim", Fish.class);

    GoalKey<Fox> DEFEND_TRUSTED = of("defend_trusted", Fox.class);

    GoalKey<Fox> FACEPLANT = of("faceplant", Fox.class);

    GoalKey<Fox> FOX_BREED = of("fox_breed", Fox.class);

    GoalKey<Fox> FOX_EAT_BERRIES = of("fox_eat_berries", Fox.class);

    GoalKey<Fox> FOX_FLOAT = of("fox_float", Fox.class);

    GoalKey<Fox> FOX_FOLLOW_PARENT = of("fox_follow_parent", Fox.class);

    GoalKey<Fox> FOX_LOOK_AT_PLAYER = of("fox_look_at_player", Fox.class);

    GoalKey<Fox> FOX_MELEE_ATTACK = of("fox_melee_attack", Fox.class);

    GoalKey<Fox> FOX_PANIC = of("fox_panic", Fox.class);

    GoalKey<Fox> FOX_POUNCE = of("fox_pounce", Fox.class);

    GoalKey<Fox> FOX_SEARCH_FOR_ITEMS = of("fox_search_for_items", Fox.class);

    GoalKey<Fox> FOX_STROLL_THROUGH_VILLAGE = of("fox_stroll_through_village", Fox.class);

    GoalKey<Fox> PERCH_AND_SEARCH = of("perch_and_search", Fox.class);

    GoalKey<Fox> SEEK_SHELTER = of("seek_shelter", Fox.class);

    GoalKey<Fox> SLEEP = of("sleep", Fox.class);

    GoalKey<Fox> STALK_PREY = of("stalk_prey", Fox.class);

    GoalKey<Ghast> GHAST_LOOK = of("ghast_look", Ghast.class);

    GoalKey<Ghast> GHAST_SHOOT_FIREBALL = of("ghast_shoot_fireball", Ghast.class);

    GoalKey<Ghast> RANDOM_FLOAT_AROUND = of("random_float_around", Ghast.class);

    GoalKey<Guardian> GUARDIAN_ATTACK = of("guardian_attack", Guardian.class);

    GoalKey<Illager> RAIDER_OPEN_DOOR = of("raider_open_door", Illager.class);

    GoalKey<Illusioner> ILLUSIONER_BLINDNESS_SPELL = of("illusioner_blindness_spell", Illusioner.class);

    GoalKey<Illusioner> ILLUSIONER_MIRROR_SPELL = of("illusioner_mirror_spell", Illusioner.class);

    GoalKey<IronGolem> OFFER_FLOWER = of("offer_flower", IronGolem.class);

    GoalKey<IronGolem> DEFEND_VILLAGE = of("defend_village", IronGolem.class);

    GoalKey<Llama> LLAMA_FOLLOW_CARAVAN = of("llama_follow_caravan", Llama.class);

    GoalKey<Llama> LLAMA_ATTACK_WOLF = of("llama_attack_wolf", Llama.class);

    GoalKey<Llama> LLAMA_HURT_BY = of("llama_hurt_by", Llama.class);

    GoalKey<Llama> TRADER_LLAMA_DEFEND_WANDERING_TRADER = of("trader_llama_defend_wandering_trader", Llama.class);

    GoalKey<Mob> BREAK_DOOR = of("break_door", Mob.class);

    GoalKey<Mob> CLIMB_ON_TOP_OF_POWDER_SNOW = of("climb_on_top_of_powder_snow", Mob.class);

    GoalKey<Mob> EAT_BLOCK = of("eat_block", Mob.class);

    GoalKey<Mob> FLOAT = of("float", Mob.class);

    GoalKey<Mob> FOLLOW_MOB = of("follow_mob", Mob.class);

    GoalKey<Mob> INTERACT = of("interact", Mob.class);

    GoalKey<Mob> LEAP_AT = of("leap_at", Mob.class);

    GoalKey<Mob> LOOK_AT_PLAYER = of("look_at_player", Mob.class);

    GoalKey<Mob> OCELOT_ATTACK = of("ocelot_attack", Mob.class);

    GoalKey<Mob> OPEN_DOOR = of("open_door", Mob.class);

    GoalKey<Mob> RANDOM_LOOK_AROUND = of("random_look_around", Mob.class);

    GoalKey<Mob> USE_ITEM = of("use_item", Mob.class);

    GoalKey<Mob> NEAREST_ATTACKABLE = of("nearest_attackable", Mob.class);

    GoalKey<Mob> RESET_UNIVERSAL_ANGER = of("reset_universal_anger", Mob.class);

    GoalKey<Mob> VINDICATOR_BREAK_DOOR = of("vindicator_break_door", Mob.class);

    GoalKey<Monster> RANGED_BOW_ATTACK = of("ranged_bow_attack", Monster.class);

    GoalKey<Monster> RANGED_CROSSBOW_ATTACK = of("ranged_crossbow_attack", Monster.class);

    GoalKey<Ocelot> OCELOT_AVOID_ENTITY = of("ocelot_avoid_entity", Ocelot.class);

    GoalKey<Ocelot> OCELOT_TEMPT = of("ocelot_tempt", Ocelot.class);

    GoalKey<Panda> PANDA_ATTACK = of("panda_attack", Panda.class);

    GoalKey<Panda> PANDA_AVOID = of("panda_avoid", Panda.class);

    GoalKey<Panda> PANDA_BREED = of("panda_breed", Panda.class);

    GoalKey<Panda> PANDA_HURT_BY = of("panda_hurt_by", Panda.class);

    GoalKey<Panda> PANDA_LIE_ON_BACK = of("panda_lie_on_back", Panda.class);

    GoalKey<Panda> PANDA_LOOK_AT_PLAYER = of("panda_look_at_player", Panda.class);

    GoalKey<Panda> PANDA_PANIC = of("panda_panic", Panda.class);

    GoalKey<Panda> PANDA_ROLL = of("panda_roll", Panda.class);

    GoalKey<Panda> PANDA_SIT = of("panda_sit", Panda.class);

    GoalKey<Panda> PANDA_SNEEZE = of("panda_sneeze", Panda.class);

    GoalKey<Parrot> LAND_ON_OWNERS_SHOULDER = of("land_on_owners_shoulder", Parrot.class);

    GoalKey<Phantom> PHANTOM_ATTACK_PLAYER = of("phantom_attack_player", Phantom.class);

    GoalKey<Phantom> PHANTOM_ATTACK_STRATEGY = of("phantom_attack_strategy", Phantom.class);

    GoalKey<Phantom> PHANTOM_CIRCLE_AROUND_ANCHOR = of("phantom_circle_around_anchor", Phantom.class);

    GoalKey<Phantom> PHANTOM_SWEEP_ATTACK = of("phantom_sweep_attack", Phantom.class);

    GoalKey<PolarBear> POLAR_BEAR_ATTACK_PLAYERS = of("polar_bear_attack_players", PolarBear.class);

    GoalKey<PolarBear> POLAR_BEAR_HURT_BY = of("polar_bear_hurt_by", PolarBear.class);

    GoalKey<PolarBear> POLAR_BEAR_MELEE_ATTACK = of("polar_bear_melee_attack", PolarBear.class);

    GoalKey<PolarBear> POLAR_BEAR_PANIC = of("polar_bear_panic", PolarBear.class);

    GoalKey<PufferFish> PUFFERFISH_PUFF = of("pufferfish_puff", PufferFish.class);

    GoalKey<Rabbit> EVIL_RABBIT_ATTACK = of("evil_rabbit_attack", Rabbit.class);

    GoalKey<Rabbit> RABBIT_AVOID_ENTITY = of("rabbit_avoid_entity", Rabbit.class);

    GoalKey<Rabbit> RABBIT_PANIC = of("rabbit_panic", Rabbit.class);

    GoalKey<Rabbit> RAID_GARDEN = of("raid_garden", Rabbit.class);

    GoalKey<Raider> PATHFIND_TO_RAID = of("pathfind_to_raid", Raider.class);

    GoalKey<Raider> NEAREST_ATTACKABLE_WITCH = of("nearest_attackable_witch", Raider.class);

    GoalKey<Raider> NEAREST_HEALABLE_RAIDER = of("nearest_healable_raider", Raider.class);

    GoalKey<Raider> LONG_DISTANCE_PATROL = of("long_distance_patrol", Raider.class);

    GoalKey<Raider> HOLD_GROUND_ATTACK = of("hold_ground_attack", Raider.class);

    GoalKey<Raider> OBTAIN_RAID_LEADER_BANNER = of("obtain_raid_leader_banner", Raider.class);

    GoalKey<Raider> RAIDER_CELEBRATION = of("raider_celebration", Raider.class);

    GoalKey<Raider> RAIDER_MOVE_THROUGH_VILLAGE = of("raider_move_through_village", Raider.class);

    GoalKey<Ravager> RAVAGER_MELEE_ATTACK = of("ravager_melee_attack", Ravager.class);

    GoalKey<Shulker> SHULKER_ATTACK = of("shulker_attack", Shulker.class);

    GoalKey<Shulker> SHULKER_DEFENSE_ATTACK = of("shulker_defense_attack", Shulker.class);

    GoalKey<Shulker> SHULKER_NEAREST_ATTACK = of("shulker_nearest_attack", Shulker.class);

    GoalKey<Shulker> SHULKER_PEEK = of("shulker_peek", Shulker.class);

    GoalKey<Silverfish> SILVERFISH_MERGE_WITH_STONE = of("silverfish_merge_with_stone", Silverfish.class);

    GoalKey<Silverfish> SILVERFISH_WAKE_UP_FRIENDS = of("silverfish_wake_up_friends", Silverfish.class);

    GoalKey<SkeletonHorse> SKELETON_TRAP = of("skeleton_trap", SkeletonHorse.class);

    GoalKey<Slime> SLIME_ATTACK = of("slime_attack", Slime.class);

    GoalKey<Slime> SLIME_FLOAT = of("slime_float", Slime.class);

    GoalKey<Slime> SLIME_KEEP_ON_JUMPING = of("slime_keep_on_jumping", Slime.class);

    GoalKey<Slime> SLIME_RANDOM_DIRECTION = of("slime_random_direction", Slime.class);

    GoalKey<Spellcaster> SPELLCASTER_CASTING_SPELL = of("spellcaster_casting_spell", Spellcaster.class);

    GoalKey<Spider> SPIDER_ATTACK = of("spider_attack", Spider.class);

    GoalKey<Spider> SPIDER = of("spider", Spider.class);

    GoalKey<Squid> SQUID_FLEE = of("squid_flee", Squid.class);

    GoalKey<Squid> SQUID_RANDOM_MOVEMENT = of("squid_random_movement", Squid.class);

    GoalKey<Strider> STRIDER_GO_TO_LAVA = of("strider_go_to_lava", Strider.class);

    GoalKey<Tameable> FOLLOW_OWNER = of("follow_owner", Tameable.class);

    GoalKey<Tameable> SIT_WHEN_ORDERED_TO = of("sit_when_ordered_to", Tameable.class);

    GoalKey<Tameable> NON_TAME_RANDOM = of("non_tame_random", Tameable.class);

    GoalKey<Tameable> OWNER_HURT_BY = of("owner_hurt_by", Tameable.class);

    GoalKey<Tameable> OWNER_HURT = of("owner_hurt", Tameable.class);

    GoalKey<Turtle> TURTLE_BREED = of("turtle_breed", Turtle.class);

    GoalKey<Turtle> TURTLE_GO_HOME = of("turtle_go_home", Turtle.class);

    GoalKey<Turtle> TURTLE_GO_TO_WATER = of("turtle_go_to_water", Turtle.class);

    GoalKey<Turtle> TURTLE_LAY_EGG = of("turtle_lay_egg", Turtle.class);

    GoalKey<Turtle> TURTLE_PANIC = of("turtle_panic", Turtle.class);

    GoalKey<Turtle> TURTLE_RANDOM_STROLL = of("turtle_random_stroll", Turtle.class);

    GoalKey<Turtle> TURTLE_TRAVEL = of("turtle_travel", Turtle.class);

    GoalKey<Vex> VEX_CHARGE_ATTACK = of("vex_charge_attack", Vex.class);

    GoalKey<Vex> VEX_COPY_OWNER = of("vex_copy_owner", Vex.class);

    GoalKey<Vex> VEX_RANDOM_MOVE = of("vex_random_move", Vex.class);

    GoalKey<Vindicator> VINDICATOR_JOHNNY_ATTACK = of("vindicator_johnny_attack", Vindicator.class);

    GoalKey<Vindicator> VINDICATOR_MELEE_ATTACK = of("vindicator_melee_attack", Vindicator.class);

    GoalKey<WanderingTrader> WANDER_TO_POSITION = of("wander_to_position", WanderingTrader.class);

    GoalKey<Wither> WITHER_DO_NOTHING = of("wither_do_nothing", Wither.class);

    GoalKey<Wolf> BEG = of("beg", Wolf.class);

    GoalKey<Wolf> WOLF_AVOID_ENTITY = of("wolf_avoid_entity", Wolf.class);

    GoalKey<Wolf> WOLF_PANIC = of("wolf_panic", Wolf.class);

    GoalKey<Zombie> ZOMBIE_ATTACK = of("zombie_attack", Zombie.class);

    GoalKey<Zombie> ZOMBIE_ATTACK_TURTLE_EGG = of("zombie_attack_turtle_egg", Zombie.class);

    private static @NotNull GoalKey of(final @NotNull String key, final @NotNull Class clazz) {
        return GoalKey.of(clazz, NamespacedKey.minecraft(key));
    }
}
