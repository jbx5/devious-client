import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class156 extends class166 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field1738;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1124362201
	)
	int field1735;
	@ObfuscatedName("ae")
	byte field1733;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -237535629
	)
	int field1732;
	@ObfuscatedName("am")
	String field1734;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgj;)V"
	)
	class156(class167 var1) {
		this.this$0 = var1;
		this.field1735 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "0"
	)
	void vmethod3761(Buffer var1) {
		this.field1735 = var1.readUnsignedShort();
		this.field1733 = var1.readByte();
		this.field1732 = var1.readUnsignedShort();
		var1.readLong();
		this.field1734 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-1593238865"
	)
	void vmethod3762(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1735);
		var2.rank = this.field1733;
		var2.world = this.field1732;
		var2.username = new Username(this.field1734);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "10"
	)
	public static void method3532(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var8 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
	}
}
