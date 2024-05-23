import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
@Implements("DbTable")
public class DbTable extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 46472907
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Luy;"
	)
	class533[] field5283;
	@ObfuscatedName("af")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Lor;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method9551(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lor;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method9551(new Buffer(var4));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "304196563"
	)
	void method9551(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5283 = new class533[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5283[var3] = (class533)MenuAction.findEnumerated(class533.method9515(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5283[var3].method9508(var1);
				int var7 = var1.packBytesToInt();
				ArrayList var8 = new ArrayList();

				while (var7-- > 0) {
					int var9 = var1.packBytesToInt();
					var8.add(var9);
				}

				var5.put(var6, var8);
			}

			this.columns.add(var3, var5);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "-1612093890"
	)
	public List method9552(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}
}
