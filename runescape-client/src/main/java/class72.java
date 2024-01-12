import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public class class72 {
	@ObfuscatedName("aq")
	static final BigInteger field879;
	@ObfuscatedName("ar")
	static final BigInteger field880;

	static {
		field879 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field880 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1390552915"
	)
	static void method2149(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BB)Lpv;",
		garbageValue = "-99"
	)
	@Export("fontFromBytes")
	public static Font fontFromBytes(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, SpriteBufferProperties.SpriteBuffer_xOffsets, class388.SpriteBuffer_yOffsets, FriendsList.SpriteBuffer_spriteWidths, GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights, SecureUrlRequester.SpriteBuffer_spritePalette, class230.SpriteBuffer_pixels);
			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			class388.SpriteBuffer_yOffsets = null;
			FriendsList.SpriteBuffer_spriteWidths = null;
			GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null;
			SecureUrlRequester.SpriteBuffer_spritePalette = null;
			class230.SpriteBuffer_pixels = null;
			return var1;
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)Lsa;",
		garbageValue = "-293345618"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return FriendSystem.platformInfo;
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	public static boolean method2148() {
		return Client.clickedWidget != null;
	}
}
