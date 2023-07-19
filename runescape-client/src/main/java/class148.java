import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class148 extends class143 {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1670;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -607814879
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1269845755
	)
	int field1669;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -4986227
	)
	int field1666;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 57408083
	)
	int field1668;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1191160211
	)
	int field1667;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class148(class146 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1669 = var1.readInt();
		this.field1667 = var1.readInt();
		this.field1666 = var1.readUnsignedByte();
		this.field1668 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3237(this.field1669, this.field1667, this.field1666, this.field1668);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILrg;Lny;B)V",
		garbageValue = "98"
	)
	static void method3170(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		class292.method5721();
	}
}
