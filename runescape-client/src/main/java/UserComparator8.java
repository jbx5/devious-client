import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("dm")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnm;Lnm;I)I", garbageValue = "1682683031")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}
		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "6")
	static void method2571(int var0, int var1) {
		int var2 = TileItem.fontBold12.stringWidth("Choose Option");
		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			Font var7 = TileItem.fontBold12;
			String var8;
			if (var3 < 0) {
				var8 = "";
			} else if (Client.menuTargets[var3].length() > 0) {
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3];
			}
			int var6 = var7.stringWidth(var8);
			if (var6 > var2) {
				var2 = var6;
			}
		}
		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		int var4 = var0 - var2 / 2;
		if (var2 + var4 > Script.canvasWidth) {
			var4 = Script.canvasWidth - var2;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		int var5 = var1;
		if (var3 + var1 > class78.canvasHeight) {
			var5 = class78.canvasHeight - var3;
		}
		if (var5 < 0) {
			var5 = 0;
		}
		UserComparator3.menuX = var4;
		ViewportMouse.menuY = var5;
		Language.menuWidth = var2;
		Player.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}