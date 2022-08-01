import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@ObfuscatedName("pp")
public class class437 extends DualNode {
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "[Lpy;")
	class433[] field4686;

	@ObfuscatedName("c")
	List field4687;

	@ObfuscatedSignature(descriptor = "(Llc;I)V")
	public class437(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method7630(new Buffer(var3));
	}

	@ObfuscatedSignature(descriptor = "(Llc;II)V")
	public class437(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method7630(new Buffer(var4));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "-15")
	void method7630(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field4686 = new class433[var2];
		this.field4687 = new ArrayList(var2);
		for (int var3 = 0; var3 < var2; ++var3) {
			this.field4686[var3] = ((class433) (class271.findEnumerated(class433.method7604(), var1.readUnsignedByte())));
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);
			while (var4-- > 0) {
				Object var6 = this.field4686[var3].method7602(var1);
				int var7 = var1.packBytesToInt();
				ArrayList var8 = new ArrayList();
				while (var7-- > 0) {
					int var9 = var1.packBytesToInt();
					var8.add(var9);
				} 
				var5.put(var6, var8);
			} 
			this.field4687.add(var3, var5);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;II)Ljava/util/List;", garbageValue = "1405494936")
	public List method7633(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}
		Map var3 = ((Map) (this.field4687.get(var2)));
		return ((List) (var3.get(var1)));
	}
}