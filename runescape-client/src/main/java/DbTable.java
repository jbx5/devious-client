import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
@Implements("DbTable")
public class DbTable extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Ltq;"
	)
	class518[] field5122;
	@ObfuscatedName("aq")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Low;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method9279(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Low;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method9279(new Buffer(var4));
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "5"
	)
	void method9279(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5122 = new class518[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5122[var3] = (class518)GrandExchangeEvents.findEnumerated(class518.method9256(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5122[var3].method9243(var1);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "1390547755"
	)
	public List method9281(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}
}
