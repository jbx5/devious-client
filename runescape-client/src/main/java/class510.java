import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
public class class510 implements class509 {
	@ObfuscatedName("az")
	Map field5105;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	final class542 field5106;

	@ObfuscatedSignature(
		descriptor = "(Lue;)V"
	)
	public class510(class542 var1) {
		this.field5106 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2143750813"
	)
	public int vmethod8996(int var1) {
		if (this.field5105 != null) {
			class543 var2 = (class543)this.field5105.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5300;
			}
		}

		return (Integer)this.field5106.vmethod9575(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-220650220"
	)
	public void vmethod8990(int var1, Object var2) {
		if (this.field5105 == null) {
			this.field5105 = new HashMap();
			this.field5105.put(var1, new class543(var1, var2));
		} else {
			class543 var3 = (class543)this.field5105.get(var1);
			if (var3 == null) {
				this.field5105.put(var1, new class543(var1, var2));
			} else {
				var3.field5300 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5105 == null ? Collections.emptyList().iterator() : this.field5105.values().iterator();
	}
}
