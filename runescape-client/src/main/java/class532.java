import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public class class532 extends class490 implements class312 {
	@ObfuscatedName("hc")
	@Export("gameSessionServiceBaseUrl")
	static String gameSessionServiceBaseUrl;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	final AbstractArchive field5321;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	final DemotingHashTable field5320;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1446631929
	)
	final int field5319;

	@ObfuscatedSignature(
		descriptor = "(Lob;ILpx;Lpo;)V"
	)
	public class532(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5320 = new DemotingHashTable(64);
		this.field5321 = var4;
		this.field5319 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsz;",
		garbageValue = "16"
	)
	protected class492 vmethod9715(int var1) {
		synchronized(this.field5320) {
			class491 var2 = (class491)this.field5320.get((long)var1);
			if (var2 == null) {
				var2 = this.method9707(var1);
				this.field5320.method6350(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsx;",
		garbageValue = "4"
	)
	class491 method9707(int var1) {
		byte[] var2 = this.field5321.takeFile(this.field5319, var1);
		class491 var3 = new class491(var1);
		if (var2 != null) {
			var3.method9166(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1476048377"
	)
	public void method9713() {
		synchronized(this.field5320) {
			this.field5320.clear();
		}
	}

	public Iterator iterator() {
		return new class531(this);
	}
}
