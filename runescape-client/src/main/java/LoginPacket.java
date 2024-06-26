import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("LoginPacket")
public class LoginPacket extends class147 {
	@ObfuscatedName("ap")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1684;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 1778310617
	)
	static int field1682;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 3441742155483086295L
	)
	long field1685;
	@ObfuscatedName("ad")
	String field1683;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	LoginPacket(class150 var1) {
		this.this$0 = var1;
		this.field1685 = -1L;
		this.field1683 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1685 = var1.readLong();
		}

		this.field1683 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3378(this.field1685, this.field1683, 0);
	}
}
