import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class174 extends class150 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -847201743
	)
	int field1866;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -4679908001659957035L
	)
	long field1862;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class174(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1866 = var1.readInt();
		this.field1862 = var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3670(this.field1866, this.field1862);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lvc;",
		garbageValue = "-1311335863"
	)
	static IndexedSprite method3827(boolean var0, boolean var1) {
		return var0 ? (var1 ? IntHashTable.field5625 : UserList.options_buttons_2Sprite) : (var1 ? class77.field919 : class33.options_buttons_0Sprite);
	}
}
