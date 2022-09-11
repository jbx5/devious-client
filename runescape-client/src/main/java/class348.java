import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class348 implements Iterator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	class349 field4209;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1976768071
	)
	int field4211;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1367600821
	)
	int field4210;

	@ObfuscatedSignature(
		descriptor = "(Lmh;)V"
	)
	class348(class349 var1) {
		this.field4211 = 0; // L: 177
		this.field4210 = this.field4209.field4214; // L: 178
		this.field4209 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4211 < this.field4209.field4216; // L: 186
	}

	public Object next() {
		if (this.field4209.field4214 != this.field4210) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4211 < this.field4209.field4216) { // L: 193
			Object var1 = this.field4209.field4212[this.field4211].field4204; // L: 194
			++this.field4211; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcf;B)V",
		garbageValue = "-24"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		AbstractWorldMapData.runScript(var0, 500000, 475000); // L: 117
	} // L: 118
}
