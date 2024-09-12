import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
@Implements("DbTable")
public class DbTable extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lux;"
	)
	class537[] field5351;
	@ObfuscatedName("ax")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Lpo;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method9807(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lpo;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method9807(new Buffer(var4));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "1940228773"
	)
	void method9807(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5351 = new class537[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5351[var3] = (class537)ArchiveDiskAction.findEnumerated(class537.method9774(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5351[var3].method9761(var1);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;IB)Ljava/util/List;",
		garbageValue = "-36"
	)
	public List method9811(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}
}
