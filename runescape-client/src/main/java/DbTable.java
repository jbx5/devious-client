import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
@Implements("DbTable")
public class DbTable extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	class503[] field5046;
	@ObfuscatedName("as")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method8988(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method8988(new Buffer(var4));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "702803819"
	)
	void method8988(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5046 = new class503[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5046[var3] = (class503)ClientPreferences.findEnumerated(class503.method8943(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5046[var3].method8938(var1);
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;IB)Ljava/util/List;",
		garbageValue = "-17"
	)
	public List method8989(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}
}
