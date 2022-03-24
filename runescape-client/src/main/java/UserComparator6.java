import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnl;Lnl;B)I", garbageValue = 
	"114")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if ((var1.world != 0) && (var2.world != 0)) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IIII)I", garbageValue = 
	"551180200")

	static final int method2631(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & (var2 - 1);
		int var5 = var1 / var2;
		int var6 = var1 & (var2 - 1);
		int var7 = Language.method6137(var3, var5);
		int var8 = Language.method6137(var3 + 1, var5);
		int var9 = Language.method6137(var3, var5 + 1);
		int var10 = Language.method6137(var3 + 1, var5 + 1);
		int var12 = (65536 - Rasterizer3D.Rasterizer3D_cosine[(var4 * 1024) / var2]) >> 1;
		int var11 = (((65536 - var12) * var7) >> 16) + ((var12 * var8) >> 16);
		int var14 = (65536 - Rasterizer3D.Rasterizer3D_cosine[(var4 * 1024) / var2]) >> 1;
		int var13 = (((65536 - var14) * var9) >> 16) + ((var14 * var10) >> 16);
		int var16 = (65536 - Rasterizer3D.Rasterizer3D_cosine[(var6 * 1024) / var2]) >> 1;
		int var15 = (((65536 - var16) * var11) >> 16) + ((var13 * var16) >> 16);
		return var15;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-328819266")

	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field529 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (ReflectionCheck.getWindowedMode() == 1) {
			UserComparator10.client.setMaxCanvasSize(765, 503);
		} else {
			UserComparator10.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			class17.method228();
		}

	}
}