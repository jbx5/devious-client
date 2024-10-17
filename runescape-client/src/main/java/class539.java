import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ue")
public class class539 extends class497 implements class311 {
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	final AbstractArchive field5372;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	final DemotingHashTable field5370;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1498689019
	)
	final int field5368;

	@ObfuscatedSignature(
		descriptor = "(Loy;ILpn;Lpe;)V"
	)
	public class539(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5370 = new DemotingHashTable(64);
		this.field5372 = var4;
		this.field5368 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltv;",
		garbageValue = "-3"
	)
	protected class499 vmethod9897(int var1) {
		synchronized(this.field5370) {
			class498 var2 = (class498)this.field5370.get((long)var1);
			if (var2 == null) {
				var2 = this.method9888(var1);
				this.field5370.method6450(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ltq;",
		garbageValue = "1841583720"
	)
	class498 method9888(int var1) {
		byte[] var2 = this.field5372.takeFile(this.field5368, var1);
		class498 var3 = new class498(var1);
		if (var2 != null) {
			var3.method9346(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1503556707"
	)
	public void method9889() {
		synchronized(this.field5370) {
			this.field5370.clear();
		}
	}

	public Iterator iterator() {
		return new class538(this);
	}
}
