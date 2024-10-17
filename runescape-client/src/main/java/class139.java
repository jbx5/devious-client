import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class139 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1641;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1627;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1647;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1629;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1630;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1631;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1637;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1633;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1626;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1635;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1636;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1628;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1638;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1644;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1640;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1632;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class139 field1642;
	@ObfuscatedName("aa")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -569897403
	)
	final int field1643;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 288641261
	)
	final int field1634;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1292926075
	)
	final int field1645;

	static {
		field1641 = new class139(0, 0, (String)null, -1, -1);
		field1627 = new class139(1, 1, (String)null, 0, 2);
		field1647 = new class139(2, 2, (String)null, 1, 2);
		field1629 = new class139(3, 3, (String)null, 2, 2);
		field1630 = new class139(4, 4, (String)null, 3, 1);
		field1631 = new class139(5, 5, (String)null, 4, 1);
		field1637 = new class139(6, 6, (String)null, 5, 1);
		field1633 = new class139(7, 7, (String)null, 6, 3);
		field1626 = new class139(8, 8, (String)null, 7, 3);
		field1635 = new class139(9, 9, (String)null, 8, 3);
		field1636 = new class139(10, 10, (String)null, 0, 7);
		field1628 = new class139(11, 11, (String)null, 1, 7);
		field1638 = new class139(12, 12, (String)null, 2, 7);
		field1644 = new class139(13, 13, (String)null, 3, 7);
		field1640 = new class139(14, 14, (String)null, 4, 7);
		field1632 = new class139(15, 15, (String)null, 5, 7);
		field1642 = new class139(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class139(int var1, int var2, String var3, int var4, int var5) {
		this.field1643 = var1;
		this.field1634 = var2;
		this.field1645 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1634;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "975980670"
	)
	int method3485() {
		return this.field1645;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1333699905"
	)
	public static void method3489() {
		synchronized(ArchiveDiskActionHandler.field4535) {
			if (ArchiveDiskActionHandler.field4534 != 0) {
				ArchiveDiskActionHandler.field4534 = 1;

				try {
					ArchiveDiskActionHandler.field4535.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}
}
