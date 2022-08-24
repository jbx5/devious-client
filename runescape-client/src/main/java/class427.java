import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.util.Arrays;
@ObfuscatedName("pe")
class class427 implements Iterator {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1289417949)
	int field4640;

	@ObfuscatedSignature(descriptor = "Lpp;")
	final class428 this$0;

	@ObfuscatedSignature(descriptor = "(Lpp;)V")
	class427(class428 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field4640 < this.this$0.method7011();
	}

	public Object next() {
		int var1 = ++this.field4640 - 1;
		class394 var2 = ((class394) (this.this$0.field4645.get(((long) (var1)))));
		return var2 != null ? var2 : this.this$0.method7446(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1897258636")
	public static void method7443() {
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field139 = KeyHandler.field141;
			KeyHandler.field136 = 0;
			KeyHandler.field138 = 0;
			Arrays.fill(KeyHandler.field128, false);
			Arrays.fill(KeyHandler.field126, false);
			if (KeyHandler.field132 < 0) {
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
				KeyHandler.field132 = KeyHandler.field149;
			} else {
				while (KeyHandler.field149 != KeyHandler.field132) {
					int var1 = KeyHandler.field130[KeyHandler.field149];
					KeyHandler.field149 = KeyHandler.field149 + 1 & 127;
					if (var1 < 0) {
						var1 = ~var1;
						if (KeyHandler.KeyHandler_pressedKeys[var1]) {
							KeyHandler.KeyHandler_pressedKeys[var1] = false;
							KeyHandler.field126[var1] = true;
							KeyHandler.field137[KeyHandler.field138] = var1;
							++KeyHandler.field138;
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field136 < KeyHandler.field135.length - 1) {
							KeyHandler.field128[var1] = true;
							KeyHandler.field135[++KeyHandler.field136 - 1] = var1;
						}
						KeyHandler.KeyHandler_pressedKeys[var1] = true;
					}
				} 
			}
			if (KeyHandler.field136 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}
			KeyHandler.field141 = KeyHandler.field133;
		}
	}
}