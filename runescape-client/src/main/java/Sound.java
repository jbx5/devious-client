import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("Sound")
public class Sound extends class150 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -965595385
	)
	static int field1747;
	@ObfuscatedName("az")
	static String[] field1740;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field1746;
	@ObfuscatedName("ap")
	boolean field1745;
	@ObfuscatedName("aw")
	byte field1741;
	@ObfuscatedName("ak")
	byte field1744;
	@ObfuscatedName("aj")
	byte field1742;
	@ObfuscatedName("ai")
	byte field1743;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	Sound(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1745 = var1.readUnsignedByte() == 1;
		this.field1741 = var1.readByte();
		this.field1744 = var1.readByte();
		this.field1742 = var1.readByte();
		this.field1743 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.allowGuests = this.field1745;
		var1.field1772 = this.field1741;
		var1.field1776 = this.field1744;
		var1.field1790 = this.field1742;
		var1.field1775 = this.field1743;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	public static void method3629() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}
}
