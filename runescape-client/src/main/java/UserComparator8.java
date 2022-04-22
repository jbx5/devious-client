import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("ej")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnf;Lnf;I)I", garbageValue = 
	"1968732766")

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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ldt;[F[FB)V", garbageValue = 
	"-60")

	static void method2574(class117 var0, float[] var1, float[] var2) {
		if (var0 != null) {
			var0.field1422 = var1[0];
			float var3 = var1[3] - var1[0];
			float var4 = var2[3] - var2[0];
			float var5 = var1[1] - var1[0];
			float var6 = 0.0F;
			float var7 = 0.0F;
			if (0.0 != ((double) (var5))) {
				var6 = (var2[1] - var2[0]) / var5;
			}

			var5 = var1[3] - var1[2];
			if (((double) (var5)) != 0.0) {
				var7 = (var2[3] - var2[2]) / var5;
			}

			float var8 = 1.0F / (var3 * var3);
			float var9 = var3 * var6;
			float var10 = var3 * var7;
			var0.field1415[0] = ((((var9 + var10) - var4) - var4) * var8) / var3;
			var0.field1415[1] = var8 * (((((var4 + var4) + var4) - var9) - var9) - var10);
			var0.field1415[2] = var6;
			var0.field1415[3] = var2[0];
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = 
	"(Lcb;I)V", garbageValue = 
	"1404835546")

	static final void method2578(Actor var0) {
		int var1 = Math.max(1, var0.field1143 - Client.cycle);
		int var2 = (var0.field1150 * 64) + (var0.field1129 * 128);
		int var3 = (var0.field1150 * 64) + (var0.field1160 * 128);
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1179 = 0;
		var0.orientation = var0.field1135;
	}
}