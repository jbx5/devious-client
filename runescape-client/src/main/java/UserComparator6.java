import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;I)I",
		garbageValue = "-110280632"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1944121723"
	)
	static boolean method2923() {
		Date var0;
		try {
			var0 = SpotAnimationDefinition.method3765();
		} catch (ParseException var6) {
			WorldMapScaleHandler.method5627("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var4 = ModelData0.method5024(var0);
			Date var3 = class312.method5971();
			boolean var2 = var0.after(var3);
			if (!var2) {
				PcmPlayer.method838(7);
				class318.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var4) {
					class72.field906 = 8388607;
				} else {
					class72.field906 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lui;",
		garbageValue = "111"
	)
	static SpritePixels method2922() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class529.SpriteBuffer_spriteWidth;
		var0.height = class420.SpriteBuffer_spriteHeight;
		var0.xOffset = class529.SpriteBuffer_xOffsets[0];
		var0.yOffset = class152.SpriteBuffer_yOffsets[0];
		var0.subWidth = HealthBarUpdate.SpriteBuffer_spriteWidths[0];
		var0.subHeight = SpriteMask.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = Coord.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = DbTableType.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class529.SpriteBuffer_xOffsets = null;
		class152.SpriteBuffer_yOffsets = null;
		HealthBarUpdate.SpriteBuffer_spriteWidths = null;
		SpriteMask.SpriteBuffer_spriteHeights = null;
		DbTableType.SpriteBuffer_spritePalette = null;
		Coord.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-11"
	)
	static boolean method2921() {
		return (Client.drawPlayerNames & 4) != 0;
	}
}
