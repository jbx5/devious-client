import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ep")
public class class140 extends class144 {
	@ObfuscatedName("s")
	String field1627;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1156811659)
	int field1628;

	@ObfuscatedName("w")
	byte field1626;

	@ObfuscatedSignature(descriptor = "Let;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Let;)V")
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1627 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "1539485988")
	void vmethod3074(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}
		this.field1627 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1628 = var1.readUnsignedShort();
		this.field1626 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lec;I)V", garbageValue = "-1270425284")
	void vmethod3073(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1627);
		var2.world = this.field1628;
		var2.rank = this.field1626;
		var1.addMember(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "([BIII)Z", garbageValue = "-487769404")
	static final boolean method2968(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;
		label70 : while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}
			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label70;
					}
					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = FileSystem.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field644;
								var3 = false;
							}
							var8 = true;
						}
					}
				} 
				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}
				var4.readUnsignedByte();
			} 
		} 
	}
}