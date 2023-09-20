import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3876(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3858(1, 0),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3859(2, 0),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3860(3, 0),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3861(9, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3862(4, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3863(5, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3864(6, 1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3866(7, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3869(8, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3867(12, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3877(13, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3857(14, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3870(15, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3871(16, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3872(17, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3873(18, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3865(19, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3874(20, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3868(21, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3878(10, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3875(11, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3879(22, 3);

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field3881;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2043103513
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	public static void method6793(int var0, int var1) {
		Iterator var2 = class319.field3434.iterator();

		while (var2.hasNext()) {
			class325 var3 = (class325)var2.next();
			var3.vmethod6161(var0, var1);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1905325743"
	)
	public static void method6792() {
		synchronized(ArchiveDiskActionHandler.field4292) {
			if (ArchiveDiskActionHandler.field4294 != 0) {
				ArchiveDiskActionHandler.field4294 = 1;
				ArchiveDiskActionHandler.field4300 = true;

				try {
					ArchiveDiskActionHandler.field4292.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}
}
