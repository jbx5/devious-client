import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class438 extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lps;"
	)
	class434[] field4711;
	@ObfuscatedName("k")
	List field4710;

	@ObfuscatedSignature(
		descriptor = "(Llv;I)V"
	)
	public class438(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method7823(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Llv;II)V"
	)
	public class438(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method7823(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "27"
	)
	void method7823(Buffer var1) {
		int var2 = var1.packBytesToInt(); // L: 31
		this.field4711 = new class434[var2]; // L: 32
		this.field4710 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field4711[var3] = (class434)Varps.findEnumerated(class434.method7781(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.packBytesToInt(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field4711[var3].method7778(var1); // L: 39
				int var7 = var1.packBytesToInt(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.packBytesToInt(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field4710.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "-592587149"
	)
	public List method7824(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field4710.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
