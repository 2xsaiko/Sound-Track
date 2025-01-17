package xyz.coolsa.sound_track;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class SoundTrackConstants {
	/**
	 * Name of the mod, for all identifiers used.
	 */
	public static final String MOD_NAME = "sound_track";
	/**
	 * Jukebox minecart packet identifier.
	 */
	public static final Identifier JUKEBOX_MINECART_PLAY = new Identifier(MOD_NAME, "jukebox_minecart_play");
	/**
	 * The ID of the jukebox minecart item.
	 */
	public static final Identifier JUKEBOX_MINECART_ITEM_ID = new Identifier(MOD_NAME, "jukebox_minecart");
	/**
	 * The ID of the jukebox minecart entity.
	 */
	public static final Identifier JUKEBOX_MINECART_ENTITY_ID = new Identifier(MOD_NAME, "jukebox_minecart");
	/**
	 * The actual jukebox minecart item.
	 */
	public static final Item JUKEBOX_MINECART_ITEM = new JukeboxMinecartItem(
			new Item.Settings().maxCount(1).group(ItemGroup.TRANSPORTATION));
	/**
	 * The actual jukebox minecart entity.
	 */
	public static final EntityType<JukeboxMinecartEntity> JUKEBOX_MINECART_ENTITY = EntityType.Builder
			.<JukeboxMinecartEntity>create(JukeboxMinecartEntity::new, SpawnGroup.MISC).setDimensions(0.98f, 0.7f)
			.maxTrackingRange(8).build(JUKEBOX_MINECART_ENTITY_ID.toString());
	
	
	/**
	 * Noteblock minecart packet identifier.
	 */
	public static final Identifier NOTEBLOCK_MINECART_PLAY = new Identifier(MOD_NAME, "noteblock_minecart_play");
	/**
	 * The ID of the noteblock minecart item.
	 */
	public static final Identifier NOTEBLOCK_MINECART_ITEM_ID = new Identifier(MOD_NAME, "noteblock_minecart");
	/**
	 * The ID of the noteblock minecart entity.
	 */
	public static final Identifier NOTEBLOCK_MINECART_ENTITY_ID = new Identifier(MOD_NAME, "noteblock_minecart");
	/**
	 * The actual noteblock minecart item.
	 */
	public static final Item NOTEBLOCK_MINECART_ITEM = new NoteblockMinecartItem(
			new Item.Settings().maxCount(1).group(ItemGroup.TRANSPORTATION));
	/**
	 * The actual noteblock minecart entity.
	 */
	public static final EntityType<NoteblockMinecartEntity> NOTEBLOCK_MINECART_ENTITY = EntityType.Builder
			.<NoteblockMinecartEntity>create(NoteblockMinecartEntity::new, SpawnGroup.MISC).setDimensions(0.98f, 0.7f)
			.maxTrackingRange(8).build(NOTEBLOCK_MINECART_ENTITY_ID.toString());
}
