import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class151 extends class144 {
	@ObfuscatedName("az")
	boolean field1720;
	@ObfuscatedName("ah")
	byte field1716;
	@ObfuscatedName("af")
	byte field1717;
	@ObfuscatedName("at")
	byte field1715;
	@ObfuscatedName("an")
	byte field1718;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class151(class147 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1720 = var1.readUnsignedByte() == 1;
		this.field1716 = var1.readByte();
		this.field1717 = var1.readByte();
		this.field1715 = var1.readByte();
		this.field1718 = var1.readByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.allowGuests = this.field1720;
		var1.field1752 = this.field1716;
		var1.field1740 = this.field1717;
		var1.field1749 = this.field1715;
		var1.field1741 = this.field1718;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "915265909"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (NPC.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field770[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
