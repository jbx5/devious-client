import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class1 implements Callable {
	@ObfuscatedName("be")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 1938284921
	)
	static int field3;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	final Buffer field1;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lat;Lvf;Lam;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod9(this.field1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "408900827"
	)
	static void method6(ArrayList var0, boolean var1) {
		if (!var1) {
			class334.field3619.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class334.field3619.add(var3);
				}

				class334.field3621.add(var3);
			}
		}

	}
}
