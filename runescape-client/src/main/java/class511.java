import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
class class511 implements Iterator {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2090522307
	)
	int field5058;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	final class512 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ltx;)V"
	)
	class511(class512 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field5058 - 1;
		class471 var2 = (class471)this.this$0.field5059.get((long)var1);
		return var2 != null ? var2 : this.this$0.method8992(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return this.field5058 < this.this$0.method8449();
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class33.widgetDefinition.loadInterface(var0)) {
			class108.updateInterface(class33.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
