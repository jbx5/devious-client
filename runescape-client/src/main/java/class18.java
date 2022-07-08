import net.runelite.mapping.ObfuscatedName;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("l")
class class18 implements Comparator {
	@ObfuscatedName("fm")
	@ObfuscatedGetter(intValue = 872496551)
	@Export("js5Port")
	static int js5Port;

	@ObfuscatedName("jt")
	@ObfuscatedGetter(intValue = 437863053)
	@Export("cameraX")
	static int cameraX;

	@ObfuscatedSignature(descriptor = "Ls;")
	final class10 this$0;

	@ObfuscatedSignature(descriptor = "(Ls;)V")
	class18(class10 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I", garbageValue = "-175722815")
	int method233(Entry var1, Entry var2) {
		return ((Float) (var2.getValue())).compareTo(((Float) (var1.getValue())));
	}

	public int compare(Object var1, Object var2) {
		return this.method233(((Entry) (var1)), ((Entry) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIB)Lbr;", garbageValue = "123")
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		return var2.getMessage(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-80")
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) {
			if (KeyHandler.field127 == KeyHandler.field147) {
				return false;
			} else {
				class272.field3196 = KeyHandler.field148[KeyHandler.field147];
				HealthBar.field1258 = KeyHandler.field149[KeyHandler.field147];
				KeyHandler.field147 = KeyHandler.field147 + 1 & 127;
				return true;
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-15")
	static final boolean method234() {
		return Client.isMenuOpen;
	}
}