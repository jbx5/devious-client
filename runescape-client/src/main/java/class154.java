import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class154 extends class164 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1396660329
	)
	int field1710;
	@ObfuscatedName("ay")
	byte field1707;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 57929379
	)
	int field1708;
	@ObfuscatedName("au")
	String field1711;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class165 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class154(class165 var1) {
		this.this$0 = var1;
		this.field1710 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-40"
	)
	void vmethod3611(Buffer var1) {
		this.field1710 = var1.readUnsignedShort();
		this.field1707 = var1.readByte();
		this.field1708 = var1.readUnsignedShort();
		var1.readLong();
		this.field1711 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgx;I)V",
		garbageValue = "-357446960"
	)
	void vmethod3612(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1710);
		var2.rank = this.field1707;
		var2.world = this.field1708;
		var2.username = new Username(this.field1711);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1979740784"
	)
	public static void method3401() {
		ParamComposition.ParamDefinition_cached.clear();
	}
}
