import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("LoginPacket")
public class LoginPacket extends class145 {
	@ObfuscatedName("af")
	public static short[][] field1665;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -1426659775971560283L
	)
	long field1667;
	@ObfuscatedName("aw")
	String field1664;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	LoginPacket(class148 var1) {
		this.this$0 = var1;
		this.field1667 = -1L;
		this.field1664 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1667 = var1.readLong();
		}

		this.field1664 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3362(this.field1667, this.field1664, 0);
	}

	@ObfuscatedName("aq")
	public static final void method3209(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				GrandExchangeOfferOwnWorldComparator.method1205(var0 - 1L);
				GrandExchangeOfferOwnWorldComparator.method1205(1L);
			} else {
				GrandExchangeOfferOwnWorldComparator.method1205(var0);
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FFFFFFFFI)V",
		garbageValue = "-2128666244"
	)
	static void method3208(class132 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			var0.field1561 = var1;
			float var9 = var4 - var1;
			float var10 = var8 - var5;
			float var11 = var2 - var1;
			float var12 = 0.0F;
			float var13 = 0.0F;
			if ((double)var11 != 0.0D) {
				var12 = (var6 - var5) / var11;
			}

			var11 = var4 - var3;
			if ((double)var11 != 0.0D) {
				var13 = (var8 - var7) / var11;
			}

			float var14 = 1.0F / (var9 * var9);
			float var15 = var12 * var9;
			float var16 = var13 * var9;
			var0.field1563 = (var15 + var16 - var10 - var10) * var14 / var9;
			var0.field1564 = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
			var0.field1562 = var12;
			var0.field1566 = var5;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static void method3203() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class30.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class30.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "720920902"
	)
	static void method3200() {
		Varps.compass = null;
		ItemComposition.redHintArrowSprite = null;
		AbstractSocket.mapSceneSprites = null;
		class13.headIconPkSprites = null;
		class168.headIconPrayerSprites = null;
		ChatChannel.headIconHintSprites = null;
		Players.mapDotSprites = null;
		GrandExchangeOfferOwnWorldComparator.crossSprites = null;
		class246.field2581 = null;
		ClanChannelMember.scrollBarSprites = null;
		WorldMapCacheName.field2685 = null;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)V",
		garbageValue = "104"
	)
	static void method3207(NPC var0) {
		var0.field1212 = var0.definition.size;
		var0.field1249 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field1979;
		var0.field1219 = var0.definition.field1980;
		var0.field1220 = var0.definition.field1987;
		var0.field1221 = var0.definition.field1982;
		var0.field1222 = var0.definition.field1983;
		var0.field1216 = var0.definition.field1966;
		var0.field1224 = var0.definition.field1984;
		var0.field1225 = var0.definition.field1986;
	}
}
