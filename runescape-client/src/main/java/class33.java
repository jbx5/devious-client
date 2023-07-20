import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class33 {
	@ObfuscatedName("aq")
	public static short[] field196;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 401350003
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1123907327
	)
	int field189;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1859599279
	)
	int field194;

	class33(int var1, int var2) {
		this.field189 = var1;
		this.field194 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lba;S)Z",
		garbageValue = "-1563"
	)
	boolean method470(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field189) {
			case 1:
				return var1.vmethod4143(this.field194);
			case 2:
				return var1.vmethod4148(this.field194);
			case 3:
				return var1.vmethod4145((char)this.field194);
			case 4:
				return var1.vmethod4147(this.field194 == 1);
			default:
				return false;
			}
		}
	}
}
