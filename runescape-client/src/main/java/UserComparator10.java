import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = -1065479945
	)
	static int field1521;
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lsv;I)I",
		garbageValue = "-1983961875"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfv;I)V",
		garbageValue = "663536347"
	)
	static void method3328(float var0, float var1, float var2, float var3, class137 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1594 = var7 - var6 - var8;
		var4.field1606 = var8 + var8 + var8;
		var4.field1607 = var5 + var5 + var5;
		var4.field1604 = var0;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1923335530"
	)
	static final void method3329(int var0, int var1) {
		if (Client.menu.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = MusicPatchPcmStream.method6792();
				String var3;
				if (Client.isItemSelected == 1 && Client.menu.menuOptionsCount < 2) {
					var3 = "Use" + " " + Client.field659 + " " + "->";
				} else if (Client.isSpellSelected && Client.menu.menuOptionsCount < 2) {
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = Client.menu.method10757(var2);
				}

				if (Client.menu.menuOptionsCount > 2) {
					var3 = var3 + class204.colorStartTag(16777215) + " " + '/' + " " + (Client.menu.menuOptionsCount - 2) + " more options";
				}

				Calendar.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}
