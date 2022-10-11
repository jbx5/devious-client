import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class135 extends class145 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 593153933
	)
	int field1599;
	@ObfuscatedName("p")
	byte field1598;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1248744063
	)
	int field1600;
	@ObfuscatedName("n")
	String field1601;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class135(class146 var1) {
		this.this$0 = var1;
		this.field1599 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-64301329"
	)
	void vmethod3300(Buffer var1) {
		this.field1599 = var1.readUnsignedShort(); // L: 109
		this.field1598 = var1.readByte(); // L: 110
		this.field1600 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1601 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "97"
	)
	void vmethod3302(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1599); // L: 117
		var2.rank = this.field1598; // L: 118
		var2.world = this.field1600; // L: 119
		var2.username = new Username(this.field1601); // L: 120
	} // L: 121

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1505004044"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class399.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false); // L: 9374
	} // L: 9375
}
