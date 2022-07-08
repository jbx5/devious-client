import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@ObfuscatedName("ps")
public class class436 extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "[Lpv;")
	class432[] field4670;

	@ObfuscatedName("j")
	List field4673;

	@ObfuscatedSignature(descriptor = "(Llh;I)V")
	public class436(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method7618(new Buffer(var3));
	}

	@ObfuscatedSignature(descriptor = "(Llh;II)V")
	public class436(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method7618(new Buffer(var4));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "-1912545561")
	void method7618(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field4670 = new class432[var2];
		this.field4673 = new ArrayList(var2);
		for (int var3 = 0; var3 < var2; ++var3) {
			this.field4670[var3] = ((class432) (Actor.findEnumerated(class432.method7566(), var1.readUnsignedByte())));
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);
			while (var4-- > 0) {
				Object var6 = this.field4670[var3].method7565(var1);
				int var7 = var1.packBytesToInt();
				ArrayList var8 = new ArrayList();
				while (var7-- > 0) {
					int var9 = var1.packBytesToInt();
					var8.add(var9);
				} 
				var5.put(var6, var8);
			} 
			this.field4673.add(var3, var5);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;II)Ljava/util/List;", garbageValue = "-1640295603")
	public List method7619(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}
		Map var3 = ((Map) (this.field4673.get(var2)));
		return ((List) (var3.get(var1)));
	}
}