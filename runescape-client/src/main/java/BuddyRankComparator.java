import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;I)I",
		garbageValue = "2133335692"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;ZLqh;I)V",
		garbageValue = "-1850652416"
	)
	public static void method3031(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemDefinition_archive = var0;
		SecureRandomFuture.ItemDefinition_modelArchive = var1;
		ItemComposition.ItemDefinition_inMembersWorld = var2;
		class76.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
		class136.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-443491666"
	)
	static void method3029(float[] var0) {
		if (class131.field1544 + var0[0] < 1.3333334F) {
			float var1 = var0[0] - 2.0F;
			float var2 = var0[0] - 1.0F;
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * var2 * 4.0F));
			float var4 = 0.5F * (var3 + -var1);
			if (var0[1] + class131.field1544 > var4) {
				var0[1] = var4 - class131.field1544;
			} else {
				var4 = (-var1 - var3) * 0.5F;
				if (var0[1] < class131.field1544 + var4) {
					var0[1] = class131.field1544 + var4;
				}
			}
		} else {
			var0[0] = 1.3333334F - class131.field1544;
			var0[1] = 0.33333334F - class131.field1544;
		}

	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-88833176"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ModeWhere.widgetDefinition.loadInterface(var0)) {
			class214.runComponentCloseListeners(ModeWhere.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1078593888"
	)
	public static boolean method3038() {
		return Client.staffModLevel >= 2;
	}
}
